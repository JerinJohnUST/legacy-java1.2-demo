package com.example.legacy;


import java.util.Hashtable;


public class UserService {


private Hashtable users = new Hashtable();


public void addUser(String id, String name) {
users.put(id, name);
}


public String getUser(String id) {
return (String) users.get(id);
}
}
