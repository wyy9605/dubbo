package org.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

@NacosPropertySource(dataId = "dubbo.application.yml",groupId = "DEFAULT_GROUP" , autoRefreshed = true)
@SpringBootApplication
public class ConsumerStart {

	public static void main(String[] args) {
		
		SpringApplication.run(ConsumerStart.class, args);
	}

}
