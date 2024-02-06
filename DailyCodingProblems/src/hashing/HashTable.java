package hashing;

import java.util.LinkedList;

/**
 * HashTable
 * 
 * k - Integer v - String
 * 
 * get(k) : v
 * 
 * put(k,v)
 * 
 * remove(k)
 * 
 * collision chaining
 * 
 * LinkedList<Entry>[]
 * 
 * [LL,LL,LL,LL]
 * 
 */
public class HashTable {

	// This is a implementation class we don't want to expose the class outside
	private class Entry {
		private Integer key;
		private String value;

		public Entry(Integer key, String value) {
			this.key = key;
			this.value = value;
		}

	}

	private LinkedList<Entry> entries[] = new LinkedList[8];

	public void put(Integer key, String value) {

		var entry = getEntry(key);
		if (entry != null) {
			entry.value = value;
			return;
		}
		LinkedList<Entry> bucket = getOrCreateBucket(key);
		bucket.add(new Entry(key, value));

	}

	public String get(Integer key) {
		Entry bucket = getEntry(key);
		return (bucket == null) ? null : bucket.value;
	}

	public void remove(Integer key) {
		Entry bucket = getEntry(key);

		if (bucket == null)
			throw new IllegalStateException();
		getBucket(key).remove(bucket);

	}

	public LinkedList<Entry> getBucket(int key) {
		return entries[hashcode(key)];
	}

	public Entry getEntry(Integer key) {
		LinkedList<Entry> bucket = getBucket(key);

		if (bucket != null) {
			for (Entry entry : bucket) {
				if (entry.key == key)
					return entry;
			}
		}
		return null;
	}

	private LinkedList<Entry> getOrCreateBucket(Integer key) {
		int index = hashcode(key);
		if (entries[index] == null) {
			entries[index] = new LinkedList<>();
		}
		return entries[index];
	}

	private int hashcode(Integer key) {
		return key % entries.length;
	}

	public static void main(String[] args) {

		HashTable hashTable = new HashTable();

		hashTable.put(1, "A");
		hashTable.put(2, "B");
		hashTable.put(3, "C");
		hashTable.put(1, "A+");
		System.out.println(hashTable.get(1));
		hashTable.remove(2);
		// hashTable.remove(2);

	}
}
