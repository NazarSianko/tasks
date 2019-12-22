package com.shop.Util;

import com.senla.training.FileWorker;
import com.senla.training.TextFileWorker;
import com.shop.Model.Book;


public final class BookFileUtil implements FileUtil<Book> {

        private static final String TEST_FILE = "digital_Library.csv";


        private final FileWorker fileWorker;


        public BookFileUtil() {
            fileWorker = new TextFileWorker(TEST_FILE);
        }


        @Override
        public Book[] readFromFile() {

            final String[] lines = fileWorker.readFromFile();

            if (lines == null || lines.length == 0) {
                throw new IllegalArgumentException();
            }

            final Book[] result = new Book[lines.length];

            for (int i = 0; i < lines.length; i++) {
                result[i] = fromLine(lines[i]);
            }

            return result;
        }


        @Override
        public void writeToFile(final Book[] values) {
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
        public String toLine(final Book book) {
            if (book == null) {
                throw new IllegalArgumentException();
            }

            final String[] array = new String[] {
                    String.valueOf(book.getTitle()),
                    String.valueOf(book.getPrice()),
                    String.valueOf(book.getAvailability()),
                    String.valueOf(book.getPublication())
            };
            return String.join(";", array);
        }


        @Override
        public Book fromLine(final String line) {
            if (line == null || line.isEmpty()) {
                throw new IllegalArgumentException();
            }
            final String[] parts = line.split(";");

            final Book result = new Book(
                    parts[0],
                    Integer.valueOf(parts[1]),
                    parts[2],
                    String.valueOf(parts[3])
            );
            return result;
        }

    }

