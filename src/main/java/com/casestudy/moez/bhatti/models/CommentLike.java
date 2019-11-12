package com.casestudy.moez.bhatti.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@IdClass(CommentLikeId.class)
@Table(name = "commentLikes")
public class CommentLike {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commentLikeUserId", referencedColumnName = "userId")
    private User commentLikeUser;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commentLikeCommentId", referencedColumnName = "commentId")
    private Comment commentLikeComment;

    @NotNull
    @Column(name = "commentLikeTimestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public User getCommentLikeUser() {
        return commentLikeUser;
    }

    public void setCommentLikeUser(User commentLikeUser) {
        this.commentLikeUser = commentLikeUser;
    }

    public Comment getCommentLikeComment() {
        return commentLikeComment;
    }

    public void setCommentLikeComment(Comment commentLikeComment) {
        this.commentLikeComment = commentLikeComment;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

class CommentLikeId implements Serializable {

    private static final long serialVersionUID = -5642917205028750578L;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commentLikeUserId", referencedColumnName = "userId")
    private User commentLikeUser;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commentLikeCommentId", referencedColumnName = "commentId")
    private Comment commentLikeComment;

    @NotNull
    @Column(name = "commentLikeTimestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public User getCommentLikeUser() {
        return commentLikeUser;
    }

    public void setCommentLikeUser(User commentLikeUser) {
        this.commentLikeUser = commentLikeUser;
    }

    public Comment getCommentLikeComment() {
        return commentLikeComment;
    }

    public void setCommentLikeComment(Comment commentLikeComment) {
        this.commentLikeComment = commentLikeComment;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
