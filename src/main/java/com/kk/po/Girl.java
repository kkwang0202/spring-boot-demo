package com.kk.po;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName: Girl
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/21 22:18
 * @Version: 1.0
 **/
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer age;
    private String cupSize;

    public Girl() {
    }

    public Girl(Integer id, Integer age, String cupSize) {
        this.id = id;
        this.age = age;
        this.cupSize = cupSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", age=" + age +
                ", cupSize='" + cupSize + '\'' +
                '}';
    }
}
