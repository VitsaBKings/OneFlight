package com.uap.oneflight.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.uap.oneflight.model.GuestInfo;
import com.uap.oneflight.model.PassportDetails;

@Mapper
public interface RegistrationMybatisRepository {
	@Insert
	("INSERT INTO users(email, password, first_name, middle_name, last_name, birthday, phone_number, passport_detail_id, role, status) VALUES (#{email}, #{password}, #{first_name}, #{middle_name}, #{last_name}, #{birthday}, #{phone_number}, #{passport_detail_id}, #{role}, #{status})")
	public int insert(GuestInfo user);
	
	@Insert
	("INSERT INTO passport_details(passport_type, country_code, passport_number, first_name, middle_name, last_name, nationality, sex, date_of_birth, place_of_birth, date_of_issue, valid_until, issuing_authority) VALUES (#{passport_type}, #{country_code}, #{passport_number}, #{first_name}, #{middle_name}, #{last_name}, #{nationality}, #{sex}, #{date_of_birth}, #{place_of_birth}, #{date_of_issue}, #{valid_until}, #{issuing_authority})")
	public int register(PassportDetails details);
	
	@Update
	("UPDATE users SET status = true")
    public int updateStatus();
}
