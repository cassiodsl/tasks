package com.tasks.one.first;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotations for methods only and in runtime, this types the methods that must
 * have their execution checked.
 * 
 * @author cassiolemos
 *
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExecutionTimeCheck {

	/*
	 * This annotation is placed on the interface causing all implementations to be
	 * checked
	 */

}
