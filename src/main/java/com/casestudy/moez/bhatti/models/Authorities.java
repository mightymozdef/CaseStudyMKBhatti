package com.casestudy.moez.bhatti.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(value = AuthoritiesId.class)
@Table(name = "authorities")
public class Authorities {

    @Id
    @Column(name = "authority")
    private String authority;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username")
    private Credential credential;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

}

class AuthoritiesId implements Serializable {

    private static final long serialVersionUID = -8063359576306261387L;

    @Id
    @Column(name = "authority")
    private String authority;

    @Id
    @ManyToOne
    @JoinColumn(name = "username")
    private Credential credential;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }


}
