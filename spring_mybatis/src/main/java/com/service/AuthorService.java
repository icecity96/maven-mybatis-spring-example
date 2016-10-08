package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AuthorMapper;

@Service
public class AuthorService {
	@Autowired
	AuthorMapper authorMapper;
	
	public String UserInfor(final String id) {
		return authorMapper.getUser(id).toString();
	}
}
