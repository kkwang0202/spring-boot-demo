package com.kk.dto.girl;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @ClassName: InsertGirlDto
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/22 12:00
 * @Version: 1.0
 **/
public class InsertGirlDto {
    @Min(value = 18,message = "未成年哦")
    private Integer age;
    @NotBlank(message = "cupSize不能为空")
    private String  cupSize;

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
