package com.buckriderstudio.match3;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;
import java.util.List;

/**
 * Match3 [2017]
 * <p>
 * +-------------------------------------------------------------+
 * |Copyright Buckriderstudio, all rights reserved.              |
 * |                                                             |
 * |See license.txt for detail on the license.                   |
 * |                                                             |
 * +-------------------------------------------------------------+
 */

public class PlayScreen extends BaseScreen {

	private TextureAtlas gemAtlas;

	private final int gridOffset = 28;

	private Grid[][] gemGrid;

	private List<Gem> gemList = new ArrayList<Gem>();

	public PlayScreen(SpriteBatch batch, AssetManager assetManager) {
		super(batch, assetManager);

		gemAtlas = assetManager.get(Assets.GEMS);

		setGrid();
	}

	private void setGrid()
	{
		gemGrid = new Grid[8][12];

		for (int y = 0; y < gemGrid[0].length; y++)
		{
			for (int x = 0; x < gemGrid.length; x++)
			{
				Gem newGem = new Gem("blue", new Vector2(x * Gem.size, y * Gem.size));
				gemList.add(newGem);
				gemGrid[x][y] = new Grid(true, newGem);
			}
		}
	}

	@Override
	public void render(float delta) {
		super.render(delta);

		batch.setProjectionMatrix(viewport.getCamera().combined);
		batch.begin();

		for (Gem gem : gemList)
		{
			gem.draw(batch, gemAtlas);
		}

		batch.end();
	}
}
