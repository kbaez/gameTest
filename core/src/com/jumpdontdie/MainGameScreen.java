package com.jumpdontdie;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.jumpdontdie.ActorJugador.ActorJugador;
import com.jumpdontdie.ActorJugador.ActorPiedra;

/**
 * Created by Karii on 07/02/2017.
 */

public class MainGameScreen extends  BaseScreen {

    public MainGameScreen(MainGame game){
        super(game);
        texturaJugador = new Texture("minigato.jpg");
        texturaPiedra = new Texture("piedra.png");
        regionPiedra = new TextureRegion(texturaPiedra, 0, 64, 128,64);
    }

    private Stage stage;

    private ActorJugador jugador;

    private ActorPiedra piedra;

    private Texture texturaJugador, texturaPiedra;

    private TextureRegion regionPiedra;

    @Override
    public void show() {
        stage = new Stage();
        stage.setDebugAll(true);
        jugador = new ActorJugador(texturaJugador);
        piedra = new ActorPiedra(regionPiedra);
        stage.addActor(jugador);
        stage.addActor(piedra);

        jugador.setPosition(20,100);
        piedra.setPosition(500,100);
    }

    @Override
    public void hide() {
        stage.dispose();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.4f,0.5f,0.8f,1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        comprobarColisiones();
        stage.draw();
    }

    private void comprobarColisiones(){
        if(jugador.isAlive() && jugador.getX() + jugador.getWidth() > piedra.getX()){
            System.out.println("Colisión");
            jugador.setAlive(false);
        }
    }
    @Override
    public void dispose() {
        texturaJugador.dispose();
    }
}
