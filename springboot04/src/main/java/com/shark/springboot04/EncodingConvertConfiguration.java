package com.shark.springboot04;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @Conditional 基于条件的自动配置，一般配合Condition接口一起使用，只有接口（一个或多个）的实现类都返回true，才装配，否则不装配
 * 它可以用在方法上面，则只对该方法起作用。还可以用在类上面，则对该类下面的所有方法起作用
 */
@SpringBootConfiguration
@Conditional({UTF8Condition.class})
public class EncodingConvertConfiguration {

	@Bean
//	@Conditional(UTF8Condition.class)
	public EncodingConvert createUTF8EncodingConvert(){
		return new UTF8EncodingConvert();
	}
	
	@Bean
//	@Conditional(GBKCondition.class)
	public EncodingConvert createGBKEncodingConvert(){
		return new GBKEncodingConvert();
	}
}
