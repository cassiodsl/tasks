package com.tasks.one.first;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * Responsible for finding, executing and display the time for all
 * implementations of {@link IncDec}
 * 
 * @author cassiolemos
 *
 */
@Service
public class InvokeTiming {

	/**
	 * List all implementations of IncDec and it is usually used to apply Chain of
	 * responsibility pattern (My favorite thing using Spring since MVC
	 */
	@Autowired
	private List<IncDec> myIncDec;

	@EventListener(ApplicationReadyEvent.class)
	public void checkTimeMethods()
			throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// finds using Java reflection, the annotations of the implementations of IncDec
		Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("com.tasks.one.first.IncDec");

		Method[] methods = clazz.getMethods();
		for (Method method : methods) {

			// Only my annotation Timing for this objective of calculating time of the
			// execution
			Timing annotation = method.getAnnotation(Timing.class);
			if (annotation != null) {
				/*
				 * NOTE: I usually write comments of my ideas then I add code so it is easier to
				 * implement and not forget important parts of the logic
				 */

				// Navigate all impls
				for (IncDec incDec : myIncDec) {
					// start timer
					long start = System.currentTimeMillis();
					// call method
					method.invoke(incDec);
					// finish timer
					long end = System.currentTimeMillis();

					// calculate total and print
					System.out.println(incDec.getClass().getCanonicalName() + " > " + method.getName());
					System.out.println("Duration: " + (end - start));

				}
			}
		}

	}

}
