package org.eleganthawker.hawkercommons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author AMS
 */
@SpringBootApplication
@ServletComponentScan
public class HawkerCommonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HawkerCommonsApplication.class, args);
	}

}
