package com.siby.designpatterns.behavioural.chainofresponsibility;

import com.siby.designpatterns.behavioural.command.Command;

public class CommandCProcessor extends CommandProcessor {

    public CommandProcessor nextCommandProcessor() {
        return null;
    }

    public boolean processedInternally(Command command) {

        if (command instanceof CommandC) {
            System.out.println("Processing command C");
            return true;
        } else {
            return false;
        }
    }
}
