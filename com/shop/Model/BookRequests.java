package com.shop.Model;

public class BookRequests implements Comparable<BookRequests>{
    private String title;
    private int request;
    private  double length;
    public BookRequests(String title, int request) {
        this.title = title;
        this.request = request;

    }
    public int compareTo(BookRequests that) {
        int priceCompare =  Integer.compare(this.request,that.request);
        if (priceCompare != 0)
            return priceCompare;
        return Double.compare(this.length,that.length);

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getRequest() {
        return request;
    }

    public void setRequest(int request) {
        this.request = request;
    }
    @Override
    public String toString() {
        return "Request [title =" + title + ",requests = " + request + "]";
    }
}
