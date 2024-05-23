package org.example;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import org.example.Entity.Cat;
import org.example.Game.GameController;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.entities.Entity;
import de.gurkenlabs.litiengine.graphics.ImageRenderer;
import de.gurkenlabs.litiengine.gui.screens.Screen;
import de.gurkenlabs.litiengine.input.Input;
import de.gurkenlabs.litiengine.resources.Resources;

public class MyScreen extends Screen {


    public MyScreen() {
        super("MyScreen");
        /* 
        image = Resources.images().get("sprites/bg.jpeg");
        Input.keyboard().onKeyPressed(KeyEvent.VK_LEFT, event -> {if(x > 0) x -= 2;});
        Input.keyboard().onKeyPressed(KeyEvent.VK_RIGHT, event -> {x+= 2;});
        Input.mouse().onClicked((event) -> GameController.getInstance().);
        */
    }

    @Override
    public void render(Graphics2D g) {
        Cat cat = GameController.getInstance().state().cat();
        if(cat != null && cat.image() != null && cat.isVisible()){
            ImageRenderer.render(g, cat.image(), cat.x(), 0); // more on this below
        }
    }
}