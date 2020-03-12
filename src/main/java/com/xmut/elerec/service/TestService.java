package com.xmut.elerec.service;

import com.xmut.elerec.dao.TestDao;
import com.xmut.elerec.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestDao testDao ;

    public TestService(TestDao testDao) {
        this.testDao = testDao;
    }

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}
