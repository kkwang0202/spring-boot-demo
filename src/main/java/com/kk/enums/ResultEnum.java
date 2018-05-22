package com.kk.enums;

/**
 * @ClassName: ResultEnum
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/22 14:21
 * @Version: 1.0
 **/
public enum ResultEnum {
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(1,"成功"),
    FAIL(0,"失败"),
    TOO_YOUNG(100,"年龄太小了");
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
