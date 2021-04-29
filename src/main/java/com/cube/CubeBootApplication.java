package com.cube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年2月10日
 * @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
 */
@SpringBootApplication
@Slf4j
@EnableMethodCache(basePackages = "com.cube")
@EnableCreateCacheAnnotation
public class CubeBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CubeBootApplication.class, args);
		if (log.isInfoEnabled()) {
			log.info("\n----------------------------------------------------------\n\t"
					+ "[cube-jetcache] application is running! \n\t"
					+ "----------------------------------------------------------");
		}
	}

}
