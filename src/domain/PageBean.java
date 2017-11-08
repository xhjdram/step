package domain;

import java.util.List;

public class PageBean {
    private Integer totalPage;
    private Integer totalCount;
    private Integer currentPage;
    private Integer pageCount;
    private List<Customer> list;

    public PageBean(Integer totalCount, Integer currentPage, Integer pageCount) {
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.pageCount = pageCount;
        if (this.currentPage == null) {
            this.currentPage = 1;
        }
        if (this.pageCount == null) {
            this.pageCount = 3;
        }
        double d = Math.ceil(this.totalCount / this.pageCount);
        this.totalPage = (int) d;
    }

    public Integer getStart() {
        Integer start = (currentPage - 1) * pageCount;
        return start;
    }


    public Integer getTotalPage() {

        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<Customer> getList() {
        return list;
    }

    public void setList(List<Customer> list) {
        this.list = list;
    }
}
