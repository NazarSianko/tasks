package com.shop.Util;

import com.senla.training.FileWorker;
import com.senla.training.TextFileWorker;
import com.shop.Model.Order;

public final  class OrderFileUtil implements FileUtil<Order> {


        private static final String TEST_FILE = "digital_Library1.csv";


        private final FileWorker fileWorker;


        public OrderFileUtil() {
            fileWorker = new TextFileWorker(TEST_FILE);
        }


        @Override
        public Order[] readFromFile() {
            final String[] lines = fileWorker.readFromFile();

            if (lines == null || lines.length == 0) {
                throw new IllegalArgumentException();
            }

            final Order[] result1 = new Order[lines.length];

            for (int i = 0; i < lines.length; i++) {
                result1[i] = fromLine(lines[i]);
            }

            return result1;
        }


        @Override
        public void writeToFile(final Order[] values) {
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
        public String toLine(final Order order) {
            if (order == null) {
                throw new IllegalArgumentException();
            }

            final String[] array = new String[] {
                   String.valueOf(order.getTitle()),
                    String.valueOf(order.getPrice()),
                    String.valueOf(order.getId()),
                    String.valueOf(order.getImplementation()),
                    String.valueOf((order.getStatus()))
            };
            return String.join(";", array);
        }


        @Override
        public Order fromLine(final String line) {
            if (line == null || line.isEmpty()) {
                throw new IllegalArgumentException();
            }
            final String[] parts = line.split(";");

            final Order result1 = new Order(
                     parts[0],
                    Long.valueOf(parts[1]),
                    Long.valueOf(parts[2]),
                    parts[3],
                    parts[4]
            );
            return result1;
        }

    }



