package com.buckriderstudio.match3;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;

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

public class Gem {

	private String color;
	private Vector2 position;
	private Vector2 destination;

	public static int size = 128;

	public Gem(String color, Vector2 position) {
		this.color = color;
		this.position = position;
	}

	public void update(Grid[][] gemGrid)
	{

	}

	public void draw(SpriteBatch batch, TextureAtlas gemAtlas)
	{
		batch.draw(gemAtlas.findRegion(color), position.x, position.y, size, size);
	}
}
