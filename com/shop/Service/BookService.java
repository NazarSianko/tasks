package com.shop.Service;
import com.shop.Interface.IBookService;

import java.util.Arrays;
import com.shop.Model.Book;
import com.shop.Parser;
import com.shop.Util.BookFileUtil;
import com.shop.Util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public  class BookService implements IBookService {
    static  Book [] books;



    public void makeBookList(String Title,String Title1,String Title2,String Title3, long price,long price1,long price2,
                             long price3,
                             String availability, String availability1, String availability2, String availability3, String publication,
                             String publication1,String publication2,String publication3) {

        Book book1 = new Book(Title,price, availability, publication);
        Book book2 = new Book(Title1,price1, availability1, publication1);
        Book book3 = new Book(Title2,price2, availability2, publication2);
        Book book4 = new Book(Title3,price3, availability3, publication3);


        books = new Book[]{book1,book2,book3,book4};
        Arrays.sort(books);
        final FileUtil<Book> util = new BookFileUtil();


        util.writeToFile(books);


        System.out.println("initial array");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        final Book[] readedValues = util.readFromFile();

        System.out.println("readed array");
        for (int i = 0; i < readedValues.length; i++) {
            System.out.println(readedValues[i]);

        }


    }


    public void deleteBook(int index) {

        List<Book> array = new ArrayList<Book>();

        array.addAll(Arrays.asList(books));

        array.remove(index);
        Book[] book = new Book[array.size()];

        for (int x = 0; x < array.size(); x++) {
            book[x] = array.get(x);
        }
        Arrays.sort(book);
        final FileUtil<Book> util = new BookFileUtil();
        util.writeToFile(book);
        System.out.println("Updated initial array");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }

        final Book[] readedValues = util.readFromFile();

        System.out.println("Updated readed array");
        for (int i = 0; i < readedValues.length; i++) {
            System.out.println(readedValues[i]);
        }
        this.books = book;



    }


}



