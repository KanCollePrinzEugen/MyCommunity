package cn.work.prinzeugen.community.auth;

import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

public class UserModel {
    private Integer id;
    private String username;
    private String password;
    private Set<GrantedAuthority> authorities;

    public Set<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
