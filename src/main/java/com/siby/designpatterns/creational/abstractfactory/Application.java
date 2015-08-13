package com.siby.designpatterns.creational.abstractfactory;

public class Application {
    private static String OS = System.getProperty("os.name").toLowerCase();
    public static void main(String... args) {
        GuiFactory guiFactory = new Application().getGuiFactory();
        guiFactory.createButton().paint();
        guiFactory.createTextBox().paint();
    }

    private GuiFactory getGuiFactory() {
        if (OS.contains("windows")) {
            return new WinGuiFactory();
        }
        if (OS.contains("unix")) {
            return new UnixGuiFactory();
        }
        throw new UnsupportedOperationException("Unsupported OS");
    }
}
