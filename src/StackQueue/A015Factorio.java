package StackQueue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Scanner;

public class A015Factorio {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split("\\|");
        ArrayDeque<Robot> queue = new ArrayDeque<>();
        for (int i = 0; i < firstLine.length; i++) {
            String[] params = firstLine[i].split("-");
            queue.add(new Robot(params[0], Integer.parseInt(params[1])));
        }

        String startTimeInput = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");

        Date startTime = dateFormat.parse(startTimeInput);
    }

    static class Robot {
        private String name;
        private int processTime;

        public Robot(String name, int processTime) {
            this.name = name;
            this.processTime = processTime;
        }

    }
}
