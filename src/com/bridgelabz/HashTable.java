package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K, V> {

	    int bucketSize;

	    List<MyLinkedList<K, V>> bucketArray = new ArrayList<>(bucketSize);

	    // array list size increases at run-time , thats why it is called dynamic array

	   
	    public HashTable(int bucketSize) {
	        this.bucketSize = bucketSize;
	        for (int i = 0; i < bucketSize; i++) {
	            bucketArray.add(i, null);
	        }
	    }

	    public int getIndex(K key) {
	        int index = Math.abs(key.hashCode()) % bucketSize;
	        return index;
	    }
	    public V get(K key) {
	        int index = getIndex(key);
	        MyLinkedList<K, V> myLinkedList = bucketArray.get(index);
	        if (myLinkedList == null)
	            return null;
	        MyNode<K, V> currentNode = myLinkedList.search(key);
	        return currentNode != null ? currentNode.value : null;
	    }

		@Override
		public String toString() {
			return "HashTable [bucketSize=" + bucketSize + ", bucketArray=" + bucketArray + "]";
		}
		
	    
	    
	    
}
