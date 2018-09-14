package cn.itcast.pojo;

import java.io.Serializable;

/**
 * @description:用户pojo类
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-13 17:50
 * @version:
 **/
public class user implements Serializable {
    private int id;
    private String username;
    private String password;
    @Override
    public String toString() {
        return "user{" +
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
