package com.buckriderstudio.match3.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.buckriderstudio.match3.Match3;

public class DesktopLauncher {
	public static void main (String[] arg) {

		packTextures();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Match3(), config);
	}

	private static void packTextures()
	{
		TexturePacker.Settings settings = new TexturePacker.Settings();

		String input = "../../images/gems";
		String output = "gems";

		TexturePacker.process(settings,input,output, "gems");
	}
}
