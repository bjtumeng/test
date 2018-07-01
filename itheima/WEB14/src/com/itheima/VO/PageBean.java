package com.itheima.VO;

import com.itheima.domain.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 9:46 2018/6/16
 * @Modified By:
 */
public class PageBean<T> {
    //总页数(5页)
    private int totalPage;
    //当前页数
    private int currentPage;
    //当前页商品详情(第2页的商品详情)
    List<T> productList;
    //总条数
    private int totalCount;
    //当前页商品数(12)
    private int currentCount;
   public  int     getTotalPage() {
       return totalPage;
   }public void    setTotalPage(int totalPage) {
       this.totalPage = totalPage;
   }
   public int     getCurrentPage() {
       return currentPage;
   }
   public void    setCurrentPage(int currentPage) {
       this.currentPage = currentPage;
   }
   public List<T> getProductList() {
       return productList;
   }
   public void    setProductList(List<T> productList) {
       this.productList = productList;
   }
   public int     getTotalCount() {
       return totalCount;
   }
   public void    setTotalCount(int totalCount) {
       this.totalCount = totalCount;
   }
   public int     getCurrentCount() {
       return currentCount;
   }public void    setCurrentCount(int currentCount) {
       this.currentCount = currentCount;
   }

}
