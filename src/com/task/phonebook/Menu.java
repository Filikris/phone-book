package com.task.phonebook;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private MenuAction [] actions = new MenuAction[0];
    Scanner in;

    public Menu(Scanner in) {
        this.in = in;
    }

    public void addAction (MenuAction action) {
        actions = Arrays.copyOf(actions,actions.length+1);
        actions[actions.length-1] = action;
    }

    public void run() {
        while (true) {
            for (int i = 0; i < actions.length; i++) {
                System.out.print((i + 1) + " -");
                System.out.println(actions[i].getName());
            }

            System.out.println("Enter your choice: ");
            int ch = in.nextInt();
            in.nextLine();

            int index = ch - 1;

            if (index >= 0 && index < actions.length) {
                actions[index].doAction();
                if(actions[index].closeAfter()) break;
            }



        }
    }
}
