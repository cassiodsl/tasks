package com.tasks.one.first;

/**
 * Class copied from the Question 1
 * 
 * @author cassiolemos
 *
 */
public class MyIncDec implements IncDec {

	// Added this annotation to avoid warnings since encapsulated methods are not
	// here to help
	// Different IDEs sees this differently
	@SuppressWarnings("unused")
	private int x;

	public MyIncDec(int x) {
		this.x = x;
	}

	@Override
	public void increment() {
		this.x++;

	}

	@Override
	public void decrement() {
		this.x--;
	}

}
