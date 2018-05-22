package com.kk.dto.girl;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @ClassName: UpdateGirlDto
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/22 12:01
 * @Version: 1.0
 **/
public class UpdateGirlDto {
    @NotNull(message = "id不能为空")
    private Integer id;
    @NotNull(message = "age不能为空")
    private Integer age;
    @NotBlank(message = "cupSize不能为空")
    private String cupSize;

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
}
