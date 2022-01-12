package com.company;

public enum RestaurantMenu {
    // Create an Enum to model a restaurant menu.
    // They offer 3 categories of items: appetizer, main course & dessert.
    // Appetizer: steamed prawns and cafe latte.
    // Main course: continental rice and deep fried chicken.
    // Dessert: cupcakes and milk chocolate ice cream.
    // Use your main method to output the result.

    APPETIZER("Steamed Rice", "Cafe Latte"),
    MAIN("Continental Rice", "Deep Fried Chicken"),
    DESSERT("Cupcakes", "Milk Chocolate Ice Cream");

    private final String firstItem;
    private final String secondItem;

    RestaurantMenu(String firstItem, String secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public String getFirstItem() {
        return firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }

}
