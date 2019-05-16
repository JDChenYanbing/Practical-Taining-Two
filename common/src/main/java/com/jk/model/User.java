package com.jk.model;

import java.io.Serializable;

/**
 * @author ：mmzs
 * @date ：Created in 2019/4/15 19:24
 * @description：
 * @modified By：
 * @version: $
 */
public class User implements Serializable {
    private static final long serialVersionUID = 5306254103210693467L;
    private Integer id;
    private String name;//姓名
    private Integer sex;//1:男；2：女
    private String qqnumber;//qq号码
    private Integer studentId;//学历
    private String gradate;//毕业时间
    private String money;//当前薪资
    private Integer status;//当前状态
    private String loginnumber;//手机号
    private String password;//密码
     private String type;




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginnumber() {
        return loginnumber;
    }

    public void setLoginnumber(String loginnumber) {
        this.loginnumber = loginnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(String qqnumber) {
        this.qqnumber = qqnumber;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getGradate() {
        return gradate;
    }

    public void setGradate(String gradate) {
        this.gradate = gradate;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", qqnumber='" + qqnumber + '\'' +
                ", studentId=" + studentId +
                ", gradate='" + gradate + '\'' +
                ", money='" + money + '\'' +
                ", status=" + status +
                ", loginnumber='" + loginnumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
