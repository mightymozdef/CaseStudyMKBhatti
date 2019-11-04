package com.casestudy.moez.bhatti.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postId")
    private int id; //unique post id

    @Column(name = "postTitle", nullable = false)
    private String title; //post title

    @Column(name = "categoryId", nullable = false)
    private int categoryId; //the category this post belongs to

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "user_posts",
            joinColumns = @JoinColumn(name = "postId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private User postAuthor; //user that is the author of this post

    private String content; //this post's content

    private Date timestamp;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList; //list of comments on this post

    @ManyToOne
    private User user;


}
