package com.rybad.libgdx.bludbourne.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application;
import com.rybad.libgdx.bludbourne.BludBourne;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new BludBourne(), config);

        config.title = "BludBourne";
        config.useGL30 = false;
        config.width = 800;
        config.height = 600;

        Application app = new LwjglApplication();

        Gdx.app = app;
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
    //    Gdx.app.setLogLevel(Application.LOG_ERROR);
    //    Gdx.app.setLogLevel(Application.LOG_INFO);
    //    Gdx.app.setLogLevel(Application.LOG_NONE);
	}

}
