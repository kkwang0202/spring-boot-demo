package com.kk.utils;

import com.kk.vo.common.PageResultVo;
import com.kk.vo.common.ResultVo;
import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName: ResultUtils
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/22 12:55
 * @Version: 1.0
 **/
public class ResultUtils {
    private final static Integer FAIL = 0;
    private final static Integer SUCCESS= 1;
    private final static String SUCCESS_MESSAGE = "请求成功";
    private final static String FAIL_MESSAGE = "请求失败";

    public static ResultVo success() {
        return success(null);
    }
    public static ResultVo success(Object object) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(SUCCESS);
        resultVo.setMessage(SUCCESS_MESSAGE);
        resultVo.setData(object);
        return resultVo;
    }

    public static ResultVo  paged(Iterable list, Integer pageNo, Integer pageSize, Long total) {
        PageResultVo pageResultVo = new PageResultVo();
        pageResultVo.setCode(SUCCESS);
        pageResultVo.setMessage(SUCCESS_MESSAGE);
        pageResultVo.setPageNo(pageNo);
        pageResultVo.setPageSize(pageSize);
        pageResultVo.setTotal(total);
        pageResultVo.setData(list);
        return pageResultVo;
    }
    public static ResultVo error(Integer code, String message) {
        ResultVo resultVo = new ResultVo();
        if (null == code) {
            resultVo.setCode(FAIL);
        }else {
            resultVo.setCode(code);
        }
        if (StringUtils.isBlank(message)) {
            resultVo.setMessage(FAIL_MESSAGE);
        }else {
            resultVo.setMessage(message);
        }
        return resultVo;
    }

    public static ResultVo error(String message) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(FAIL);
        if (StringUtils.isBlank(message)) {
            resultVo.setMessage(FAIL_MESSAGE);
        }else {
            resultVo.setMessage(message);
        }
        return resultVo;
    }

}
