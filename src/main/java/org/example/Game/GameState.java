package org.example.Game;

import java.awt.image.BufferedImage;
import org.example.Entity.*;

import de.gurkenlabs.litiengine.resources.Resources;

public class GameState {
    
    private Cat cat;

    public GameState() {
        BufferedImage bi = Resources.images().get("sprites/bg.jpeg");
        cat = new Cat(0, bi, true);
    }

    public GameState(Cat cat){
        this.cat = new Cat(cat.x(), cat.image(), cat.isVisible());
    }

    public GameState(GameState other){
        this(other.cat);
    }
    
    public void switchCatVisibility(){
        cat.switchVisibility();
    }

    public GameState save(){
        return new GameState(this);
    }

    public Cat cat(){
        return cat;
    }
}
