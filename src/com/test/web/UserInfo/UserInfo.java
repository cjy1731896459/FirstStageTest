package com.test.web.UserInfo;

public class UserInfo {
    private int id;
    private String username;
    private String password;
    private String sex;
    private String hobbys;
    private  int phone;
    private String email;
    private String addrs;
    private int flag;

    public UserInfo() {
    }

    public UserInfo(String username, String password, String sex, String hobbys, int phone, String email, String addrs) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.hobbys = hobbys;
        this.phone = phone;
        this.email = email;
        this.addrs = addrs;

    }

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserInfo(int id, String username, String password, String sex, String hobbys, int phone, String email, String addrs, int flag) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.hobbys = hobbys;
        this.phone = phone;
        this.email = email;
        this.addrs = addrs;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobbys() {
        return hobbys;
    }

    public void setHobbys(String hobbys) {
        this.hobbys = hobbys;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", hobbys='" + hobbys + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", addrs='" + addrs + '\'' +
                ", flag=" + flag +
                '}';
    }
}
