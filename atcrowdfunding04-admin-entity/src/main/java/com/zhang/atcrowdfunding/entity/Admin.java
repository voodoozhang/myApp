package com.zhang.atcrowdfunding.entity;

public class Admin {
    private Integer id;

    private String loginAcct;

    private String userPswd;

    private String email;

    private String creatTime;

    public Admin() {
    }

    public Admin(Integer id, String loginAcct, String userPswd, String email, String creatTime) {
        this.id = id;
        this.loginAcct = loginAcct;
        this.userPswd = userPswd;
        this.email = email;
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", loginAcct='" + loginAcct + '\'' +
                ", userPswd='" + userPswd + '\'' +
                ", email='" + email + '\'' +
                ", creatTime='" + creatTime + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginAcct() {
        return loginAcct;
    }

    public void setLoginAcct(String loginAcct) {
        this.loginAcct = loginAcct == null ? null : loginAcct.trim();
    }

    public String getUserPswd() {
        return userPswd;
    }

    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd == null ? null : userPswd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime == null ? null : creatTime.trim();
    }
}