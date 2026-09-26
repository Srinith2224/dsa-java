package javakit;

import java.util.*;

public class d02 {
    public static void main(String[] args) {
        dequeDemo();
        priorityQueueDemo();
        arraySort();
        nullOrEmptyExample();

    }


    static void dequeDemo() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(1);
        dq.push(2);
        dq.offer(3);
        int a = dq.poll();
        int b = dq.peek();
        System.out.println(a);
        System.out.println(b);
        int c = dq.poll();
        int d = dq.peek();
        System.out.println(c);
        System.out.println(d);
    }


    static void priorityQueueDemo() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(5);
        pq.offer(8);
        pq.offer(7);
        pq.offer(1);
        int a = pq.poll();
        System.out.println(a);
        int b = pq.peek();
        System.out.println(b);
        int c = pq.size();
        System.out.println(c);
    }

    static void arraySort() {


        int[][] intervals = { {7, 3}, {1, 2}, {4, 6} };
        System.out.println("before"+Arrays.deepToString(intervals));

        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        System.out.println("after "+ Arrays.deepToString(intervals));
    }

    static void nullOrEmptyExample() {
        Deque<Integer> dq = new ArrayDeque<>();
        Integer a = dq.poll();
        System.out.println(a);
        //if dq = null ; then  we get nullpointerexception here
    }



}
