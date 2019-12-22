package com.shop.Util;

import com.senla.training.FileWorker;
import com.senla.training.TextFileWorker;
import com.shop.Model.BookRequests;

public final class RequestsFileUtil implements FileUtil<BookRequests> {

    private static final String TEST_FILE = "BooksRequests.csv";


    private final FileWorker fileWorker;


    public RequestsFileUtil() {
        fileWorker = new TextFileWorker(TEST_FILE);
    }


    @Override
    public BookRequests[] readFromFile() {
        final String[] lines = fileWorker.readFromFile();

        if (lines == null || lines.length == 0) {
            throw new IllegalArgumentException();
        }

        final BookRequests[] result = new BookRequests[lines.length];

        for (int i = 0; i < lines.length; i++) {
            result[i] = fromLine(lines[i]);
        }

        return result;
    }


    @Override
    public void writeToFile(final BookRequests[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();
        }
        final String[] lines = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            lines[i] = toLine(values[i]);
        }
        fileWorker.writeToFile(lines);
    }


    @Override
    public String toLine(final BookRequests request) {
        if (request == null) {
            throw new IllegalArgumentException();
        }

        final String[] array = new String[] {
                String.valueOf(request.getTitle()),
                String.valueOf(request.getRequest()),

        };
        return String.join(";", array);
    }


    @Override
    public BookRequests fromLine(final String line) {
        if (line == null || line.isEmpty()) {
            throw new IllegalArgumentException();
        }
        final String[] parts = line.split(";");

        final BookRequests result = new BookRequests(
                String.valueOf(parts[0]),
                Integer.valueOf(parts[1])
                );
        return result;
    }

}

