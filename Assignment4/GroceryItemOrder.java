// This class stores information about a single grocery item being ordered.
//By William Mentzer for CS 142
public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
        //Constructs a new GroceryItemOrder to store the name quantity and price of the ItemOrder
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public void setQuantity(int quantity) {
        //Sets new quantity
        this.quantity = quantity;
    }

    public double getCost() {
        //Returns this GroceryItemOrder's total cost, which will be the number of items multiplied by the cost of each item.
        double tempCost = quantity * pricePerUnit;
        return tempCost;
    }

    public String toString() {
        /*
            Returns a String representation of this GroceryItemOrder specifying the item's name and quantity.
            If the GroceryItemOrder is for 4 yogurts each costing $2.50, then this method should produce 
            4 of yogurt
         */
        String tempString = quantity + " of " + name;
        return tempString;
    }

}
