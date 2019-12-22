package com.shop;

import com.shop.Service.BookRequestsService;
import com.shop.Service.BookService;
import com.shop.Service.OrderService;

public class MainService {
    public void SetOrderList() throws Exception {

        OrderService ord = new OrderService();
        ord.makeOrderList();
        ord.deleteOrder(0);


    }
    public void SetBookList() throws Exception {
        Parser parser = new Parser();
        BookService book = new BookService();
        book.makeBookList("bdsa","basddd", "DASDsad","basddg",20,15,
                10,31,"yes","yes","no","no",
                parser.toDate("12/11/1993").toString(),parser.toDate("11/1/1940").toString()
                , parser.toDate("14/09/1950").toString(),parser.toDate("14/12/1993").toString());

        book.deleteBook(0);
        book.deleteBook(1);

    }
    public void SetBookRequests() throws  Exception {
        BookRequestsService request = new BookRequestsService();
        request.makeRequestsList();
        request.deleteRequest(0);
    }
}

