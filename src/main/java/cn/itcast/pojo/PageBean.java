package cn.itcast.pojo;

import java.util.List;

public class PageBean<T> {
    
	private int totalCount; //总记录数
	
	private int currentPage; //当前页码
	
	private int pageSize;  //每页显示的条数
	
    private List<T> list; //当前页的数据

    private int totalPage; //总页数

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
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
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
    
}
