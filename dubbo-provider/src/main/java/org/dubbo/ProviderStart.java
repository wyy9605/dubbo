package org.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

@EnableDubbo
@NacosPropertySource(dataId = "dubbo.application.yml",groupId = "DEFAULT_GROUP" , autoRefreshed = true)
@SpringBootApplication
public class ProviderStart {

	public static void main(String[] args) {
		
		SpringApplication.run(ProviderStart.class, args);
	}

}
