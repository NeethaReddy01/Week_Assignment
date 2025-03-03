package day12Tasks;

import java.util.Random;
class Advice_Giver implements Runnable {
	private String[] advices;
	public Advice_Giver(String[] advices) {
		this.advices=advices;
	}
	@Override
	public void run() {
		Random random=new Random();
		int randomIndex=random.nextInt(advices.length);
		System.out.println(Thread.currentThread().getName() + ": " + advices[randomIndex]);
	}
}
    public class AdviceGiver{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] advices= {"i. Never begin to stop and never stop to begin.","ii. Only destination isn’t important, one should enjoy the journey.","iii. impossible itself says ‘i m possible’"};
		int numberOfThreads=5;
		for(int i=0;i<=numberOfThreads;i++) {
			Thread advisorThread=new Thread(new Advice_Giver(advices), "Advisor" + (i+1));
			advisorThread.start();
		}
	}
}
