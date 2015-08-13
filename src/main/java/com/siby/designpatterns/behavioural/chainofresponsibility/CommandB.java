package com.siby.designpatterns.behavioural.chainofresponsibility;

import com.siby.designpatterns.behavioural.command.Command;

public class CommandB implements Command {
    public void execute() {
        System.out.println("Command B");
    }
}
