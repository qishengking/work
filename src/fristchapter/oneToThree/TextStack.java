package fristchapter.oneToThree;

import edu.princeton.cs.algs4.*;

//123123123
public class TextStack {

    public static void main(String[] args){
//        Stack<String> stack = new Stack<String>();
//        stack.push("Test");
//        stack.push("Stack");
//        stack.push("Queue");
//        stack.push("Bag");
//
//        Queue<Date> queue = new Queue<Date>();
//        queue.enqueue(new Date(12,31,1999));
//        queue.enqueue(new Date(12,12,2012));
//        queue.enqueue(new Date(11,10,2013));
//
//        Bag<String> bag = new Bag<String>();
//        bag.add("Stack");
//        bag.add("Bag");
//        bag.add("Queue");
//
//
//
//        for(String str:stack){
//            System.out.println(str);
//        }
//
//        for(Date d:queue){
//            System.out.println(d);
//        }
//
//        for (String str:bag){
//            System.out.println(str);
//        }
        int[] a = readInts("asdfg");
        System.out.println(a);
    }

    public static int[] readInts(String name){
        In in = new In(name);
        Queue<Integer> q = new Queue<Integer>();
        while (!in.isEmpty()){
            q.enqueue(in.readInt());
        }
        int N = q.size();
        int[] a = new int[N];
        for(int i = 0; i<N;i++){
            a[i] = q.dequeue();
        }
        return a;
    }
}
