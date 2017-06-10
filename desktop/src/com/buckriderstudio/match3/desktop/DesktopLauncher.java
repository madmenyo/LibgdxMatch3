package com.buckriderstudio.match3.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.buckriderstudio.match3.Match3;

public class DesktopLauncher {
	public static void main (String[] arg) {

		packGems();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1080 / 2;
		config.height = 1920 / 2;
		new LwjglApplication(new Match3(), config);
	}

	private static void packGems()
	{
		TexturePacker.Settings settings = new TexturePacker.Settings();

		String input = "../../images/gems";
		String output = "gems";

		TexturePacker.process(settings,input,output, "gems");
	}
}
