package com.wewk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
@EnableJpaAuditing
public class WewkApplication {

	public static void main(String[] args) {
		SpringApplication.run(WewkApplication.class, args);
	}

	@Bean
	public AuditorAware<Long> auditorProvider() {
		//작성자, 수정자 아이디 생성
		//실무에서는 쿠키나 세션 ID를 넣어서 저장해야 된다!
		return () -> Optional.of(1L);
	}
}
