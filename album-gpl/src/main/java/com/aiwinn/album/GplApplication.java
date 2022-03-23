package com.aiwinn.album;

import com.aiwinn.album.mq.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:applicationContext.xml"})
@SpringBootApplication
@Slf4j
public class GplApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GplApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if ("true".equals(RabbitMqClusterTest.isStartRabbitMqLive)) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					RabbitMqClusterTest.consumer();
				}
			}).start();
		}
	}

}
