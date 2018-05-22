package com.kk.repository;

import com.kk.po.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: GirlRepository
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/21 22:24
 * @Version: 1.0
 **/
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    List<Girl> findAllByAge(Integer age);
}
