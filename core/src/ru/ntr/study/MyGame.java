package ru.ntr.study;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGame extends ApplicationAdapter {
	private TextureAtlas atlas;
	private TextureRegion cursorTexture;
	private SpriteBatch batch;
	private GameController gameController;
	private BitmapFont font;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();

	}

	@Override
	public void render () {
		float dt = Gdx.graphics.getDeltaTime();
		//gameController.update(dt);

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//gameController.getGameMap().render(batch);
		//gameController.getHero().render(batch);
		//gameController.getMonsterController().render(batch);

		batch.setColor(1,1,1,0.5f);
		//batch.draw(cursorTexture, gameController.getCursorX() * GameMap.CELL_SIZE, gameController.getCursorY() * GameMap.CELL_SIZE);
		batch.setColor(1,1,1,1);

		//font.draw(batch, "Skill: " + gameController.getHero().getSkill(), 10, 710);

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		atlas.dispose();
	}
}
