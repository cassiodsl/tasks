package com.tasks.one.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class to setup default values for beans that need to be
 * injected. It is usually not a good practice if that would be business logic,
 * since the solution presented accepts it, it is handy.
 * 
 * @author cassiolemos
 *
 */
@Configuration
public class ConfigurationClass {

	/**
	 * Default parameters for auto creation of the bean {@link MyIncDec}
	 * @return {@link MyIncDec}
	 */
	@Bean
	public MyIncDec myIncDecConfig() {
		return new MyIncDec(1);
	}
	
	/**
	 * Default parameters for auto creation of the bean {@link MyIncDecSquare}
	 * @return {@link MyIncDecSquare}
	 */
	@Bean
	public MyIncDecSquare myIncDecSquareConfig() {
		return new MyIncDecSquare(1);
	}
}
