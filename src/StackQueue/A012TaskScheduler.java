package StackQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class A012TaskScheduler {
    public static PriorityQueue<A012TaskScheduler> queue = new PriorityQueue<>((t1, t2) -> t2.id - t1.id);
    private int id;
    private String task;


    public String getNextTask() {
        return this.task + " - " + this.id;
    }

    public A012TaskScheduler(int id, String task) {
        this.id = id;
        this.task = task;
        queue.add(this);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A012TaskScheduler task = new A012TaskScheduler(1, "djami");
        for (int i = 0; i < 7; i++) {
            String input = sc.nextLine();
            if (input.startsWith("Add")) {
                String[] inputArr = input.split("\\s+");
                new A012TaskScheduler(Integer.parseInt(inputArr[2]), inputArr[1]);
            } else if(input.equals("getNextTask")){
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek().getNextTask());
                }
            }
        }


    }
}

