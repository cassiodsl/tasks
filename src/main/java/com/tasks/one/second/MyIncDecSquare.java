package com.tasks.one.second;

import com.tasks.one.first.IncDec;

/**
 * Based on the class MyIncDec which was copied from the Question 1, this
 * implementation aims to simulate different clients for the interface
 * {@link IncDec} pointed out on the question description
 * 
 * @author cassiolemos
 *
 */
public class MyIncDecSquare extends IncDecAbstract {

	private int x;

	public MyIncDecSquare(int x) {
		this.x = x;
	}

	@Override
	protected void toIncrementUse() {
		try {
			/*
			 * Added Thread sleep since the execution was to fast, for display purposes, not
			 * necessary in different logics, same as the solution one but decided to keep
			 * both to show the differences
			 * 
			 */
			Thread.sleep(500);
			this.x += this.x * 2;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void toDecrementUse() {
		try {
			Thread.sleep(600);
			this.x -= this.x * 2;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
