package com.zeasn.test;

public class ThreadTest implements Runnable {
	private int count;
	@Override
	public /*synchronized*/ void run() {
		System.out.println(Thread.currentThread().getName() + "--count=" + count++);
	}
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		for (int i = 0; i < 5; i++) {
			new Thread(t,"count--"+i).start();
		}
		
	}
}
