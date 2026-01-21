package com.example.legacy;


import junit.framework.TestCase;


public class StringUtilTest extends TestCase {


public void testIsEmptyWithNull() {
StringUtil util = new StringUtil();
assertTrue(util.isEmpty(null));
}


public void testIsEmptyWithEmptyString() {
StringUtil util = new StringUtil();
assertTrue(util.isEmpty(""));
}


public void testIsEmptyWithValue() {
StringUtil util = new StringUtil();
assertFalse(util.isEmpty("hello"));
}
}
