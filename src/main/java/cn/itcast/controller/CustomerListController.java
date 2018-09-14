package cn.itcast.controller;

import cn.itcast.pojo.BaseDict;
import cn.itcast.pojo.Customer;
import cn.itcast.pojo.PageBean;
import cn.itcast.pojo.QueryVo;
import cn.itcast.service.CustomerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-14 07:30
 * @version:
 **/
@Controller

public class CustomerListController {
    @Value("${base_dict.custSource}")
    private String custSource;
    @Value("${base_dict.custIndustry}")
    private String custIndustry;
    @Value("${base_dict.custLevel}")
    private String custLevel;
    @Resource
    private CustomerService service;
    @RequestMapping("/customerlist.action")
    public String getCustomerList(Model model, QueryVo vo){
        //根据分类id来查询字典表获得客户来源,所属行业,客户级别的数据
        List<BaseDict> custSourcelist = null;
        List<BaseDict> custIndustrylist = null;
        List<BaseDict> custLevellist = null;
        if(vo.getCurrentPage()==0) {
            vo.setCurrentPage(1);
        }
        if(vo.getPageSize()==0) {
            vo.setPageSize(6);
        }
        // 在service封装JavaBean返回给controller
        PageBean<Customer> page = null;
        if(vo.getCustname()!=null) {
            vo.setCustname(vo.getCustname().trim());
        }
        try {
            custSourcelist = service.getItemList(custSource);
            custIndustrylist = service.getItemList(custIndustry);
            custLevellist = service.getItemList(custLevel);

            page = service.getPageBean(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("custSourcelist",custSourcelist);
        model.addAttribute("custIndustrylist",custIndustrylist);
        model.addAttribute("custLevellist",custLevellist);
        model.addAttribute("page",page);
        model.addAttribute("vo",vo);
        return "customer";
    }

    @RequestMapping("/edit.action")
    @ResponseBody
    public Customer findCustomerById(String id){
        Customer customer = service.findCustomerById(id);
        return customer;
    }

    @ResponseBody
    @RequestMapping("/update.action")
    public boolean update(Customer customer){
        try {
            service.update(customer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @RequestMapping("/delete.action")
    @ResponseBody
    public boolean delete(String id){
        try {
            service.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
