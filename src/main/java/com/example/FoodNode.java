/*
Anika Krieger
Oct 17
Linked List
Description: Learning Linked Lists in CRCPIII - FoodNode class
 */

 package main.java.com.example;

 public class FoodNode {
    //defining attributes
    private String foodName;
    private FoodNode nextFood;
 
    //constructor
    public FoodNode(String foodName) 
    {
     //
     this.foodName = foodName;
     this.nextFood = null;
    }
 
    //getter for foodname
    public String getFoodName() 
    {
     return foodName;
    }
 
    //setter for foodname
    public void setFoodName(String foodName)
    {
     this.foodName = foodName;
    }
 
    //getter for next food
    public FoodNode getNextFood() 
    {
     return nextFood;
    }
 
    //setter for next food
    public void setNextFood(FoodNode nextFood)
    {
     this.nextFood = nextFood;
    }
 }
 