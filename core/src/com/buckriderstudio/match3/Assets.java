package com.buckriderstudio.match3;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

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

public class Assets {
	private AssetManager assetManager = new AssetManager();

	public static final AssetDescriptor<TextureAtlas> GEMS =
			new AssetDescriptor<TextureAtlas>("gems/gems.atlas", TextureAtlas.class);

	public AssetManager getAssetManager() {
		return assetManager;
	}

	public void loadAssets()
	{
		assetManager.load(GEMS);
	}



}
