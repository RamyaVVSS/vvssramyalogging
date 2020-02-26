package maven.task;

import java.lang.Math;

public class CalculateInterests {
	public double SimpleInterest(double principle, float time, double rateOfInterest){
		return((principle*rateOfInterest*time)/100);
	}
	
	public double CompundInterest(double principle, float time, double rateOfInterest){
		double res=principle*(Math.pow((1+rateOfInterest/100), time));
		return(res);
	}
}
