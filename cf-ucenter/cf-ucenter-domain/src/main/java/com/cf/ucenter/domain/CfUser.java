package com.cf.ucenter.domain;

import java.io.Serializable;
import java.util.List;

public class CfUser implements Serializable {
    private String id;

    private String userName;

    private String password;

    private String avatar;

    private Integer type;

    private String nickName;

    private String trueName;

    private Long birthday;

    private Integer sex;

    private String sign;

    private Long createTime;

    private String phone;

    private String email;

    private List<CfRole> cfRoles;

    private static final long serialVersionUID = 1L;

    public CfUser() {
    }

    public String getId() {
        return id;
    }

    public CfUser(String id, String userName, String password, String avatar, Integer type, String nickName, String trueName, Long birthday, Integer sex, String sign, Long createTime, String phone, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.avatar = avatar;
        this.type = type;
        this.nickName = nickName;
        this.trueName = trueName;
        this.birthday = birthday;
        this.sex = sex;
        this.sign = sign;
        this.createTime = createTime;
        this.phone = phone;
        this.email = email;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CfRole> getCfRoles() {
        return cfRoles;
    }

    public void setCfRoles(List<CfRole> cfRoles) {
        this.cfRoles = cfRoles;
    }
}