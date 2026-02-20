package com.leonardogtc.jcp.cap008;

public class MemberAccessTest {
    static void main(String[] args) {
        Time1 time = new Time1();

        // time.hour = 7; // java: hour has private access in com.leonardogtc.jcp.cap008.Time1
    }
}
