package cn.itcast.mapper;

import cn.itcast.pojo.BaseDict;
import cn.itcast.pojo.Customer;
import cn.itcast.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-14 08:17
 * @version:
 **/
public interface CustomerMapper {

    public List<BaseDict> getItemList(String type);

    List<Customer> getCustomerList(@Param("start") int start, @Param("vo") QueryVo vo);

    int getTotalcount(@Param("vo")QueryVo vo);

    Customer findCustomerById(String id);

    void update(Customer customer);

    public void delete(String id);
}
