package com.siby.designpatterns.behavioural.chainofresponsibility;

import com.siby.designpatterns.behavioural.command.Command;

public class CommandAProcessor extends CommandProcessor {

    public CommandProcessor nextCommandProcessor() {
        return new CommandBProcessor();
    }

    public boolean processedInternally(Command command) {
        if (command instanceof CommandA) {
            System.out.println("Processing command A");
            return true;
        } else {
            return false;
        }
    }
}
