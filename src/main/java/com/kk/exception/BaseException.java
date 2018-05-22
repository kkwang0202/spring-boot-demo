package com.kk.exception;

import com.kk.enums.ResultEnum;

/**
 * @ClassName: BaseException
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/22 14:00
 * @Version: 1.0
 **/
public class BaseException extends RuntimeException{
    private Integer code;

    public BaseException() {
        super();
    }

    public BaseException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
