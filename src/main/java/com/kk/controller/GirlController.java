package com.kk.controller;

import com.kk.dto.girl.InsertGirlDto;
import com.kk.po.Girl;
import com.kk.service.IGirlService;
import com.kk.utils.BeanMapper;
import com.kk.utils.ResultUtils;
import com.kk.vo.common.ResultVo;
import com.kk.vo.girl.GirlVo;
import com.kk.vo.girl.InsertGirlVo;
import com.kk.vo.girl.UpdateGirlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @ClassName: GirlController
 * @Description: TODO
 * @Author: WangYiKai
 * @Date: 2018/5/21 21:42
 * @Version: 1.0
 **/
@RestController
@RequestMapping(value = "/girls")
public class GirlController {
    @Autowired
    private IGirlService    girlService;
    /**
    * @Description: 新增一个Girl
    * @param: [girl]
    * @return: com.kk.po.Girl
    * @Author: wangyikai
    * @Date: 2018/5/21 22:35
    * @Version: 1.0
    **/
    @PostMapping("")
    public ResultVo insertGirl(@Valid InsertGirlDto insertGirlDto, BindingResult bindingResult) throws Exception{
        if (bindingResult.hasErrors()) {
            return ResultUtils.error(bindingResult.getFieldError().getDefaultMessage());
        }
        Girl girl = BeanMapper.map(insertGirlDto,Girl.class);
        return ResultUtils.success(BeanMapper.map(girlService.insertGirl(girl),InsertGirlVo.class));
    }
    /**
    * @Description: 获取一个Girl的信息
    * @param: [id]
    * @return: com.kk.po.Girl
    * @Author: wangyikai
    * @Date: 2018/5/21 22:36
    * @Version: 1.0
    **/
    @GetMapping("/{id}")
    public ResultVo getById(@PathVariable Integer id) throws Exception{

        return ResultUtils.success(BeanMapper.map(girlService.getById(id),GirlVo.class));
    }
    /**
    * @Description: 获取所有Girl列表
    * @param: []
    * @return: java.util.List<com.kk.po.Girl>
    * @Author: wangyikai
    * @Date: 2018/5/22 9:46
    * @Version: 1.0
    **/
    @GetMapping("")
    public ResultVo listGirls() throws Exception{
        return ResultUtils.success(BeanMapper.mapList(girlService.listGirls(),GirlVo.class));
    }
    /**
    * @Description: 修改Girl信息
    * @param: [girl]
    * @return: com.kk.po.Girl
    * @Author: wangyikai
    * @Date: 2018/5/22 10:00
    * @Version: 1.0
    **/
    @PutMapping("")
    public ResultVo updateGirl(Girl girl) throws Exception{
        return ResultUtils.success(BeanMapper.map(girlService.updateGirl(girl),UpdateGirlVo.class));
    }
    /**
    * @Description: 通过ID删除Girl信息
    * @param: [id]
    * @return: void
    * @Author: wangyikai
    * @Date: 2018/5/22 10:02
    * @Version: 1.0
    **/
    @DeleteMapping("/{id}")
    public ResultVo deleteGirl(@PathVariable Integer id) throws Exception{
        girlService.deleteGirl(id);
        return ResultUtils.success();
    }
    /**
    * @Description: 通过年龄获取Girl列表
    * @param: [age]
    * @return: java.util.List<com.kk.po.Girl>
    * @Author: wangyikai
    * @Date: 2018/5/22 10:41
    * @Version: 1.0
    **/
    @GetMapping("/age/{age}")
    public ResultVo listGirlsByAge(@PathVariable Integer age) throws Exception{
        return ResultUtils.success(BeanMapper.mapList(girlService.listGirlsByAge(age),GirlVo.class));
    }
}
