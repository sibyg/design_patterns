package com.siby.designpatterns.behavioural.chainofresponsibility;

import com.siby.designpatterns.behavioural.command.Command;

import java.util.Arrays;
import java.util.List;

public class ChainOfResponsibility {
    public static void main(String... args) {
        List<Command> commands = Arrays.asList(new CommandA(), new CommandB(), new CommandC());
        CommandProcessor commandProcessor = new CommandAProcessor();
        for (Command command : commands) {
            commandProcessor.process(command);
        }
    }
}
