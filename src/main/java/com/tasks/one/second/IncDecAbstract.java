package com.tasks.one.second;

import com.tasks.one.first.IncDec;

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

	protected abstract void toIncrementUse();

	protected abstract void toDecrementUse();

}
