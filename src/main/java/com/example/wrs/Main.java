package com.example.wrs;

public class Main { 
  int x; 
 
  // Constructor with a parameter
  public Main(int x) { 
    x = x + 5;
    this.x = x + 3;
    System.out.println("Value of parameter x = " + x);
  } 

  // Call the constructor
  public static void main(String[] args)  { 
    System.out.println("Running Main.main()");

    Main myObjOne = new Main(5); 
    System.out.println("Value of myObjOne.x = " + myObjOne.x);
    
    Main myObjTwo = new Main(15);
    System.out.println("Value of myObjTwo.x = " + myObjTwo.x);
    
  } 
} 
