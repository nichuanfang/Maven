package cn.itcast.pojo;

import java.io.Serializable;

/**
 * @description: 散装数据实体
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-14 09:44
 * @version:
 **/
public class QueryVo implements Serializable {
    private String custname;
    private String custsource;
    private String custindustry;

    public void setCustindustry(String custindustry) {
        this.custindustry = custindustry;
    }

    private String custlevel;
    private int currentPage;
    private int pageSize;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public QueryVo() {
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustsource() {
        return custsource;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "custname='" + custname + '\'' +
                ", custsource='" + custsource + '\'' +
                ", custindusty='" + custindustry + '\'' +
                ", custlevel='" + custlevel + '\'' +
                '}';
    }

    public void setCustsource(String custsource) {
        this.custsource = custsource;
    }

    public String getCustindustry() {
        return custindustry;
    }

    public void setCustindusty(String custindustry) {
        this.custindustry = custindustry;
    }

    public String getCustlevel() {
        return custlevel;
    }

    public void setCustlevel(String custlevel) {
        this.custlevel = custlevel;
    }
}
