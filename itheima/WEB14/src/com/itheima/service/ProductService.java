package com.itheima.service;

import com.itheima.VO.PageBean;
import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:zhaomeng
 * @Description:
 * @Date: Created in 9:27 2018/6/16
 * @Modified By:
 */
public class ProductService {
    public List<Product> findAllProduct() throws SQLException {
        ProductDao dao=new ProductDao();
        List<Product> productList = dao.findAllProduct();
        return productList;
    }
   //封装一个PageBean
    public PageBean findAllPageBean(int currentCount,int currentPage) throws SQLException {
     PageBean pageBean=new PageBean();
       //总条数
        ProductDao dao=new ProductDao();
        int totalCount = dao.getTotalCount();
        pageBean.setTotalCount(totalCount);
        //总页数
        if(totalCount%currentCount==0){
            pageBean.setTotalPage(totalCount/currentCount);
        }else{
            pageBean.setTotalPage((totalCount/currentCount)+1);
        }
     pageBean.setCurrentCount(currentCount);
     pageBean.setCurrentPage(currentPage);
     int index=(currentPage-1)*currentCount;
     List<Product> productList = dao.findProductListForPageBean(index,currentCount);
     pageBean.setProductList(productList);
        return pageBean;
    }

    public List<Object> findProductByWord(String word) throws SQLException {
        ProductDao dao =new ProductDao();
         return dao.findProductByWord(word);


    }
}
