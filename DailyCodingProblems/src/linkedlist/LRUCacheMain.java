package linkedlist;

public class LRUCacheMain {
  public static void main(String[] args) {
    LRUCache lru = new LRUCache(2);

    lru.put(1, 10);
    lru.put(2, 20);
    System.out.println(lru.map);
    lru.put(3, 20);
    System.out.println(lru.map);

  }
}
