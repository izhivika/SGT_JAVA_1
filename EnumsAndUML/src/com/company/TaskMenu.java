package com.company;

public enum TaskMenu {

    FILE("New", "Open", "Open Recent"),
    EDIT("Cut", "Copy", "Copy Path"),
    VIEW("Quick Definition", "Show Siblings", "Quick Type Definition");

    private final String firstItem;
    private final String secondItem;
    private final String thirdItem;

    TaskMenu(String firstItem, String secondItem, String thirdItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
    }

    public String getFirstItem() {
        return firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }

    public String getThirdItem() {
        return thirdItem;
    }
}



