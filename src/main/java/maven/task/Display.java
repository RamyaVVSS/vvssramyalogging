package maven.task;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Display {
	private static final Logger LOGGER = LogManager.getLogger(Display.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
			
		System.out.println("Enter the principle amount");
		double principle = sc.nextDouble();
		System.out.println("Enter the rate of interest");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Enter the time period");
		float time = sc.nextFloat();
		LOGGER.info("The principle amount: "+principle+" rate of interest: "+rateOfInterest+" and time period: "+time);
		while(flag){
			System.out.println("Enter 1 to calculate Simple Interest");
			System.out.println("Enter 2 to calculate Compound Interest");
		
			int choice = sc.nextInt();
			char c;
			CalculateInterests ci = new CalculateInterests();
	
			switch(choice){
				case 1:
					LOGGER.info("Simple Interest : "+ci.SimpleInterest(principle, time, rateOfInterest));
					System.out.println("Do you want to continue? (y/n)");
					c = sc.next().charAt(0);
					if(c == 'n' || c == 'N'){
						flag = false;
						System.out.println("Thank You!!");
					}
					break;
				case 2:
					LOGGER.info("Compound Interest : "+ci.CompundInterest(principle, time, rateOfInterest));
					System.out.println("Do you want to continue? (y/n)");
					c = sc.next().charAt(0);
					if(c == 'n' || c == 'N'){
						flag = false;
						System.out.println("Thank You!!");
					}
					break;
				default:
					System.out.println("Please enter a valid number!");
			}
		}
	}
}
