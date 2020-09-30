package com.example.demo.dao;

import com.example.demo.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TempDao {
    UserModel findUser(String no);
}
