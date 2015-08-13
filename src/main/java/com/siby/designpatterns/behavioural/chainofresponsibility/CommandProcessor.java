package com.siby.designpatterns.behavioural.chainofresponsibility;

import com.siby.designpatterns.behavioural.command.Command;

public abstract class CommandProcessor {

    abstract CommandProcessor nextCommandProcessor();

    abstract boolean processedInternally(Command command);

    // you can pass a list of commands as well
    public void process(Command command) {

        if (!processedInternally(command) && nextCommandProcessor() != null) {
            nextCommandProcessor().process(command);
        }
    }

}
