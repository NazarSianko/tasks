package com.shop.Service;


import com.shop.Model.BookRequests;
import com.shop.Interface.IBookRequestsService;
import com.shop.Util.RequestsFileUtil;
import com.shop.Util.FileUtil;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class BookRequestsService implements IBookRequestsService {
   static  BookRequests[] requests;

    public void makeRequestsList() {


        //BookRequests request = new BookRequests("TestBook3", 4);
       // BookRequests request1 = new BookRequests("TestBook4", 2);
       // requests = new BookRequests[]{request, request1};
       // Arrays.sort(requests);

        final FileUtil<BookRequests> util = new RequestsFileUtil();

        util.writeToFile(requests);


        System.out.println("initial array");
        for (int i = 0; i < requests.length; i++) {
            System.out.println(requests[i]);
        }

        final BookRequests[] readedValues = util.readFromFile();

        System.out.println("readed array");
        for (int i = 0; i < readedValues.length; i++) {
            System.out.println(readedValues[i]);

        }
    }

    public void deleteRequest(int index) {

        List<BookRequests> array = new ArrayList<BookRequests>();

        array.addAll(Arrays.asList(requests));

        array.remove(index);
        BookRequests[] requests1 = new BookRequests[array.size()];

        for (int x = 0; x < array.size(); x++) {
            requests1[x] = array.get(x);
        }
        Arrays.sort(requests1);
        final FileUtil<BookRequests> util = new RequestsFileUtil();

        util.writeToFile(requests1);


        System.out.println("initial array");
        for (int i = 0; i < requests1.length; i++) {
            System.out.println(requests1[i]);
        }

        final BookRequests[] readedValues = util.readFromFile();

        System.out.println("readed array");
        for (int i = 0; i < readedValues.length; i++) {
            System.out.println(readedValues[i]);

        }
        requests = requests1;
    }
}
