package maven.task;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseEstimation {
	private static final Logger LOGGER = LogManager.getLogger(HouseEstimation.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			
			System.out.println("Enter 1 if you want to use standard materials");
			System.out.println("Enter 2 if you want to use above standard materials");
			System.out.println("Enter 3 if you want to use high standard materials");
			System.out.println("Enter 4 if you want to use high standard materials and want a fully automated home");
			int choice = sc.nextInt();
			
			System.out.println("Enter the area in square feet");
			double area = sc.nextDouble();
			System.out.println("Do you want a fully automated home? (y/n)");
			boolean automated;
			char ch = sc.next().charAt(0);
			if(ch == 'y' || ch == 'Y'){
				automated = true;
			}else{
				automated = false;
			}
			
			char c;
			HouseConstruction hc = new HouseConstruction();
		
			switch(choice){
				case 1:
					LOGGER.info("House Construction cost using standard materials : "+hc.EstimateCost("standard", area, automated));
					System.out.println("Do you want to continue? (y/n)");
					c = sc.next().charAt(0);
					if(c == 'n' || c == 'N'){
						flag = false;
						System.out.println("Thank You!!");
					}
					break;
				case 2:
					LOGGER.info("House Construction cost using above standard materials : "+hc.EstimateCost("above standard", area, automated));
					System.out.println("Do you want to continue? (y/n)");
					c = sc.next().charAt(0);
					if(c == 'n' || c == 'N'){
						flag = false;
						System.out.println("Thank You!!");
					}
					break;
				case 3:
					LOGGER.info("House Construction cost using high standard materials : "+hc.EstimateCost("high standard", area, automated));
					System.out.println("Do you want to continue? (y/n)");
					c = sc.next().charAt(0);
					if(c == 'n' || c == 'N'){
						flag = false;
						System.out.println("Thank You!!");
					}
					break;
				case 4:
					LOGGER.info("House Construction cost using high standard materials for a fully automated home : "+hc.EstimateCost("high standard", area, automated));
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
