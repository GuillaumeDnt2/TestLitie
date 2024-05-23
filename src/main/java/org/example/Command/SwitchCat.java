package org.example.Command;

import org.example.Game.GameController;

public class SwitchCat extends Command {

    @Override
    public void execute() {
        oldState = GameController.getInstance().state().save();
        GameController.getInstance().state().switchCatVisibility();
        history.add(this);
    }

    @Override
    public Command undo() {
        while (history.getLast() != this) {
            history.removeLast();
        }
        GameController.getInstance().setState(oldState);
        history.removeLast();

        if(history.size() > 0){
            return history.getLast();
        } else {
            return null;
        }
        
    }
    
}
