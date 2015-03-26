package com.project.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.project.Entity;

public class GameClient implements ApplicationListener {

    Entity entity;

    SpriteBatch batch;

    @Override
    public void create () {
        entity = new Entity();
        batch = new SpriteBatch();
    }

    @Override
    public void dispose () {
        batch.dispose();
    }

    @Override
    public void pause () {
    }

    @Override
    public void resume () {
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();

        batch.end();
    }

    @Override
    public void resize (int width, int height) {
    }

}
