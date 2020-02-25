Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@bhavanilenkala 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


YashasviRao
/
Logging
1
00
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights
Logging/maven1/src/main/java/maven1/CostEst.java
@YashasviRao YashasviRao Initial commit of Logging class written using maven tool
8cce541 16 hours ago
51 lines (48 sloc)  1.75 KB
  
package maven1;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CostEst {
	private static final Logger LOGGER =LogManager.getLogger(CostEst.class);
	float area;
	 String standardLevel;
	 boolean automation;
	 
	 void findcost()
	 {
		 Scanner sc=new Scanner(System.in);
		// System.out.format("%s","enter the area of the house in square feet :");
		 LOGGER.info("enter the area of the house in square feet :");
		 area=sc.nextFloat();
		// System.out.format("%s","Choose the material standard level by entering corresponding codes :\n s:standard material\n as:above standard material\n hs:high standard material");
		 LOGGER.info("Choose the material standard level by entering corresponding codes :\n s:standard material\n as:above standard material\n hs:high standard material");
		 standardLevel=sc.next();
		 try {
		// System.out.format("%s","Do you want automation ? Enter true or false.");
			 LOGGER.info("Do you want automation ? Enter true or false.");
			 automation=sc.nextBoolean();
		 }
		 catch(InputMismatchException e)
		 {
		//	 System.out.format("%s",e);
			 LOGGER.error(e);
		 }
		 if(automation)
		 {
		//	 System.out.format("%s","Cost ="+area*2500);
			 LOGGER.info("Cost ="+area*2500);
		 }
		 else
		 {
			 if(standardLevel.equals("s"))
		//		 System.out.format("%s","Cost ="+area*1200);
				 LOGGER.info("Cost ="+area*1200);
			 else if(standardLevel.equals("as"))
		//		 System.out.format("%s","Cost ="+area*1500);
				 LOGGER.info("Cost ="+area*1500);
			 else if(standardLevel.equals("hs"))
		//		 System.out.format("%s","Cost ="+area*1800);
				 LOGGER.info("Cost ="+area*1800);
		 }
	 }
}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
