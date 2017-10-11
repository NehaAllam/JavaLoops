/*
Date: October 9, 2017
Problem: Program to calculate the total costof all trips
Concept covered: While loops and exceptions
*/

import javax.swing.JOptionPane;
public class DoLoop{
public static void main(String[] args){

//....CONSTANTS......
double pertrip = 1.06;
double permile = 0.78;
double sentinel = 0;
boolean valid = true;
double tripcost = 0;
int numtrips = 0;
double average=0.0;
int tripanswer=0;
double trips=0.0;
double totalcost=0.0;

//...FIRST INPUT FOR TRIP....
try{
tripanswer = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to take a trip today? 1. Yes 2. No Enter the number you wish to choose"));
}
catch(Exception e){
JOptionPane.showMessageDialog(null,"Please select a number");
}
if(tripanswer==2){
JOptionPane.showMessageDialog(null,"Enjoy your day off");
}
//....INPUT FOR NUMBER OF MILES....
else if(tripanswer==1){
try{
trips = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the number of miles or 0 to exit"));
}
catch(Exception ne){
throw new NumberFormatException("Please select a number");
}
if(trips<0){
JOptionPane.showMessageDialog(null,"Enter a valid value");
}
else if(trips>0){
while(trips!=0)
{
numtrips++;
tripcost = (trips*permile) + pertrip;
totalcost = totalcost + tripcost;
trips = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the number of miles or 0 to exit"));
}
if(numtrips>0)
{
average = totalcost/numtrips;
JOptionPane.showMessageDialog(null,"The total cost of the trip is" + tripcost + "/n" + "The average cost of the trip is" + average); 
}
}
}
else{
JOptionPane.showMessageDialog(null,"Enter a valid value");
}
}
}


