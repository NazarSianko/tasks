package com.shop.Interface;

public interface IBookService {

    void makeBookList(String Title,String Title1,String Title2,String Title3, long price,long price1,long price2,long price3,
                      String availability, String availability1, String availability2, String availability3, String publication,
                      String publication1,String publication2,String publication3);

     void deleteBook(int index);

}
