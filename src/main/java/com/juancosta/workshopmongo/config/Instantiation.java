package com.juancosta.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.juancosta.workshopmongo.domain.User;
import com.juancosta.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	
	@Autowired
	UserRepository userRepository;
	
	@Override
	
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();

		User juan = new User(null, "Juan", "juan@gmail.com");
		User laura = new User(null, "laura", "laura@gmail.com");
		User margareth = new User(null, "margareth", "margareth@gmail.com");
		
		userRepository.saveAll(Arrays.asList(juan, laura, margareth));
		
	}

}
