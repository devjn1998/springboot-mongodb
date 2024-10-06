package com.juancosta.workshopmongo.resourcers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancosta.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResourcer {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User juan = new User("1", "juan", "juan@gmail.com");
		User laura = new User("2", "laura", "laura@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(juan, laura));
		return ResponseEntity.ok().body(list);
	}
	
	
}
