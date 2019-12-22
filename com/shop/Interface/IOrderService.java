package com.shop.Interface;

public interface IOrderService {
    void makeOrderList(String Title,String Title1,String Title2,String Title3,long id,
                       long id1,long id2,long id3,long price,
                       long price1,long price2,long price3,String status,
                       String status1,String status2,String status3,String implementation,String implementation1,
                       String implementation2,String implementation3) throws Exception;
    void deleteOrder(int index);
}
