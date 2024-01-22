package com.example.Api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api.entity.ApiVO;
import com.example.Api.service.ServiceIf;

@RestController
@RequestMapping("/api")
public class ApiController {
	public Logger LOGGER = LoggerFactory.getLogger(ApiController.class);
	@Autowired
	ServiceIf serviceIf;

	@GetMapping("/get")
	public List<ApiVO> getAllApi() {
		
		List<ApiVO> details = serviceIf.getAllApi();

		LOGGER.warn ("debug level");
		return details;
	}
}