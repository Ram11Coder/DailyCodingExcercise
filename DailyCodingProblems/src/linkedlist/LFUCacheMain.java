package linkedlist;

public class LFUCacheMain {
  public static void main(String[] args) {

    LFUCache lfu = new LFUCache(2);
    lfu.put(1, 10);
    lfu.put(2, 20);
    System.out.println(lfu.mapFreq);
    System.out.println(lfu.cache);
    System.out.println( lfu.get(1));
    lfu.put(3, 30);
    System.out.println(lfu.mapFreq);
    System.out.println(lfu.cache);
  }
}
