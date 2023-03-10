package com.tasks.one.second;

import com.tasks.one.first.IncDec;

/**
 * Checks execution time for the methods increment and decrement, requests
 * implementation for the logic to increment and decrement
 * 
 * @author cassiolemos
 *
 */
public abstract class IncDecAbstract implements IncDec {

	@Override
	public void increment() {
		long start = System.currentTimeMillis();
		toIncrementUse();
		long end = System.currentTimeMillis();
		System.out.println("Time to increment: " + (end - start));
	}

	@Override
	public void decrement() {
		long start = System.currentTimeMillis();
		toDecrementUse();
		long end = System.currentTimeMillis();
		System.out.println("Time to decrement: " + (end - start));
	}

	/**
	 * Implement the logic to increment
	 */
	protected abstract void toIncrementUse();

	/**
	 * Implement the logic to decrement
	 */
	protected abstract void toDecrementUse();

}
