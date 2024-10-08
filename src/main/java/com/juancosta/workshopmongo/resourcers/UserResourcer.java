package com.juancosta.workshopmongo.resourcers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juancosta.workshopmongo.domain.User;
import com.juancosta.workshopmongo.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResourcer {
	
	@Autowired
	private UserServices service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
}
