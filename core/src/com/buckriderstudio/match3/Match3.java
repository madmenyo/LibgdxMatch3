package com.buckriderstudio.match3;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Match3 extends Game {
	SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();

		Assets assets = new Assets();
		assets.loadAssets();
		assets.getAssetManager().finishLoading();

		setScreen(new PlayScreen(batch, assets.getAssetManager()));
	}
}
