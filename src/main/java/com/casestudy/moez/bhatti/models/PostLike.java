package com.casestudy.moez.bhatti.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

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

    @NotNull
    @Column(name = "creation_timestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
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

    @NotNull
    @Column(name = "creation_timestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
