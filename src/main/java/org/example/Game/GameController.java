package org.example.Game;

import org.example.Command.Command;
import org.example.Command.SwitchCat;

public class GameController {

    private static GameController instance;
    private Command lastCommand;


    private GameController(){
        gameState = new GameState();
    }
    private GameState gameState;

    public static GameController getInstance(){
        if(instance == null){
            instance = new GameController();
        }

        return instance;
    }

    public GameState state(){
        return gameState;
    }

    public void setState(GameState state){
        instance.gameState = state;
    }

    public void onClick(){
        SwitchCat command = new SwitchCat();
        command.execute();
        lastCommand = command;
    }

    public void undoLastCommand(){
        if(lastCommand != null){
            lastCommand = lastCommand.undo();
        }
    }
    
}
