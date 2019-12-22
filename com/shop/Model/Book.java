package com.shop.Model;



public  class Book implements Comparable<Book> {



    public String title;
    public long price;
    private String availability;
    private String publication;
    private double length;
    public Book() {
    }


    public Book(String Title, long price, String availability, String publication) {
        this.title = Title;
        this.price = price;
        this.availability = availability;
        this.publication= publication;
    }

    public int compareTo(Book that) {
        int titleCompare = this.title.compareTo(that.title);
        if (titleCompare != 0)
            return titleCompare;
        return Double.compare(this.length,that.length);


    }
    public   String getTitle() {
        return title;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public long  getPrice() {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public String  getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability =availability;
    }

    public String getPublication () {
        return publication;
    }


    public void setPublication(String publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Book [title =" + title + ",price= " + price + ", availability = " + availability + ", date of publication = "
                + publication + "]";
    }

}
