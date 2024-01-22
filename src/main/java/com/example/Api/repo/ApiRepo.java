package com.example.Api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Api.entity.ApiVO;
@Repository
public interface ApiRepo extends JpaRepository<ApiVO, Integer>{

	List<ApiVO> findAll(String act);

}
