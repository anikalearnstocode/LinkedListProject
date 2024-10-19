/*
Anika Krieger
Oct 17
Project Name: Linked List
Description: Learning Linked Lists in CRCPIII - GroceryLinkedList class
 */

 package main.java.com.example;

 public class GroceryLinkedList {
     private FoodNode head; //head node of the list, points to the first item
 
     //constructor
     public GroceryLinkedList() {
         this.head = null; //initializes head to null to represent an empty list
     }
 
     //check if list is empty or not
     public boolean isEmpty() {
         return head == null; //if head is null, list is empty
     }
 
     //insert node at start of list!
     public void insertAtStart(FoodNode node) {
         node.setNextFood(head); //new node points to current head
         head = node; //new node becomes head
     }
 
     //insert node at end of list
     public void insertAtEnd (FoodNode node) { 
         if (isEmpty()) // if list is empty, new node becomes the head
         {
             head = node;
         }
         else {
             FoodNode temp = head; //start from the head
             while (temp.getNextFood() != null)
             {
                 temp = temp.getNextFood(); //keep moving to next node
             }
             temp.setNextFood(node); //set new node at end
         }
     }
 
     //insert node at specific index
     public void insert(int index, FoodNode node) {
         if (index == 0) // if index is 0, insert at the start
         {
             insertAtStart(node);
         }
         else {
             FoodNode temp = head;
             // loop until we reach position before desired index
             for (int i = 0; i < index - 1 && temp!= null; i++)
             {
                 temp = temp.getNextFood();
             }
             if (temp != null)  //check position - whether or not we're at a valid position
             {
                 node.setNextFood(temp.getNextFood()); //new node points to current node's next
                 temp.setNextFood(node); //current node points to new node
             }
             else {
                 System.out.println("Index out of bounds."); //index is too big
             }
         }
     }
 
     //insert after specific food
     public void insert(String food, FoodNode node) {
         int index = find(food); //find index of food
         if (index != -1) //if food found, insert after it
         {
             insert(index + 1, node);
         }
         else {
             System.out.println("Food not found!");
         }
     }
 
     //find index of food item in list
     public int find(String food) {
         FoodNode temp = head; //start from head position
         int index = 0; //counting mechanism to track position
         while (temp != null) 
         {
             if (temp.getFoodName().equals(food)) //if food matches, return index #
             {
                 return index;
             }
             temp = temp.getNextFood();
             index++;
         }
         return -1; //if the food is not found
     }
 
     //remove specific food from list
     public void remove(String food) {
         if (isEmpty()) //if list is empty, notbing to remove
         {
             System.out.println("List is empty.");
             return;
         }
 
         if (head.getFoodName().equals(food)) 
         {
             head = head.getNextFood();
             return;
         }
 
         FoodNode temp = head;
         // traverse list until food is found or program reaches the end
         while (temp.getNextFood() != null && !temp.getNextFood().getFoodName().equals(food)) 
         {
             temp = temp.getNextFood();
         }
 
         if (temp.getNextFood() != null) 
         {
             temp.setNextFood(temp.getNextFood().getNextFood());
         } 
         else {
             System.out.println("Food not found.");
         }
     }
 
     //print all items in list
     public void print()
  {
         if (isEmpty()) //if list is empty. print message
         {
             System.out.println("The list is empty.");
         }
         else{
             FoodNode temp = head;
             //print each food item
             while (temp != null)
             {
                 System.out.println(temp.getFoodName() + " "); //print current food
                 temp = temp.getNextFood(); //move to next node
             }
         }
     } 
 }