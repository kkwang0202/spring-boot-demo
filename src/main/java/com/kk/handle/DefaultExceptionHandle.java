package com.kk.handle;

import com.kk.exception.BaseException;
import com.kk.utils.ResultUtils;
import com.kk.vo.common.ResultVo;
import org.dozer.MappingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * @ClassName: DefaultExceptionHandle
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/22 14:02
 * @Version: 1.0
 **/
@ControllerAdvice
public class DefaultExceptionHandle {
    private Logger  logger = LoggerFactory.getLogger(DefaultExceptionHandle.class);

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResultVo processCustomerException(NativeWebRequest request,Exception e) {
        ResultVo resultVo = null;
        if (e instanceof HttpRequestMethodNotSupportedException) {
            //未支持的接口或者方法
            resultVo = ResultUtils.error(9000,e.getMessage());
        }else if (e instanceof MappingException) {
            resultVo = ResultUtils.error(9001,e.getMessage());
        }else if (e instanceof BaseException) {
            resultVo = ResultUtils.error(((BaseException) e).getCode(),e.getMessage());
        }
//        else{
//            resultVo  = ResultUtils.error(9999,e.getMessage());
//            logger.error("UnKnowException", e);
//        }
        return resultVo;
    }
}
