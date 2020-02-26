package maven.task;

public class HouseConstruction {
	public double EstimateCost(String standard, double area, boolean automated){
		if(standard.equalsIgnoreCase("standard") && automated==false){
			return(area*1200);
		}else if(standard.equalsIgnoreCase("above standard") && automated==false){
			return(1500*area);
		}else if(standard.equalsIgnoreCase("high standard") && automated==false){
			return(1800*area);
		}else if(standard.equalsIgnoreCase("high standard") && automated==true){
			return(2500*area);
		}
		return 0;
	}
}
