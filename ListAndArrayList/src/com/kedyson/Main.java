package com.kedyson;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here
        printInstructions();
        boolean quit = false;
        int choice = 0;
        while(!quit){
            System.out.print("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 -- To print choice options");
        System.out.println("\t 1 -- To print the list of grocery items");
        System.out.println("\t 2 -- To add item to the list");
        System.out.println("\t 3 -- To modify an item in the list");
        System.out.println("\t 4 -- To remove an item from the list");
        System.out.println("\t 5 -- To search for an item in the list");
        System.out.println("\t 6 -- To quit application");
    }

    public static void addItem(){
        System.out.print("Please Enter the grocery item ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number : ");
        int itemNUmber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNUmber-1, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item position ");
        int position = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(position - 1);
    }

    public static void searchItem(){
        System.out.print("Enter item to search: ");
        String findItem = scanner.nextLine();
        if(groceryList.findItem(findItem) != null){
            System.out.println("Found " + findItem + " in our grocery list");
        }
        else{
            System.out.println(findItem + " was not found");
        }
    }
}
