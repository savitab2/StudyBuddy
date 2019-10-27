package com.example.savita.studybuddy;
import java.util.ArrayList;

public class Post {
    public static ArrayList<Post> posts = new ArrayList<>();
    public static boolean addInitials = true;


    String name;
    String subject;
    String subjectClass;
    String assignment;
    String duration;
    String moreDetails;
    String location;

    Post() {
        name = "";
        subject = "";
        subjectClass = "";
        assignment = "";
        duration = "";
        moreDetails = "";
        location = "";
    }

    public static void addInitialPosts() {
        Post post1 = new Post();
        post1.setName("Marie");
        post1.setSubject("STAT");
        post1.setSubjectClass("400");
        post1.setAssignment("Homework 7");
        post1.setDuration("2 hours");
        post1.setLocation("UGL");
        post1.setMoreDetails("2nd Floor on the right side");

        posts.add(post1);

        Post post2 = new Post();
        post2.setName("Nikitha");
        post2.setSubject("CHEM");
        post2.setSubjectClass("102");
        post2.setAssignment("Midterm 1");
        post2.setDuration("4 hours");
        post2.setLocation("Union");
        post2.setMoreDetails("Courtyard Cafe");

        posts.add(post2);

        Post post3 = new Post();
        post3.setName("Isabella");
        post3.setSubject("CS");
        post3.setSubjectClass("225");
        post3.setAssignment("MP 4");
        post3.setDuration("7 hours");
        post3.setLocation("Grainger");
        post3.setMoreDetails("4th floor left section");

        posts.add(post3);
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getSubjectClass() {
        return subjectClass;
    }

    public String getAssignment() {
        return assignment;
    }

    public String getDuration() {
        return duration;
    }

    public String getMoreDetails() { return moreDetails; }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSubjectClass(String subjectClass) {
        this.subjectClass = subjectClass;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setMoreDetails(String moreDetails) { this.moreDetails = moreDetails; }

    public void setLocation(String location) {
        this.location = location;
    }
}
