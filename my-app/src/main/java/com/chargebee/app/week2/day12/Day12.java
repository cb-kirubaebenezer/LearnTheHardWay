package com.chargebee.app.week2.day12;

import java.util.*;
import com.chargebee.app.week2.util.*;
import com.chargebee.app.week2.day12.*;
import com.chargebee.app.week2.day12.phonedirectory.week2model.*;

public class Day12 {
    /**
     * @param data list of words Return a map with count as key and list of words
     *             that has been found in the data as value.
     */
    public HashMap<Integer, LinkedList<String>> getCountOfWords(String[] data) {
        HashMap<Integer, LinkedList<String>> words = new HashMap<Integer, LinkedList<String>>();
        ArrayList<String> cache = new ArrayList<String>();
        try {
            for (Integer i = 0; i < data.length; i++) {
                int count = 1;
                if (!cache.contains(data[i])) {
                    for (Integer j = i + 1; j < data.length; j++) {
                        if (data[i].equals(data[j])) {
                            count++;
                        }
                    }
                    if (words.containsKey(count)) {
                        words.get(count).add(data[i]);
                    } else {
                        LinkedList<String> ll = new LinkedList<String>();
                        ll.add(data[i]);
                        words.put(count, ll);
                    }
                    cache.add(data[i]);
                }
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        return words;
    }

    /**
     * @param data list of words Return a map with substring(0,3) as key and list of
     *             matched prefixes in data as value.
     */
    public HashMap<String, LinkedList<String>> getCommonPrefix(String[] data) {
        HashMap<String, LinkedList<String>> words = new HashMap<String, LinkedList<String>>();
        try {
            for (Integer i = 0; i < data.length; i++) {
                String substr = data[i].substring(0, 3);
                if (words.containsKey(substr)) {
                    words.get(substr).add(data[i]);
                } else {
                    LinkedList<String> ll = new LinkedList<String>();
                    ll.add(data[i]);
                    words.put(substr, ll);
                }
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        return words;
    }

    public void doTask() {
        task1();
        task2();
        task3();
    }

    private void task1() {
        try {
            String countData[];
            countData = new String[] { "hello", "hello", "dog", "dog", "fish", "cat", "hi", "hi", "hi", "there",
                    "there", "there", "boss", "lol" };
            Util.print("Count of words in map....");
            HashMap<Integer, LinkedList<String>> res = getCountOfWords(countData);
            for (Map.Entry rEntry : res.entrySet()) {
                Util.print(rEntry.getKey().toString());
                Util.print(rEntry.getValue().toString());
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }

    private void task2() {
        try {
            String prefixData[];
            prefixData = new String[] { "abcd", "abcd", "abde", "efgh", "efgh", "hlmn", "hlmn", "hlmfwfwfwif" };
            Util.print("Common prefix in map....");
            HashMap<String, LinkedList<String>> prefixres = getCommonPrefix(prefixData);
            for (Map.Entry rEntry : prefixres.entrySet()) {
                Util.print(rEntry.getKey().toString());
                Util.print(rEntry.getValue().toString());
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }

    private void task3() {
        try {
            ArrayList<User> users = new ArrayList<User>();
            users.add(new User(1, "Kiruba Ebenezer", new Address("", "", "")));
            users.add(new User(2, "Kelly stone", new Address("", "", "")));

            users.stream().filter(user -> (user.getName().equals("Kiruba Ebenezer"))).map(user -> user.getName())
                    .forEach(user -> Util.print(user));
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }
}