package maven1;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task4 {
     private static Logger LOGGER=LogManager.getLogger(Task4.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.format("%s","Select a number: \n 1: Interest calculations \n 2: Cost Estimation");
		LOGGER.info("Select a number: \n 1: Interest calculations \n 2: Cost Estimation");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			InterestCal interest =new InterestCal();
		    interest.calculate();
		}
		else if(n==2)
		{
			CostEst estimation= new CostEst();
			estimation.findcost();
		}
		else
		{
			//System.out.format("%s","Select a valid number");
			LOGGER.info("Select a valid number");
		}
	}

}
