package com.example.savita.studybuddy;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class FilterPosts extends AppCompatActivity {

    private Button back, submit;
    private EditText subjectText, classText, locationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_posts);

        subjectText = findViewById(R.id.subject);
        classText = findViewById(R.id.class_number);
        locationText = findViewById(R.id.location);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Post> temp = new ArrayList<>();

                for (int i = 0; i < Post.posts.size(); i++) {
                    if (Post.posts.get(i).getSubject().equals(subjectText.getText().toString()) &&
                            Post.posts.get(i).getSubjectClass().equals(classText.getText().toString()) &&
                            Post.posts.get(i).getLocation().equals(locationText.getText().toString())) {
                        temp.add(Post.posts.get(i));
                    }

                    Log.d(Post.posts.get(i).getSubject(),subjectText.getText().toString());


                }

                Post.posts = temp;

                openMainActivity();
            }

        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
