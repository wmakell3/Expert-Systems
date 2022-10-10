
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class RODandMAKELLExpertSystem
{

   public static void main(String[] args)
   {
   
   String fitGoals; 
   int calCount;
   String breakfast;
   int numMeals;
   String waterIntake;
   String phyActLevel;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Welcome to the Health and Wellness Evaluator!");
   
   System.out.println("We will ask you a handful of questions pertaining to your current diet/fitness, your goals, and make recommendations for your use.");
   
   System.out.println("What are your fitness/physique goals. Selction from Options: ");
   System.out.println("A.Simply Lose Weight  B.Lose weight while building muscle C.Gain with via clean a clean bulk"); 
   
   fitGoals = keyboard.nextLine();
   
   while(!fitGoals.equalsIgnoreCase("A") && !fitGoals.equalsIgnoreCase("B") && !fitGoals.equalsIgnoreCase("C"))
   {
      System.out.println("Invalid Input: Please Select from A,B, or C. ");
      fitGoals = keyboard.nextLine();

   }//end of while 
   
   System.out.println("Fitgoals: "+fitGoals);
   
   
   System.out.println("What is your average daily calorie intake? Give estimate. If unsure, enter -1"); 
   
   calCount = keyboard.nextInt();
   System.out.println("calCount: "+calCount);
   
      while(calCount < -1 || calCount > 3000)
   {
      System.out.println("Invalid Input: Please enter an estimate of your daily calorie, or enter -1 to specify you do not. ");
      calCount = keyboard.nextInt();

   }//end of while 
   
   System.out.println("Do typically you skip breakfast?");
   keyboard.nextLine();
   breakfast = keyboard.nextLine();
   System.out.println("Breakfast: "+breakfast);
   
   System.out.println("How many meals do you eat a day");
   
   numMeals = keyboard.nextInt();
   System.out.println("numMeals: "+numMeals);
   
   System.out.println("What is your water intake? Choose from options: ");
   System.out.println("A.Very Little B.Average Amount C.Alot");
   
   keyboard.nextLine();
   
   waterIntake = keyboard.nextLine();
   System.out.println("waterIntake: "+waterIntake);
   
   System.out.println("What is your current level of physical activity? Choose from options");
   System.out.println("A.Low: No planned workouts, rarely walk, usually sitting down. B.Moderately Low:Some excerise, may go for occasional walks from time to time.");
   System.out.println("C.Moderate:Some excersize throughout the week. Hitting at least 3 workouts within a 7 day period, whether weightlifting or cardio of some sort.");
   System.out.println("D.Moderately High: At least 5 workout sessions in a 7 day period. E.High: 5+ Sessions a weeks. Some days might include working out twice a day. Individual may be a high level athlete.");
   
   phyActLevel = keyboard.nextLine();
   System.out.println("phyActLevel: "+phyActLevel);
   
   System.out.println("\n\n");
   
   if(fitGoals.equalsIgnoreCase("a"))//if statment for fit goals
   {
      System.out.println("This is how you should loose weight.");
   }
   else if(fitGoals.equalsIgnoreCase("b"))
   {
      System.out.println("This is how you should loose weight while building muscle.");
   }
   else if(fitGoals.equalsIgnoreCase("c"))
   {
      System.out.println("This is how you should gain muscle with a clean bulk.");
   }
   
   
   
   if(calCount<2000)//if statments for Daily Calorie intake
   {
      System.out.println("Eat MORE. Take in more daily Calories");
   }
   else if(calCount<2500)
   {
      System.out.println("Your doing fine stay in this range.");
   }
   else if(calCount>2500)
   {
      System.out.println("Eat less. You are taking in too many calories.");
   }
   
   System.out.println("The average calorie intake for Women should be 2000 calories a day. \n" +
   "The average calorie intaake for Men should be 2500 a day");
   
   
   if(breakfast.equalsIgnoreCase("y"))//if statements for breakfast
   {
      System.out.println("Do not skip breakfast. It is the most important meal.");
   }
   else if(breakfast.equalsIgnoreCase("n"))
   {
      System.out.println("Eat a well balanced breakfast everyday.");
   }
   else if(breakfast.equalsIgnoreCase("d"))
   {
      System.out.println("Eat a well balanced breakfast everyday.");
   }
   
   
   if(numMeals==0)//if statments for Number of Meals
   {
      System.out.println("Don't starve yourself, It's not good for your health.");
   }
   else if(numMeals == 1)
   {
      System.out.println("You should eat more than once a day. Don't starve yourself.");
   }
   else if(numMeals==2)
   {
      System.out.println("You should eat more than two meals a day");
   }
   else if(numMeals==3)
   {
      System.out.println("Stick with eating three meals a day.");
   }
   else if(numMeals>=4)
   {
      System.out.println("You are eating too much. ");
   }
   
   System.out.println("The Average person should have at least 3 meals a day with a couple snacks in between.");
   
   
    if(waterIntake.equalsIgnoreCase("a"))//if statment for Water Intake
   {
      System.out.println("You should drink more water");
   }
   else if(waterIntake.equalsIgnoreCase("b"))
   {
      System.out.println("Not bad, but you should still drink more water");
   }
   else if(waterIntake.equalsIgnoreCase("c"))
   {
      System.out.println("Continue with your current amount of water");
   }
   
   System.out.println("You should be drinking about 90 to 120 fluid ounces of water a day.");
   
   
   
   
   if(phyActLevel.equalsIgnoreCase("a"))//if statment for Work out Level
   {
      System.out.println("You should work out alot more.");
   }
   else if(phyActLevel.equalsIgnoreCase("b"))
   {
      System.out.println("Start by working out at least 2 times a week");
   }
   else if(phyActLevel.equalsIgnoreCase("c"))
   {
      System.out.println("Push yourself to work out at least 5 times a week.");
   }
    else if(phyActLevel.equalsIgnoreCase("d"))
   {
      System.out.println("Your work out regimen is good.");
   }
   else if(phyActLevel.equalsIgnoreCase("e"))
   {
      System.out.println("Your work out ethic is Excellent. Keep it up. ");
   }
   
   
   System.out.println("To stay fit you should be working out about 5+ days a week.");
   
   

   }//end of main method
}//end of public class
