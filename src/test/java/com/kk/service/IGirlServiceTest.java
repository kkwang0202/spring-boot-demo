package com.kk.service;

import com.kk.po.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class IGirlServiceTest {
    @Autowired
    private IGirlService    girlService;

    @Test
    public void insertGirl() {
    }

    @Test
    public void getById() throws Exception {
        Girl girl = girlService.getById(8);
        Assert.assertEquals(new Integer(19),girl.getAge());
    }

    @Test
    public void listGirls() {
    }

    @Test
    public void updateGirl() {
    }

    @Test
    public void deleteGirl() {
    }

    @Test
    public void listGirlsByAge() {
    }
}