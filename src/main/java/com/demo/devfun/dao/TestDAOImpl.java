package com.demo.devfun.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class TestDAOImpl implements TestDAO{

    @Autowired
    private SqlSessionTemplate template;

    public TestDAOImpl(SqlSessionTemplate template){
        super();
        this.template = template;
    }

    @Override
    public int getTestCount() {

        return template.selectOne("com.test.springTest.testxml.selectTest");
    }

    @Override
    public List<Map<String, Object>> getSample() {
        return template.selectList("com.test.springTest.testxml.selectTest2");
    }
}
