package cn.itcast.pojo;

import java.util.List;

/**
 * @description:包含主表和从表的pojo类,将主从表的一对一关系或者一对多关系捆绑起来
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-13 18:08
 * @version:
 **/
public class UserOrders {
    private int id;
    private String username;
    private String password;
    private List<Orders> list;

    public List<Orders> getList() {
        return list;
    }

    public void setList(List<Orders> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserOrders{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
