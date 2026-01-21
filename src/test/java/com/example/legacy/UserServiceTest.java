package com.example.legacy;


import junit.framework.TestCase;


public class UserServiceTest extends TestCase {


public void testAddAndGetUser() {
UserService service = new UserService();
service.addUser("1", "John");
assertEquals("John", service.getUser("1"));
}
}
