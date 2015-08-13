package com.siby.designpatterns.creational.abstractfactory;

public class UnixGuiFactory implements GuiFactory {
    public Button createButton() {
        return new UnixButton();
    }

    public TextBox createTextBox() {
        return new UnixTextBox();
    }
}
