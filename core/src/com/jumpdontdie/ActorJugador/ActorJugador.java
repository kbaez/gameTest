package com.jumpdontdie.ActorJugador;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Karii on 07/02/2017.
 */

public class ActorJugador extends Actor {

    public Texture jugador;

    private boolean alive;

    public ActorJugador(Texture jugador){
        this.jugador = jugador;
        this.alive = true;
        setSize(jugador.getWidth(), jugador.getHeight());
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(jugador, getX(), getY());
    }
}
