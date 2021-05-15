package com.djn.pojo;

/**
 * 用户实体类
 */
public class Fsuser {

    //主键
    private int id;
    //用户姓名
    private String username;
    //用户账号
    private String useraccount;
    //用户名密码
    private String userpassword;
    //用户性别
    private int usergender;
    //用户年龄
    private int userage;
    //用户地址
    private String useraddress;
    //用户邮箱
    private String useremail;

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

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getUsergender() {
        return usergender;
    }

    public void setUsergender(int usergender) {
        this.usergender = usergender;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    @Override
    public String toString() {
        return "Fsuser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", useraccount='" + useraccount + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", usergender=" + usergender +
                ", userage=" + userage +
                ", useraddress='" + useraddress + '\'' +
                ", useremail='" + useremail + '\'' +
                '}';
    }
}
