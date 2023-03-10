package com.tasks.one.first;

/**
 * Class copied from the Question 1 (modified)
 * 
 * @author cassiolemos
 *
 */
public interface IncDec {

	/*
	 * The annotation Timing is part of the first solution where the system detects
	 * that that method needs to be checked
	 */
	
	@ExecutionTimeCheck
	void increment();

	@ExecutionTimeCheck
	void decrement();

}
