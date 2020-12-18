package com.task.phonebook;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private MenuAction [] actions;
    Scanner in;

    public Menu(Scanner in) {
        this.actions = new MenuAction[0];
        this.in = in;
    }

    public Menu(MenuAction[] actions, Scanner in) {
        this.actions = actions;
        this.in = in;
    }

    public void addAction (MenuAction action) {
        actions = Arrays.copyOf(actions,actions.length+1);
        actions[actions.length-1] = action;
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = getMenuIndexForUser();
            if (!validateMenuIndex(choice)) {
                System.out.println("Invalid input");
                continue;
            }
            actions[choice].doAction();
            if (actions[choice].closeAfter()) break;
        }
    }

    private boolean validateMenuIndex(int choice) {
        return choice>=0 && choice<actions.length;
    }

    private int getMenuIndexForUser() {
        System.out.println("Enter your choice: ");
        int ch = in.nextInt();
        in.nextLine();
        return ch - 1;
    }

    private void showMenu() {
        for (int i = 0; i < actions.length; i++) {
            System.out.printf("%2d - %s\n",i+1,actions[i].getName());
        }
    }
}
