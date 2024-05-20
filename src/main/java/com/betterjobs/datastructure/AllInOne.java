package com.betterjobs.datastructure;

import java.util.*;

public class AllInOne {

    public static void main(String [] args) {
//List

        //ArrayList  array implemented, have initial capacity
        //O(n): extends capacity/remove/contains
        ArrayList<String> myArrayList = new ArrayList<String>(5);
        myArrayList.add("1"); // O(1)
        myArrayList.get(0); // O(1)
        myArrayList.add(0,"3"); // O(n)
        myArrayList.contains("1"); //O(n)
        myArrayList.remove(0); //O(n)
        myArrayList.remove("1"); //O(n)

        //LinkedList double-ended list
        // don't have initial capacity
        //O(n): get by index
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("1"); //O(1)
        myLinkedList.get(0); //O(n)
        myLinkedList.contains("1"); //O(n)
        myLinkedList.remove(0); //O(n)

        //Vector thread-safe array
        // has initial capacity
        // O(n): extends capacity/remove/contains
        Vector<String> myVector = new Vector<String>(10);
        myVector.add("1"); //O(1)
        myVector.get(0); //O(1)
        myVector.remove(0); //O(n)
        myVector.contains("1"); //O(n)

//Map
        //HashMap multiple array buckets implements, non thread-safe
        //has initial capacity
        //O(n): extends capacity
        HashMap<String, String> myHashMap = new HashMap(10);
        myHashMap.put("1", "1"); //O(1)
        myHashMap.get("1"); //O(1)
        myHashMap.containsKey("1");//O(1);
        myHashMap.containsValue("1");//O(n)
        myHashMap.remove("1");//O(1)

        //HashTable: thread-safe version of HashMap
        //O(n): extends capacity
        Hashtable<String, String> myHashtable = new Hashtable<>(10);
        myHashtable.put("1", "1"); //O(1)
        myHashtable.get("1"); //O(1)
        myHashtable.containsKey("1"); //O(1)
        myHashtable.containsValue("1"); //O(n)
        myHashtable.remove("1"); //O(1)

        //LinkedHashMap: Keep added sequence, Hashtable + linkedList
        //O(n): extends capacity
        LinkedHashMap<String, String> myLinkedHashMap = new LinkedHashMap<>(10);
        myLinkedHashMap.put("1", "1"); //O(1)
        myLinkedHashMap.containsKey("1"); //O(1)
        myLinkedHashMap.containsValue("1");//O(n)
        myLinkedHashMap.remove("1");//O(1)

        //TreeMap: read-black tree
        // add/remove/contains  O(log(N))
        TreeMap<String, String> myTreeMap = new TreeMap<>();
        myTreeMap.put("1", "1"); //O(log n)
        myTreeMap.get("1"); //O(log n)
        myTreeMap.containsKey("1"); //O(log n)
        myTreeMap.remove("1"); //O(log n)

// Set
        //HashSet: use Hashmap implemented
        //has initial capacity
        //O(n): extends capacity
        HashSet<String> myHashSet = new HashSet<>(10);
        myHashSet.add("5"); //O(1)
        myHashSet.add("4");
        myHashSet.contains("1"); //O(1)
        myHashSet.remove("1");//O(1)

        //LinkedHashSet keep added sequence
        // has initial capacity
        //O(n): extends capacity
        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>(10);
        myLinkedHashSet.add("5"); //O(1)
        myLinkedHashSet.add("4");
        myLinkedHashSet.add("3");
        myLinkedHashSet.contains("1"); //O(1)


        //TreeSet in order
        //No initial capacity
        //O(log n): add/remove/contains
        TreeSet<String> myTreeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(Integer.valueOf(o1), Integer.valueOf(o2));
            }
        });
        myTreeSet.add("5"); //O(log n)
        myTreeSet.add("3");
        myTreeSet.add("2");
        myTreeSet.add("1");

//Queue
        //Queue single-ended list
        //LinkedList does not have initial capacity
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("1");//O(1)
        myQueue.peek();//O(1) get first 1
        myQueue.poll();//O(1)
        myQueue.add("1"); // throw Exception
        myQueue.remove();// throw Exception

        //Deque double-ended list
        Deque<String> myDeque = new ArrayDeque<>(10);
        myDeque.offerFirst("1"); //O(1)
        myDeque.offerLast("1"); //O(1)
        myDeque.pollFirst(); //O(1)
        myDeque.pollLast(); //O(1)

        //Stack
        //LIFO
        Stack<String> myStack = new Stack<String>();
        myStack.push("1"); //O(1)
        String stackItem = myStack.pop(); //O(1)


        //Heap
        //O(log n): offer/pull/delete
        Comparator<String> comparator = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(Integer.valueOf(o1).intValue(), Integer.valueOf(o2).intValue());
            }
        };
        PriorityQueue<String> myHeap = new PriorityQueue<>(10, comparator);
        myHeap.offer("5"); //O(log n)
        myHeap.offer("1");
        myHeap.offer("4");
        myHeap.offer("3");
        System.out.println("myHeap: " + myHeap);
        myHeap.poll();//O(log n)
        myHeap.peek();//O(1)


//        java.util.concurrent.ArrayBlockingQueue;
    }
}
