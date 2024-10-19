/*
Anika Krieger
Oct 17
Linked List
Description: Learning Linked Lists in CRCPIII - Main class
 */

 package main.java.com.example;

 public class Main {
     public static void main(String[] args) {
         GroceryLinkedList groceryList = new GroceryLinkedList();
 
         // Test 1: Add items in order and print list
         System.out.println("Test 1");
         groceryList.insertAtEnd(new FoodNode("milk"));
         groceryList.insertAtEnd(new FoodNode("bananas"));
         groceryList.insertAtEnd(new FoodNode("ice cream"));
         groceryList.insertAtEnd(new FoodNode("spinach"));
         groceryList.insertAtEnd(new FoodNode("chicken"));
         groceryList.print();
 
         // Test 2: Remove ice cream and print list
         System.out.println("Test 2");
         groceryList.remove("ice cream");
         groceryList.print(); 
 
         // Test 3: Remove chicken and print list
         System.out.println("Test 3");
         groceryList.remove("chicken");
         groceryList.print(); 
 
         // Test 4: Find spinach and print index, then print list
         System.out.println("Test 4");
         int index = groceryList.find("spinach");
         if (index != -1) {
             System.out.println("Spinach is number " + index + " in the grocery list.");
         } else {
             groceryList.insertAtEnd(new FoodNode("spinach"));
         }
         groceryList.print(); 
 
         // Test 5: Find eggs and print index, add if not found, then print list
         System.out.println("Test 5");
         index = groceryList.find("eggs");
         if (index != -1) {
             System.out.println("Eggs are number " + index + " in the grocery list.");
         } else {
             groceryList.insertAtEnd(new FoodNode("eggs"));
         }
         groceryList.print(); 
 
         // Test 6: Add onions at the beginning and print list
         System.out.println("Test 6");
         groceryList.insertAtStart(new FoodNode("onions"));
         groceryList.print(); 
 
         // Test 7: Add strawberries after bananas and print list
         System.out.println("Test 7");
         groceryList.insert("bananas", new FoodNode("strawberries"));
         groceryList.print(); 
     }
 }
 
 