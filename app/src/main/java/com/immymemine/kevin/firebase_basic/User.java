package com.immymemine.kevin.firebase_basic;

import java.util.List;

/**
 * Created by quf93 on 2017-10-30.
 */

public class User {
    public String user_id;
    public String username;
    public int age;
    public String email;

    public List<BulletinBoardSystem> list;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class);
    }

    public User(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }
}
