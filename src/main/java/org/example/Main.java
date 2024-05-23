package org.example;

import org.example.Game.GameController;

import java.awt.event.KeyEvent;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.configuration.DisplayMode;
import de.gurkenlabs.litiengine.input.Input;

/**
 * Contôle: "flèche gauche" et " flèche droite" pour déplacer l'image
 *          "clic gauche" pour afficher/cacher l'image
 *          "r" pour défaire la dernière commande (changement de visibilité => dernier clique gauche)
 */
public class Main {
    public static void main(String[] args) {
        Game.info().setName("Mon Jeu 2D");
        Game.info().setVersion("v1.0");

        Game.init(args);
        //Game.config().graphics().setDisplayMode(DisplayMode.BORDERLESS);
        Game.config().graphics().setDisplayMode(DisplayMode.WINDOWED);


        Input.keyboard().onKeyPressed(KeyEvent.VK_ESCAPE, (event) -> Game.exit());
        Input.keyboard().onKeyPressed(KeyEvent.VK_LEFT, event -> GameController.getInstance().state().cat().move(-2));
        Input.keyboard().onKeyPressed(KeyEvent.VK_RIGHT, event -> GameController.getInstance().state().cat().move(2));
        Input.keyboard().onKeyTyped(KeyEvent.VK_R, event -> GameController.getInstance().undoLastCommand());
        Input.mouse().onClicked((event) -> GameController.getInstance().onClick());

        //Trigger t = new Trigger(TriggerActivation., null)

          
        Game.screens().add(new MyScreen());
        Game.screens().display("MyScreen");
        

         // Lancer le jeu
         Game.start();

    }
}