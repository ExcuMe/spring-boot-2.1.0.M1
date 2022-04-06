package sample.servlet;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author wuyj38634
 * @date 2022/4/1
 */
@Component
public class HelloWorldApplicationRunner implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("HELLO WORLD !");
	}
}
