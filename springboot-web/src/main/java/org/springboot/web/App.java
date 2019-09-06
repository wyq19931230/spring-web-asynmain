package org.springboot.web;

import java.util.Map;
import java.util.TreeMap;

import org.springboot.web.service.HelloService;
import org.springboot.web.service.IHelloservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 *""：双引号；不会转义字符串里面的特殊字符；特殊字符会作为本身想表示的意思
 *name: "zhangsan \n lisi"：输出；zhangsan 换行 lisi
 *''：单引号；会转义特殊字符，特殊字符最终只是一个普通的字符串数据
 *name: ‘zhangsan \n lisi’：输出；zhangsan \n lisi
 */

@SpringBootApplication
@ImportResource("classpath:beanKap.xml")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    @Bean
    public IHelloservice helloservice() {
    	Map<String,String> map = new TreeMap<>();
    	return new HelloService();
    }
    
	/*
	 * @Bean public DefaultKaptcha defaultKaptcha() throws FileNotFoundException,
	 * IOException { DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
	 * Properties properties = new Properties(); properties.load(new
	 * FileInputStream("application-my.properties")); Config config = new
	 * Config(properties); defaultKaptcha.setConfig(config); return defaultKaptcha;
	 * }
	 */
}
