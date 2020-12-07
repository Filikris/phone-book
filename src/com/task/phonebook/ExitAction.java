package com.task.phonebook;

public class ExitAction implements MenuAction{
    @Override
    public void doAction() {

        }

    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }
}
