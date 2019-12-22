package com.shop;

public class Test {


    public static void main(String s[]) throws Exception {
        MainService mainservice = new MainService();
        mainservice.SetOrderList();
        mainservice.SetBookList();
        mainservice.SetBookRequests();

    }
}

