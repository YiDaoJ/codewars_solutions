/*
Description:
Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.
Example:
GreetMe.greet("riley"); // returns "Hello Riley!"
*/

public class GreetMe{
  public static String greet(String name){
  
    String greeting;
    greeting = "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
  
    return greeting;
    
  }
}
