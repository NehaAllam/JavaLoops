/*
Date: October 10, 2017
Concept: Nested for loop
Content: Ticket price at a zoo
*/

import javax.swing.JOptionPane;

public class NestedIF
{
   public static void main(String[] args)
   {
      //...CONSTANTS....
      double childfee = 2.93;
      double adultfee = 8.65;
      double convfee = 0.85;
      double tax = 0.1;
      double discount = 0.8;
      int age =0;
      int day =0;
      double fee = 0.0;
      double taxfee = 0.0;
      double finalfee =0.0;
      boolean valid=true;
      
      do
      {
      try
      {
         age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age!"));
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null,"Enter only a number");
      }
      
      if(age<=0)
      {
         JOptionPane.showMessageDialog(null,"Enter only a number");
      }
      else if(age>0 && age<6)
      {
         JOptionPane.showMessageDialog(null,"Your ticket is free! Enjoy!");
         valid=false;
      }
      else if(age>6 && age <18)
      {
         try
         {
            day = Integer.parseInt(JOptionPane.showInputDialog(null,"Select the day from one of the given options: \n 1. Sunday \n 2. Monday \n 3. Tuesday \n 4. Wednesday \n 5. Thursday \n 6. Friday \n 7. Saturday \n"));
         }
         catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null,"Enter only a number");
         }
         if(day==1 | day==7)
         {
            fee = childfee + convfee;
            taxfee = fee * tax;
            finalfee = fee + taxfee;
            valid=false;
         }
         else if(day==2 | day==3 | day==4 | day==5 | day==6)
         {
            fee = childfee + convfee;
            taxfee = fee * tax;
            finalfee = (fee+taxfee) * discount;
            valid=false;
         }
         else
         {
            JOptionPane.showMessageDialog(null,"Please select a valid day");
         }
      }
      else if(age>=18)
      {
         try
         {
            day = Integer.parseInt(JOptionPane.showInputDialog(null,"Select the day from one of the given options: \n 1. Sunday \n 2. Monday \n 3. Tuesday \n 4. Wednesday \n 5. Thursday \n 6. Friday \n 7. Saturday \n"));
         }
         catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null,"Enter only a number");
         }
         if(day==1 | day==7)
         {
            fee = adultfee + convfee;
            taxfee = fee * tax;
            finalfee = fee + taxfee;
            valid=false;
         }
         else if(day==2 | day==3 | day==4 | day==5 | day==6)
         {
            fee = adultfee + convfee;
            taxfee = fee * tax;
            finalfee = (fee+taxfee) * discount;
            valid=false;
         }
         else
         {
            JOptionPane.showMessageDialog(null,"Please select a valid day");
         }
      }
      else
      {
         JOptionPane.showMessageDialog(null,"Please enter a valid age");
      }
      }while(valid=false);
      
      String output = "****FINAL RECEIPT***** \n The age entered is:" + age + "\n The cost before tax and discount is: " + fee + "\n The total cost is:" + finalfee + "\n Have a good day!";
      JOptionPane.showMessageDialog(null,output);
      
    }
 }         

               
     
         
