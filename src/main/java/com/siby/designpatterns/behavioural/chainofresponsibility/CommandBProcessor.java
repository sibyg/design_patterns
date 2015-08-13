package com.siby.designpatterns.behavioural.chainofresponsibility;

import com.siby.designpatterns.behavioural.command.Command;

public class CommandBProcessor extends CommandProcessor {


    public CommandProcessor nextCommandProcessor() {
        return new CommandCProcessor();
    }

    public boolean processedInternally(Command command) {

        if (command instanceof CommandB) {
            System.out.println("Processing command B");
            return true;
        } else {
            return false;
        }
    }

}
