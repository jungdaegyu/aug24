package com.poseidon.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fasterxml.jackson.databind.JsonNode;

@Mapper
public interface AdminDAO {


	

	Map<String, Object> adminLogin(Map<String, Object> map);

	List<Map<String, Object>> list();

	void noticeWrite(Map<String, Object> map);

	String noticeDetail(int nno);

	int noticeHide(int nno);


	List<Map<String, Object>> setupBoardList();



	


	
	





}
