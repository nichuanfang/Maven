package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.UserOrders;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-13 18:02
 * @version:
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<UserOrders> getList() {
        return userMapper.getList();
    }
}
