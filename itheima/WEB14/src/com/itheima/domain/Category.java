package com.itheima.domain;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 21:19 2018/6/5
 * @Modified By:
 */
public class Category {
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    private  String cid;
    private  String cname;

}
