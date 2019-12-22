package com.shop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parser {
    private  String DATE_FORMAT = "dd/MM/yyyy";
    private  DateFormat FORMATTER = new SimpleDateFormat(DATE_FORMAT);

    public Date toDate(String dateInString)  throws ParseException  {
        return FORMATTER.parse(dateInString);
    }

    public String toString(Date date) {
        return FORMATTER.format(date);
    }


}
