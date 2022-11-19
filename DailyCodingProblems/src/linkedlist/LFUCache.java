package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LFUCache {

  int minFreq;
  int currSize;
  int capacity;
  Map<Integer, DLLNode> cache;
  Map<Integer, DoublyLinkedlist> mapFreq;

  LFUCache(int capacity) {
    this.capacity = capacity;
    this.currSize = 0;
    this.minFreq = 0;
    cache = new HashMap<>();
    mapFreq = new HashMap<>();
  }

  public int get(int key) {
    DLLNode currNode = cache.get(key);
    if (currNode == null)
      return -1;
    updateNode(currNode);

    return currNode.value;

  }


  public void put(int key, int value) {
    if (capacity == 0)
      return;

    if (cache.containsKey(key)) {
      DLLNode currNode = cache.get(key);
      currNode.value = value;
      updateNode(currNode);

    } else {
      currSize++;
      if (capacity < currSize) {
        DoublyLinkedlist minFreqMap = mapFreq.get(minFreq);
        cache.remove(minFreqMap.tail.prev.key);
        minFreqMap.removeNode(minFreqMap.tail.prev);
        currSize--;
      }
      minFreq = 1;
      DLLNode newNode = new DLLNode(key, value);

      DoublyLinkedlist freqMap = mapFreq.getOrDefault(1, new DoublyLinkedlist());
      freqMap.insertNode(newNode);
      mapFreq.put(1, freqMap);
      cache.put(key, newNode);
    }
  }

  private void updateNode(DLLNode currNode) {
    int freq = currNode.frequency;
    DoublyLinkedlist currMap = mapFreq.get(freq);
    currMap.removeNode(currNode);

    if (freq == minFreq && currMap.listSize == 0) {
      minFreq++;
    }

    currNode.frequency++;

    DoublyLinkedlist newList = mapFreq.getOrDefault(currNode.frequency, new DoublyLinkedlist());
    newList.insertNode(currNode);
    mapFreq.put(currNode.frequency, newList);
  }
}


class DLLNode {
  int key, value, frequency;
  DLLNode next, prev;

  public DLLNode(int key, int value) {
    this.key = key;
    this.value = value;
    this.frequency = 1;
  }
}


class DoublyLinkedlist {
  DLLNode head, tail;
  int listSize;

  public DoublyLinkedlist() {
    head = new DLLNode(0, 0);
    tail = new DLLNode(0, 0);
    head.next = tail;
    tail.prev = head;
    this.listSize = 0;
  }

  public void insertNode(DLLNode currNode) {

    currNode.next = head.next;
    currNode.next.prev = currNode;
    head.next = currNode;
    currNode.prev = head;
    listSize++;
  }

  public void removeNode(DLLNode currNode) {

    currNode.prev.next = currNode.next;
    currNode.next.prev = currNode.prev;
    listSize--;
  }
}


