package com.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.po.Author;

public interface AuthorMapper {
	@Select("SELECT * FROM Author WHERE Author.AuthorID=#{id}")
	@Results(value = {
			@Result(column="AuthorID",property="authorid"),
			@Result(column="Name",property="name"),
			@Result(column="Age",property="age"),
			@Result(column="Country",property="country")
	})
	Author getUser(@Param("id")String id);
}
