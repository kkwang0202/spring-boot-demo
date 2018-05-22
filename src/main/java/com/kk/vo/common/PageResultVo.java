package com.kk.vo.common;

/**
 * @ClassName: PageResultVo
 * @Description: TODO
 * @Author: wangyikai
 * @Date: 2018/5/22 13:13
 * @Version: 1.0
 **/
public class PageResultVo extends ResultVo{
    private Long total;

    private Integer pageNo;

    private Integer pageSize;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
