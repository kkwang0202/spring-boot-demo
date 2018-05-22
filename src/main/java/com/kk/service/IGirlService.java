package com.kk.service;

import com.kk.po.Girl;

import java.util.List;

/**
 * @ClassName: IGirlService
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/21 22:17
 * @Version: 1.0
 **/
public interface IGirlService {
    
    Girl insertGirl(Girl girl) throws Exception;

    Girl getById(Integer id) throws Exception;

    List<Girl> listGirls() throws Exception;

    Girl updateGirl(Girl girl) throws Exception;

    void deleteGirl(Integer id) throws Exception;

    List<Girl> listGirlsByAge(Integer age) throws Exception;
}
