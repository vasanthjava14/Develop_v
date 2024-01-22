package com.example.Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Api.entity.ApiVO;
import com.example.Api.repo.ApiRepo;

@Service
public class ServiceImpl implements ServiceIf {
	@Autowired
	ApiRepo apiRepo;

	@Override
	public List<ApiVO> getAllApi() {
		
		// TODO Auto-generated method stub
		return apiRepo.findAll();
		}
			
		
	}

