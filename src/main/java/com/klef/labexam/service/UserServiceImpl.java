package com.klef.labexam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.labexam.model.User;
import com.klef.labexam.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;
	
	
	@Override
	public String add(User u) {
		repository.save(u);
		return "Added successfully";
	}

	@Override
	public List<User> viewall() {
		return repository.findAll();
		
	}

	@Override
	public String deleteById(int id) {
		repository.deleteById(id);
		return "deleted sucessfully";
	}

}
