package day5Tasks;

public class AverageCalculator {
	public double calAverage(int n) {
		if(n<=0) {
			throw new IllegalArgumentException("Input must be a Natural Number");
		}
		double sum=(n*(n+1))/2.0;
		return sum/n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageCalculator calculator=new AverageCalculator();
		try {
			System.out.println("Average: " + calculator.calAverage(-3));
		} catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Average: "+ calculator.calAverage(5));
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
