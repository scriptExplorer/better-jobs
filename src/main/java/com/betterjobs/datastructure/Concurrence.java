package com.betterjobs.datastructure;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Concurrence
 *
 */
public class Concurrence {

    public static void main(String[] args) {
 //synchronized 
        Collections.synchronizedList(new ArrayList<>());
        Collections.synchronizedMap(new HashMap<>());
        Collections.synchronizedSortedMap(new TreeMap<>());
//List

        //CopyOnWriteArrayList is a thread-safe version of ArrayList
        //only locks when adding/removing items
        // 适用场景：适用于读多写少的场景，比如黑名单、白名单等。
        CopyOnWriteArrayList<String> myOnWriteArrayList = new CopyOnWriteArrayList();
        myOnWriteArrayList.add("1");//O(n)
        myOnWriteArrayList.addIfAbsent("a");
        myOnWriteArrayList.get(0);//weak Consistency


        //CopyOnWriteArraySet is a thread-safe version of HashSet
        //Use CopyOnWriteArrayList to implement
        CopyOnWriteArraySet<String> myCopyOnWriteArraySet = new CopyOnWriteArraySet();
        myCopyOnWriteArraySet.add("1");



//Map
        //ConcurrentHashMap is a thread-safe version of HashMap
        // Has multiple locks: segment locks
        int initialCapacity = 16;
        float loadFactor = 0.75f;
        int concurrencyLevel = 2;
        ConcurrentHashMap<String, AtomicInteger> myConcurrentHashMap = new ConcurrentHashMap<String, AtomicInteger>(initialCapacity,
        loadFactor, concurrencyLevel);
        myConcurrentHashMap.computeIfAbsent("a", k -> new AtomicInteger());

        //ConcurrentHashMap
        ConcurrentNavigableMap<String, String> myConcurrentNavigableMap = new ConcurrentSkipListMap();

        //ConcurrentSkipListMap is a thread-safe version of TreeMap
        ConcurrentSkipListMap<String, String> myConcurrentSkipListMap = new ConcurrentSkipListMap();




//Queue
        //LinkedBlockingQueue is a thread-safe version of LinkedList
        // Has 2 locks: takeLock and putLock concurrent performance is better than ArrayBlockingQueue
        // Performance is better than ArrayBlockingQueue
        //适用场景：适用于需要阻塞功能的应用场景，比如限流、需要控制生产者和消费者速率匹配的场景。
        LinkedBlockingQueue<String> myLinkedBlockingQueue = new LinkedBlockingQueue(10);
        try {
            String item = myLinkedBlockingQueue.poll(1, TimeUnit.SECONDS);
            //queue.take();  //block until an item is available

            myLinkedBlockingQueue.offer("a");
            myLinkedBlockingQueue.put("a"); //block until space is available

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //ArrayBlockingQueue is a thread-safe version of Array
        // Has 1 lock: lock
        ArrayBlockingQueue<String> arrayQueue = new ArrayBlockingQueue(10);
        arrayQueue.offer("a");



        //ConcurrentLinkedQueue is a thread-safe version of LinkedList
        // Has 2 locks: head and tail
        // use CAS(Compare-And-Swap) to add/remove item
        // 性能更好，适用场景：适用于不需要阻塞功能的高并发环境，比如高并发访问日志、消息队列等。
        ConcurrentLinkedQueue<String> myConcureentLinkedque = new ConcurrentLinkedQueue();



//Lock
        ReentrantLock lock = new ReentrantLock();
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.unlock();

    }
}
