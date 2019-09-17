/* Author: Basima Zafar
 * 
 * : Janurary 20th, 2017
 */

import java.io.*;
import java.util.*;

public class infoTester
{
  public static void main (String args[]) throws IOException
  {
    Scanner kbReader = new Scanner (System.in); // Scanner object allows the programmer to access what the user enters and store it in a variable 
    int choice=1; // Makes the variable choice equal to 1, so that the prompt in the while loop will print because it is false
    
    File file = new File ("info.txt"); // Creates a file call "info.txt", which is stored in the same directory
    
  if (file.exists()) // the file.exists() is a method which checks if the file already exists,if it returns true then the file already exists and it does not
   {                 // create the file
     System.out.println ("File already exists! Please save and delete your info.txt file and try again!"); // Outputs to the user to delete the file so that new information can be stored
    }
   else 
    {
      try //a try block allows you to attempt to run the code 
      {
      file.createNewFile(); // returns true if the file name does not exists and continues to create the file 
      }
      catch (Exception e) // catches the error 
      {
       e.printStackTrace(); // printStackTrack() - where exception occurs
     }
      
  infoMethods info = new infoMethods(); // creates an object called "info" which allows you to interact with methods
 info.fileReader (file); // using the info object to call the fileReader method and passing a file type argument
    

while(choice!=0) // returns true, proceeds to print prompt
{
    System.out.println ("-----Main Menu-----");
    System.out.println ("0. Exit the program");
    System.out.println ("1. Add information for a day");
    System.out.println ("2. View information for a day");
    System.out.println ("3. View information for a week");
    System.out.println ("4. Calculate estimated pay for one day");
    System.out.println ("5. Calculate estimated pay for a week");
    System.out.println ("6. View emergancy contact");
    System.out.println ("Please make a selection in integer form: ");


 while (!kbReader.hasNextInt()) // to catch if the user enters anything BUT an int, returns true and proceeds to the prompt and asks user to print again
 {
   String trash = kbReader.next();
   System.out.println ("Please enter an integer between 0 and 6!");
 }
 choice = kbReader.nextInt(); // user inputs 
  if (choice == 0) // choice is based off the user inputs, if choice 0 is chosen ---> exit the program
  {
    System.out.println ("Thank you for using this program! Remember to save your file and delete it before you use this program again!"); // reminds user to prepare for the next time the user runs the program
  }
  else if (choice ==1) // if choice 1 is choosen ----> adds information
  {
    info.addInfo(); // calls the method 
  }
  else if (choice ==2) // if choice 2 is choosen -----> views the information by day
  {
    info.viewDayInfo();
  }
  else if (choice==3) // if choice 3 is choosen -----> views all the information entered
  {
    info.viewWeekInfo();
  }
  else if (choice ==4) // if choice 4 is choosen -----> calculates the estimated pay for a day 
  {
    info.estimatedDayPay();
  }
  else if (choice == 5) // if choice 5 is choosen ------> calculates estimated pay for a week
  {
    info.estimatedWeekPay();
  }
  else if (choice == 6)
  {
    info.emergancyContactAdd();
  }



  else // catches if the user enters a number out of range, for example if the user enters 10, it would come here and print the prompt out and run again o.
  {
    System.out.print("Please enter a number ranging between 0 and 6!");
  }
  }
                        
}

}
}

  

    
    
    