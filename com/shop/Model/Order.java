package com.shop.Model;

public class Order implements Comparable<Order>{


    private long id;
    private long price;
    private String status;
    private String implementation;
     private String title;
     private double length;

    public Order() {
    }


    public Order(String Title, long id, long price, String status, String implementation) {


        this.id = id;
        this.price = price;
        this.status = status;
        this.implementation = implementation;
        this.title = Title;




    }

    public int compareTo(Order that) {
        int dtCompare = this.implementation.compareTo(that.implementation);
        if (dtCompare != 0)
            return dtCompare;
        return Double.compare(this.length, that.length);
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImplementation() {
        return implementation;
    }


    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    @Override
    public String toString() {
        return "Order [id  = " + id + ", title =" +  title + ",price= " + price + ", status = " + status + ", implementation = "
                + implementation + "]";
    }

}
