package com.casestudy.moez.bhatti.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@IdClass(PostLikeId.class)
@Table(name = "postLikes")
public class PostLike {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postLikeUserId", referencedColumnName = "userId")
    private User postLikeUser;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postLikePostId", referencedColumnName = "postId")
    private Post postLikePost;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Timestamp timestamp;

    public User getPostLikeUser() {
        return postLikeUser;
    }

    public void setPostLikeUser(User postLikeUser) {
        this.postLikeUser = postLikeUser;
    }

    public Post getPostLikePost() {
        return postLikePost;
    }

    public void setPostLikePost(Post postLikePost) {
        this.postLikePost = postLikePost;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}

class PostLikeId implements Serializable {

    private static final long serialVersionUID = 4791553123197420845L;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postLikeUserId", referencedColumnName = "userId")
    private User postLikeUser;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postLikePostId", referencedColumnName = "postId")
    private Post postLikePost;


    public User getPostLikeUser() {
        return postLikeUser;
    }

    public void setPostLikeUser(User postLikeUser) {
        this.postLikeUser = postLikeUser;
    }

    public Post getPostLikePost() {
        return postLikePost;
    }

    public void setPostLikePost(Post postLikePost) {
        this.postLikePost = postLikePost;
    }

}
