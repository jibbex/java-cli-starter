package de.michm.cli;

import de.michm.menu.AssmusMenu;
import de.michm.menu.MenuOption;

import java.io.BufferedReader;
import java.rmi.AlreadyBoundException;

public class App extends AssmusMenu {

    public App(String title) throws AlreadyBoundException {
        super(title);
    }

    @MenuOption(name = "Info", pattern = "i")
    public void showInfo() {
        for (int i = 0; i < 5; i++) {
            try {
                clear();

                System.out.println("\n (⌐■_■)");
                Thread.sleep(500);

                clear();

                System.out.println("\n ( •_•)>⌐■-■");
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @MenuOption(name = "Quit", pattern = "q")
    private boolean quit() {
        System.out.println("\n\tbye, bye ...\n");
        return false;
    }
}
