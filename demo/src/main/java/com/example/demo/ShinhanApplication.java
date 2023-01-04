package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
public class ShinhanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShinhanApplication.class, args);
	}
	@GetMapping("/")
	public void getLove(HttpServletResponse response) throws IOException {
		ClassPathResource loveFile = new ClassPathResource("love.txt");
		response.setContentType("text/plain");
		StreamUtils.copy(loveFile.getInputStream(), response.getOutputStream());
	}

}
