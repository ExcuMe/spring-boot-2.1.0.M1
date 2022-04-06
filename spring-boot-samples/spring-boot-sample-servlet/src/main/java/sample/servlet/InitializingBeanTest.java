package sample.servlet;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author wuyj38634
 * @date 2022/4/1
 */
@Component
public class InitializingBeanTest implements InitializingBean {


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBeanTest......");
	}
}
