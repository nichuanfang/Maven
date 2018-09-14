package cn.itcast.service;

import cn.itcast.pojo.BaseDict;
import cn.itcast.pojo.Customer;
import cn.itcast.pojo.PageBean;
import cn.itcast.pojo.QueryVo;

import java.util.List;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-14 08:22
 * @version:
 **/
public interface CustomerService {
    public List<BaseDict> getItemList(String type);

    PageBean<Customer> getPageBean(QueryVo vo);

    Customer findCustomerById(String id);

    void update(Customer customer);

    public void delete(String id);
}
