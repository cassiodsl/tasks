package com.tasks.one.second;

/**
 * Class copied from the Question 1 (modified)
 * 
 * @author cassiolemos
 *
 */
public class MyIncDec extends IncDecAbstract {

	@SuppressWarnings("unused")
	private int x;

	public MyIncDec(int x) {
		this.x = x;
	}

	@Override
	protected void toIncrementUse() {
		this.x++;
	}

	@Override
	protected void toDecrementUse() {
		this.x--;
	}

}
