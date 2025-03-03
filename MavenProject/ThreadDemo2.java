package com.insight.MavenProject;

public class ThreadDemo2 implements Runnable {
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 t2=new ThreadDemo2();
		Thread t=new Thread(t2);
		t.start();
		System.out.println(Thread.activeCount());

	}

}
