package com.shop.Util;

public interface FileUtil<T> {

    T[] readFromFile();


    void writeToFile(final T[] values);


    String toLine(T entity);


    T fromLine(String line);


}
