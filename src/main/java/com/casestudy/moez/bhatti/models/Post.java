package com.casestudy.moez.bhatti.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postId")
    private int id; //unique post id

    @NotEmpty
    @Column(name = "postTitle", nullable = false)
    private String title; //post title

    @NotEmpty
    @Column(name = "categoryId", nullable = false)
    private int categoryId; //the category this post belongs to

    @NotEmpty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "user_posts",
            joinColumns = @JoinColumn(name = "postId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private User postAuthor; //user that is the author of this post

    @NotEmpty
    @Column(name = "content", nullable = false)
    private String content; //this post's content

    @NotEmpty
    @Column(name = "creation_timestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList; //list of comments on this post

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public User getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(User postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
