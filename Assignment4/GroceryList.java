// This class keeps track of a grocery list of items
//By William Mentzer for CS 142
public class GroceryList {
    private GroceryItemOrder[] items;
    private int numItems;

    public GroceryList() {
        //Constructs a new array of FroceryItemOrder for GroceryList representing a list of GroceryItemOrder objects.

        this.items = new GroceryItemOrder[5];
        this.numItems = 0;
    }

    public boolean add(GroceryItemOrder item) {
        /*
        If there is space available in the array then this will add the GroceryItemOrder parameter to the next available space in the array inside this GroceryList object
        and return true.
        If the array is already full then this will leave the array unchanged and return false.
        Note: there are no methods to remove items from the GroceryList, so once an item has been added then it's permanently part of the list.
        */

        if(items[4] == null && numItems < 5){
            items[numItems] = item;
            numItems++;
            // for (int i = 0; i < 5; i++) {
            //     if(items[i] == null){
            //         items[i] = item;
            //     }
            // }
            return true;
        } else{
            return false;
        }
    }

    public double getTotalCost() {
        //Returns the total cost of all the items in the list.
        //If there are no items in the list then this should return 0
        double tempTotalCost = 0.0;
        if(numItems > 0){
            for (int i=0; i < numItems; i++){
                tempTotalCost += items[i].getCost();
            }
        }
        return tempTotalCost;

    }

    public String toString() {
        /*
        Returns a single string listing all the items in the GroceryList.
        It should do this by making use of the GroceryItemOrder.toString() method, 
        and by placing each item's description on a separate line.
        For example, if the GroceryList contained 1 "Apple", 7 "Banana" and 3 "Orange" grocery items then it should produce the following output:
        1 of Apple
        7 of Banana
        3 of Orange
         */
        String tempString = "";
        for (int i = 0; i < numItems; i++) {
            tempString += " " + items[i].toString();
        }
        return tempString;
    }

}
