package com.kk.service.impl;

import com.kk.enums.ResultEnum;
import com.kk.exception.BaseException;
import com.kk.po.Girl;
import com.kk.repository.GirlRepository;
import com.kk.service.IGirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: GirlServiceImpl
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/21 22:18
 * @Version: 1.0
 **/
@Service
public class GirlServiceImpl implements IGirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    @Override
    public Girl insertGirl(Girl girl) {
        Example<Girl> example = Example.of(girl);
        boolean isExists = girlRepository.exists(example);
        System.out.println("还未添加:" + isExists);
        if (!isExists) {
            return girlRepository.save(girl);
        }else {
            return null;
        }
    }

    @Override
    public Girl getById(Integer id) {
        //spring boot 1.5.4 可用此方法
//        return girlRepository.findOne(id);
        //spring boot 2.0 可用此方法
        Girl girl =  girlRepository.findById(id).orElse(null);
        Integer age = girl.getAge();
        if (age < 18) {
            throw new BaseException(ResultEnum.TOO_YOUNG);
        }
        return girl;
    }

    @Override
    public List<Girl> listGirls() {
        return girlRepository.findAll();
    }

    @Override
    public Girl updateGirl(Girl girl) {
        boolean isExists = girlRepository.existsById(girl.getId());
        if (isExists) {
            return girlRepository.save(girl);
        }else {
            return null;
        }

    }

    @Override
    public void deleteGirl(Integer id) {
        girlRepository.deleteById(id);
    }

    @Override
    public List<Girl> listGirlsByAge(Integer age) {
        return girlRepository.findAllByAge(age);
    }
}
