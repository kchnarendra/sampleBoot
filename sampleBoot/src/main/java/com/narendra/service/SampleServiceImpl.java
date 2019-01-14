package com.narendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narendra.dao.SampleDao;
import com.narendra.models.SampleModel;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleDao sampleDao;
	
	public SampleServiceImpl(SampleDao sampleDao){
		this.sampleDao = sampleDao;
	}
	
	public List<SampleModel> getAllUsersService(){
		return sampleDao.getAllUsers();
	}
	
	public void insertUserstService(SampleModel sampleModel){
		sampleDao.insertUser(sampleModel);
	}
	
}
