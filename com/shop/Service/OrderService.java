package com.shop.Service;

import com.shop.Model.Book;
import com.shop.Interface.IOrderService;
import com.shop.Model.Order;
import com.shop.Parser;
import com.shop.Util.FileUtil;
import com.shop.Util.OrderFileUtil;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class OrderService implements IOrderService {

   static Order[] orders;


    public void makeOrderList(String Title,String Title1,String Title2,String Title3,long id,
                              long id1,long id2,long id3,long price,
                              long price1,long price2,long price3,String status,
                              String status1,String status2,String status3,String implementation,String implementation1,
    String implementation2,String implementation3) throws Exception {




        Order order1 = new Order(Title,id,price,status,implementation);
        Order order2 = new Order(Title1,id1,price1,status1,implementation1);
        Order order3 = new Order(Title2,id2,price2,status2,implementation2);
        Order order4 = new Order(Title3,id3,price3,status3,implementation3);

        orders = new Order[]{order1, order2, order3, order4};
        FileUtil<Order> util1 = new OrderFileUtil();
        Arrays.sort(orders);

        util1.writeToFile(orders);


        System.out.println("initial array");
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }

        final Order[] readedValues1 = util1.readFromFile();

        System.out.println("readed array");
        for (int i = 0; i < readedValues1.length; i++) {
            System.out.println(readedValues1[i]);
        }
    }


    public void addOrder(String title, long id, long price, String status, String implementation) {

        Order order = new Order(title, id, price, status, implementation);

    }

    public void deleteOrder(int index) {

        List<Order> array = new ArrayList<Order>();

        array.addAll(Arrays.asList(orders));

        array.remove(index);
        Order[] orders1 = new Order[array.size()];

        for (int x = 0; x < array.size(); x++) {
            orders1[x] = array.get(x);
        }
        Arrays.sort(orders1);
        final FileUtil<Order> util1 = new OrderFileUtil();
        util1.writeToFile(orders1);
        System.out.println("Updated initial array");
        for (int i = 0; i < orders1.length; i++) {
            System.out.println(orders1[i]);
        }

        final Order[] readedValues = util1.readFromFile();

        System.out.println("Updated readed array");
        for (int i = 0; i < readedValues.length; i++) {
            System.out.println(readedValues[i]);
        }
        orders = orders1;


    }
}
