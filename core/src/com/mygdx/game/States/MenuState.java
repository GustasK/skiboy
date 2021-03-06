package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by User on 2/20/2018.
 */

public class MenuState extends State {

    public MenuState(GameStateManager gameStateManager) {
        super(gameStateManager);
    }

    public void handleInput() {
        if(Gdx.input.justTouched()) {
            gameStateManager.push(new PlayState(gameStateManager));
        }
    }

    public void update(float dt) {

    }

    public void render(SpriteBatch sb) {

    }
}
