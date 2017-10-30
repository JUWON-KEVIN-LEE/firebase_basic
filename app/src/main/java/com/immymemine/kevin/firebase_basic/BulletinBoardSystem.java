package com.immymemine.kevin.firebase_basic;

/**
 * Created by quf93 on 2017-10-30.
 */

public class BulletinBoardSystem {
    String id, title, content, user_id, date;

    public BulletinBoardSystem() {
        // Default constructor required for calls to DataSnapshot.getValue(...here...);
    }

    public BulletinBoardSystem(String title, String content, String user_id, String date) {
        this.title = title;
        this.content = content;
        this.user_id = user_id;
        this.date = date;
    }
}
