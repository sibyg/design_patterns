package com.siby.designpatterns.creational.abstractfactory;

public class WinGuiFactory implements GuiFactory {
    public Button createButton() {
        return new WinButton();
    }

    public TextBox createTextBox() {
        return new WinTextBox();
    }
}
