/*
Date: October 11, 2017
Concept: Parallel Arrays
Content: Pie sales counter
*/


import javax.swing.JOptionPane;

public class ParallelArray
{

	static double[] costs = {5.94,5.89,6.95};
	static String[] pietype={"apple","bb","pb"};
	static double[] pie_counter={0,0,0};
	static String[] pies= new String[13];
	String pie;
	static double finalamount = 0.0;

	public static void main(String[] args)
	{
		
		inputForPies(pies);
		calculatePies(pietype, pies,pie_counter);
		pieCost(pie_counter,costs,pietype);
		display(pietype,pie_counter,finalamount);
	}

	public static void inputForPies(String[] pies)
	{
		int answer=Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to bake cookies today?\n 1. Yes \n 2. No"));

		if(answer==2)
		{
			JOptionPane.showMessageDialog(null,"ENJOY YOUR DAY!");
		}

		else if(answer==1)
		{
			for(int i=0;i<pies.length;i++)
			{
				int counter=0;
				String pie = JOptionPane.showInputDialog(null,"Enter one of the following pies(same case): \n 1. apple \n 2. bb \n 3. pb \n Enter QUIT to exit");
				if("QUIT".equals(pie))
					break;
			}
			
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Enter a valid value");
		}
	}

	public static double[] calculatePies(String[] pietype, String[] pies, double[] pie_counter)
	{
		for(int i=0;i<pies.length;i++)
		{
			for(int j=0;j<pietype.length;j++)
			{
				if(pies[i]==pietype[j])
				{
					pie_counter[j]++;
				}
			}
		}
		return pie_counter;
	} 

	public static double pieCost(double[] pie_counter,double[] costs, String[] pietype)
	{
		for(int i=0;i<costs.length;i++)
		{
			finalamount = pie_counter[i] * costs[i];
		}
		return finalamount;
	}

	public static void display(String[] pietype, double[] pie_counter,double finalamount)
	{
		String output1 ="";
		for(int i=0;i<pie_counter.length;i++)
		{
			output1 = output1 + "The number of" + pietype[i] + ":" + pie_counter[i]; 
		}

		JOptionPane.showMessageDialog(null,"The amount you made today is" + finalamount);

	}

}
      
      
      
