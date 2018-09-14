package cn.itcast.service;

import cn.itcast.mapper.CustomerMapper;
import cn.itcast.pojo.BaseDict;
import cn.itcast.pojo.Customer;
import cn.itcast.pojo.PageBean;
import cn.itcast.pojo.QueryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-14 08:22
 * @version:
 **/
@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerMapper mapper;

    @Override
    public List<BaseDict> getItemList(String type) {
        return mapper.getItemList(type);
    }

    @Override
    public PageBean<Customer> getPageBean(QueryVo vo) {
        //封装pagebean
        //1.分页查询
        int start = (vo.getCurrentPage()-1)*vo.getPageSize();
//        List<Customer> list = mapper.getCustomerList(start,vo.getPageSize());
        List<Customer> list = mapper.getCustomerList(start,vo);
        PageBean<Customer> pageBean = new PageBean<>();
        //查询总数目 totalcount
//        int totalcount = mapper.getTotalcount();
        int totalcount = mapper.getTotalcount(vo);
        int totalPage = (int) Math.ceil(1.0*totalcount/vo.getPageSize());
        pageBean.setList(list);
        pageBean.setCurrentPage(vo.getCurrentPage());
        pageBean.setPageSize(vo.getPageSize());
        pageBean.setTotalCount(totalcount);
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

    @Override
    public Customer findCustomerById(String id) {
        return mapper.findCustomerById(id);
    }

    @Override
    public void update(Customer customer) {
        mapper.update(customer);
    }

    @Override
    public void delete(String id) {
        mapper.delete(id);
    }
}
