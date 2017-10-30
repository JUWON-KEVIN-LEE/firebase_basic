package com.immymemine.kevin.firebase_basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText editMsg;
    private TextView textMsg;

    FirebaseDatabase database;
    DatabaseReference BBSRef, userRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        database = FirebaseDatabase.getInstance();
        BBSRef = database.getReference("BBS");
        userRef = database.getReference("user");

        // myRef.addValueEventListener(valueEventListener); // 없으면 자동 생성

        // aaa / bbb / ccc / value < setValue(Obj obj);
        // myRef.setValue("set value"); // ccc 의 value 값을 setting
        // initiateView();

        // writeNewUser("lee", "sun shin",20, "lss@naver.com");
    }

//    ValueEventListener valueEventListener = new ValueEventListener() {
//        @Override
//        public void onDataChange(DataSnapshot dataSnapshot) {
//            Iterable<DataSnapshot> dataSnapshots = dataSnapshot.getChildren();
//            textMsg.setText(" ");
//            Log.d("textMsg", textMsg.getText().toString());
//            for(DataSnapshot snapshot : dataSnapshots) {
//                String msg = snapshot.getValue(String.class);
//                Log.d("msg", msg);
//                textMsg.setText(textMsg.getText() + "\n" + msg);
//                Log.d("textMsg in for", textMsg.getText().toString());
//                //textMsg.append(msg + "\n");
//            }
//        }
//
//        @Override
//        public void onCancelled(DatabaseError databaseError) {
//
//        }
//    };
//
//    @Override
//    protected void onPause() {
//        myRef.removeEventListener(valueEventListener);
//        super.onPause();
//    }
//
//    public void send(View view) {
//        String msg = editMsg.getText().toString();
//        if(msg == null || "".equals(msg)) {
//            msg = "none";
//        }
//
//        String key = myRef.push().getKey(); // < node ( ? )
//        // child < node ... value < value
//        myRef.child(key).setValue(msg);
//    }
//
//    private void initiateView() {
//        editMsg = findViewById(R.id.edit_msg);
//        textMsg = findViewById(R.id.text_msg);
//    }

//    private void writeNewUser(String userId, String name, int age, String email) {
//        User user = new User(name, age, email);
//
//        rootRef.child("users") // get ref
//                .child(userId) // create node
//                .setValue(user); // input node value
//
//        // user - userId { name : root
//        //                  age : 20
//        //                  email : root @ naver.com
//        //                  }
//    }
}
