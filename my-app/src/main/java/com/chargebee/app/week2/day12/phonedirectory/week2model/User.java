package com.chargebee.app.week2.day12.phonedirectory.week2model;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.chargebee.app.week2.util.*;
public class User {
    private Integer id;
    private String name;
    private ArrayList<Contact> contacts;
    private Address address;
    public User(Integer id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
        this.contacts = new ArrayList<Contact>();
    }
    public String getName(){
        return name;
    }
    public Address getAddress(){
        return address;
    }
    public ArrayList<Contact> getContacts(){
        return contacts;
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public static void getUsers(
        ArrayList<User> users, 
        Predicate<String> tester,
        Consumer<String> block){ 
        try {
            for (User user : users) 
            if(tester.test(user.getName())){
                block.accept(user.getName());
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
    }
}