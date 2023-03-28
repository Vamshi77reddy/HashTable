package com.bridgelabz;

public class HashTableMain {
	 public static void main(String[] args) {
	        String paraGraph = "To be or not to be";

	        HashTable<String, Integer> hashTable = new HashTable(6);

	        System.out.println(hashTable.bucketArray);
	        for (MyLinkedList<String,Integer> list:hashTable.bucketArray) {
	            System.out.println(list);
	        }

	        String[] wordsArray = paraGraph.split(" ");
	        for (String word : wordsArray) {
	            int index = hashTable.getIndex(word);
	            System.out.println(word + " -> " + word.hashCode() + " -> " + index);
	           
	        }

	        System.out.println(hashTable);
	    }
	}

