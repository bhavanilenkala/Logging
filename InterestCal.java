package maven1;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestCal {
	private static final Logger LOGGER =LogManager.getLogger(InterestCal.class);
	int P,r,t,n;
    void calculate()
    {
    	Scanner sc=new Scanner(System.in);
    	//System.out.format("%s","Enter the value of principal balance :");
    	LOGGER.info("Enter the value of principal balance :");
    	P=sc.nextInt();
    	//System.out.format("%s","Enter the value of annual interest rate :");
    	LOGGER.info("Enter the value of annual interest rate :");
    	r=sc.nextInt();
    	//System.out.format("%s","Enter the value of time in years :");
    	LOGGER.info("Enter the value of time in years :");
    	t=sc.nextInt();
    	//System.out.format("%s","Enter the value of time period :");
    	LOGGER.info("Enter the value of time period :");
    	n=sc.nextInt();
    	float SI=simpleInterest(P,r,t);
    	float CI=compundInterest(P,r,t,n);
    	//System.out.format("%s","SI :"+SI);
    	LOGGER.info("SI :"+SI);
    	//System.out.format("%s","CI :"+CI);
        LOGGER.info("CI :"+CI);
    	
    }
    float simpleInterest(int P,int r,int t)
    {
    	LOGGER.info("Inside simpleInterest method");
    	int A=P*(1+r*t);
    	LOGGER.info("Returning to calculate method");
    	return (float)A;
    	
    }
    float compundInterest(int P,int r,int t,int n)
    {
    	LOGGER.info("Inside compoundInterest method");
    	int A=P*(1+r/n)*n*t;
    	LOGGER.info("Returning to calculate method");
    	return (float)A;
    }
}
