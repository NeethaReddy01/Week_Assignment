package junitTest;

public class Loan {
	public int getEmi(int amount) {
		return amount/12;
	}
 
	public int sum(int a,int b) {
		return a+b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	public void deposite() throws MyException{
		throw new MyException("Sample Exception");
	}
	public boolean isOdd(int n){
		boolean flag=false;
		if(n%2!=0)
			flag=true;
		else
			flag=false;
		
		return flag;
	}

}
