package com.company.task1;

import java.util.ArrayList;

public class MyHashMap <K extends Comparable<K>, V>{
    ArrayList<Entry> entries = new ArrayList<Entry>();
    class Entry{
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
    public void put(K key, V value){
        entries.add(new Entry(key, value));
    }
    public Entry get(K key){
        for (Entry e: entries) {
            if(e.key.compareTo(key) == 0)  {
                return e;
            }
        }

        return null;
    }
}
