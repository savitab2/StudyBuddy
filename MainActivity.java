package com.example.savita.studybuddy;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Filter;
import android.widget.TextView;
import android.app.ActionBar.LayoutParams;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private Button meetPartner;
    private Button yourPosts;
    private Button feed;
    private Button makePost;
    private Button filterPosts;
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Post.addInitials) Post.addInitialPosts();
        Post.addInitials = false;

        meetPartner = findViewById(R.id.meet_partner);
        meetPartner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeetPartnerActivity();
            }

        });

        yourPosts = findViewById(R.id.your_posts);
        yourPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYourPostsActivity();
            }

        });

        feed = findViewById(R.id.feed);
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeedActivity();
            }

        });

        makePost = findViewById(R.id.make_post);
        makePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMakePostActivity();
            }

        });

        filterPosts = findViewById(R.id.filter_posts);
        filterPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilterPostsActivity();
            }

        });

        ll = findViewById(R.id.ll);

        for (int i = 0; i < Post.posts.size(); i++) {
                String nameClass = Post.posts.get(i).getName() + ", " + Post.posts.get(i).getSubject() + Post.posts.get(i).getSubjectClass();
                String loc = "Location: " + Post.posts.get(i).getLocation();
                String assignment = "Working on: " + Post.posts.get(i).getAssignment();
                String duration = "Duration: " + Post.posts.get(i).getDuration();

                TextView nameClassTV = new TextView(this);
                nameClassTV.setText(nameClass);
                ll.addView(nameClassTV);

                TextView locationTV = new TextView(this);
                locationTV.setText(loc);
                ll.addView(locationTV);

                TextView assignmentTV = new TextView(this);
                assignmentTV.setText(assignment);
                ll.addView(assignmentTV);

                TextView durationTV = new TextView(this);
                durationTV.setText(duration);
                ll.addView(durationTV);

                TextView buttonTV = new TextView(this);
                buttonTV.setBackgroundColor(Color.parseColor("#81C639"));
                buttonTV.setText("REQUEST");
                LayoutParams params = new LayoutParams(185, LayoutParams.WRAP_CONTENT);
                buttonTV.setLayoutParams(params);
                ll.addView(buttonTV);

                TextView spaceTV = new TextView(this);
                spaceTV.setText("\n\n");
                ll.addView(spaceTV);


//                Button req = view.findByView;
//                req.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                    //something
//                    }
//                 });
        }
    }

    public void openMeetPartnerActivity() {
        Intent intent = new Intent(this, MeetPartnerActivity.class);
        startActivity(intent);
    }

    public void openYourPostsActivity() {
        Intent intent = new Intent(this, YourPosts.class);
        startActivity(intent);
    }

    public void openFeedActivity() {
        Intent intent = new Intent(this, Feed.class);
        startActivity(intent);
    }

    public void openMakePostActivity() {
        Intent intent = new Intent(this, MakePost.class);
        startActivity(intent);
    }

    public void openFilterPostsActivity() {
        Intent intent = new Intent(this, FilterPosts.class);
        startActivity(intent);
    }
}
