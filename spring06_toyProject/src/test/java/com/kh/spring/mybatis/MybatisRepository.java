package com.kh.spring.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.kh.spring.member.model.dto.Member;

@Mapper
public interface MybatisRepository {
	
	@Select("select password from member where user_id = #{userId}")
	String selectPasswordByUserId(String userId);
	
	@Select("select * from member where user_id = #{userId}")
	Member selectMemberByUserId(String userId);
	
	@Select("select * from member inner join rent_master using(user_id) where user_id = #{userId}")
	List<Map<String, Object>> selectRentAndMemberByUserId(String userId);
	
	List<Map<String, Object>> selectRentBookByUserId(String userId);
	
	public void insertWithDto(Member member);
	
	public void insertWithMap(Map<String, Object> commandMap);
	
	@Delete("delete from rent_master where user_id = #{userId}")
	public void delete(String userId);
	
	@Update("update member set password = #{password} where user_id = #{userId}")
	public void update(Member member);
	
	public void test01(Map<String, Object> commandMap);
	
}
