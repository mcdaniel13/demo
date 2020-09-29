package com.example.demo.service;

import com.example.demo.dao.TempDao;
import com.example.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempService {

    @Autowired
    TempDao tempDao;

    public UserModel findUser(String no) {

        return tempDao.findUser(no);
    }



}
