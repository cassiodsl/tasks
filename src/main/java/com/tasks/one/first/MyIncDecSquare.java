package com.tasks.one.first;

/**
 * Based on the class MyIncDec which was copied from the Question 1, this
 * implementation aims to simulate different clients for the interface
 * {@link IncDec} pointed out on the question description
 * 
 * @author cassiolemos
 *
 */
public class MyIncDecSquare implements IncDec {

	private int x;

	public MyIncDecSquare(int x) {
		this.x = x;
	}

	@Override
	public void increment() {
		// Added Thread sleep since the execution was to fast, for display purposes, not
		// necessary in different logics
		try {
			Thread.sleep(500);
			this.x += this.x * 2;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void decrement() {
		try {
			Thread.sleep(600);
			this.x -= this.x * 2;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
