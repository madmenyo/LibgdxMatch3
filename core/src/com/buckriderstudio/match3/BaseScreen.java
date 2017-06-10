package com.buckriderstudio.match3;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

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

public abstract class BaseScreen implements Screen {

	protected SpriteBatch batch;
	protected Stage stage;
	protected Viewport viewport;

	protected InputMultiplexer inputMultiplexer;

	protected AssetManager assetManager;

	public BaseScreen(SpriteBatch batch, AssetManager assetManager) {
		this.batch = batch;
		this.assetManager = assetManager;

		viewport = new FitViewport(1080, 1920);
		stage = new Stage(viewport, batch);

		inputMultiplexer = new InputMultiplexer(stage);
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(inputMultiplexer);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(.3f, .34f, .4f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}

	@Override
	public void resize(int width, int height) {
		viewport.setScreenBounds(0, 0, width, height);
		viewport.apply();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
	}
}
