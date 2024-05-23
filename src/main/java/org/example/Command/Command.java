package org.example.Command;

import java.util.LinkedList;
import java.util.List;

import org.example.Game.GameState;

public abstract class Command {
    
    protected GameState oldState;
    protected static List<Command> history = new LinkedList<>();

    public Command() {}

    public abstract void execute();
    public abstract Command undo();
}
