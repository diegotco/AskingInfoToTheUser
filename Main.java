
/*This is an exercise suggested by Angie Jones at her Java Course here: https://testautomationu.applitools.com/java-programming-course/chapter2.html */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Asking for an adjetive
    System.out.println("Enter an adjetive that comes to your mind right now:");
    Scanner scanner = new Scanner(System.in);
    String adjetive = scanner.next();
    
    //Asking for the season of the year
    System.out.println("Thank you, now enter the current season of the year:");
    String season = scanner.next();
   
    //Asking for the numbers of cups of coffee
    System.out.println("Thank you, finally enter the number of cups of coffee that you like to drink righ now:");
    int cups = scanner.nextInt();
    scanner.close();

    System.out.println(
        "On a " + adjetive + " " + season + 
        " day, I drink a minimum of " + cups + 
        " cups of coffee");

  }
}