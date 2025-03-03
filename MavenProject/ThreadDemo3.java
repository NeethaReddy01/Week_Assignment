package com.insight.MavenProject;

public class ThreadDemo3 extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo3 t3=new ThreadDemo3();
		t3.start();
		t3.setName("Java1");
		for(int i=0;i<=5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());
	}
}
		
		
		
		
		