package com.insight.MavenProject;
public class ThreadDemo1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		ThreadDemo1 t1=new ThreadDemo1();
		t1.start();
		t1.setName("Java1");
		
		ThreadDemo1 t2=new ThreadDemo1();
		t2.start();
		t2.setName("Java2");
		
		System.out.println(Thread.activeCount());
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());

	}

}
