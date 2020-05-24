package com.kedyson;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        else{
            myContacts.add(contact);
            return true;
        }
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for(int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}
