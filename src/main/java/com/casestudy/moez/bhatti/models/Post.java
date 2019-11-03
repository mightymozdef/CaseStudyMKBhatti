package com.casestudy.moez.bhatti.models;

import javax.persistence.ManyToOne;
import java.util.Date;

public class Post {

    private int id; //unique post id

    private String title; //post title

    private int categoryId; //the category this post belongs to

    private int userId; //user that is the author of this post

    private String content; //this post's content

    private Date timestamp;

    @ManyToOne
    private User user;


}
