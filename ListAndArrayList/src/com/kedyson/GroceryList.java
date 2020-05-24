package com.kedyson;

import java.util.ArrayList;
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item); // this adds items to the groceryList of type String arrayList
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i)); // get() takes or gets the value of an item from its position in the arrayList
        }
    }

    public void modifyGroceryItem(int position, String item){
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " has been modified into " + item);
    }

    public void removeGroceryItem(int position){
//        String theItem = groceryList.get(position);
        groceryList.remove(groceryList.get(position));
    }

    public String findItem(String searchItem){
//        int value = groceryList.indexOf(searchItem);
//        boolean exist = groceryList.contains(searchItem);
//        if(exist == true){
//            return groceryList.get(value);
//        }
//        else{
//            return null;
//        }

        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        else{
            return null;
        }
    }
}
