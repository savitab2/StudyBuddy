package com.example.savita.studybuddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MakePost extends AppCompatActivity {
    private EditText nameText, subjectText, subjectClassText, assigmentText, locationText, moreDetailsText, durationText;
    private Button submit;
    private Button back;
    private Post post = new Post();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_post);

        nameText = findViewById(R.id.name_text);
        subjectText = findViewById(R.id.subject_text);
        subjectClassText = findViewById(R.id.subject_class_text);
        assigmentText = findViewById(R.id.assignment_text);
        locationText = findViewById(R.id.location_text);
        moreDetailsText = findViewById(R.id.more_details_text);
        durationText = findViewById(R.id.duration_text);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Post.posts.add(post);

                post.setName(nameText.getText().toString());
                post.setSubject(subjectText.getText().toString());
                post.setSubjectClass(subjectClassText.getText().toString());
                post.setAssignment(assigmentText.getText().toString());
                post.setLocation(locationText.getText().toString());
                post.setMoreDetails(moreDetailsText.getText().toString());
                post.setDuration(durationText.getText().toString());

                openMainActivity();
            }
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
