package cn.itcast.mapper;

import cn.itcast.pojo.UserOrders;

import java.util.List;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-13 18:01
 * @version:
 **/
public interface UserMapper {
    public List<UserOrders> getList();
}
