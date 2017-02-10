package com.jumpdontdie.ActorJugador;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Karii on 07/02/2017.
 */

public class ActorPiedra extends Actor {

    private TextureRegion piedra;

    public  ActorPiedra(TextureRegion piedra){
        this.piedra = piedra;
        setSize(piedra.getRegionWidth(),getHeight());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(piedra, getX(), getY());
    }

    //movimiento de la piedra
    @Override
    public void act(float delta) {
        setX(getX() - 250 * delta);
    }
}
