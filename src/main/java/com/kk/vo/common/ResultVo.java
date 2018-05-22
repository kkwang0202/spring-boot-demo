package com.kk.vo.common;


/**
 * @ClassName: ResultVo
 * @Description: HTTP请求返回的封装对象
 * @Author: wangyikai
 * @Date: 2018/5/22 12:41
 * @Version: 1.0
 **/
public class ResultVo<T> {
    private Integer code;

    private String  message;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
