package com.narendra.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.narendra.models.SampleModel;

@Mapper
public interface SampleDao {

	
	@Results({
		@Result(property="id", column="id"),
		@Result(property="firstName", column="fName"),
		@Result(property="lastName", column="lName")
	})
	
    @Select("select * from agentstest")
    List<SampleModel> getAllUsers();
    
    
    @Insert("insert into agentstest(id,fName,lName) values(#{id},#{firstName},#{lastName})")
    void insertUser(SampleModel sampleModel);
    
}
