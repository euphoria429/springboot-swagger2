package com.hcx.demo2.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author huangcaixia
 * @create 2021-10-11 16:37
 * @since 1.0.0
 */
@ApiModel(value = "user对象", description = "新增&更新用户对象说明")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(hidden = true)
    private Long id;

    @ApiModelProperty(name = "userName", value = "用户名称", required = true, example = "黄彩霞")
    private String userName;

    @ApiModelProperty(name = "passWord", value = "密码", required = true, example = "123456")
    private String passWord;

    @ApiModelProperty(name = "email", value = "邮箱", required = true, example = "123456@163.com")
    private String email;

    @ApiModelProperty(name = "nickName", value = "昵称", required = true, example = "弥音")
    private String nickName;

    @ApiModelProperty(hidden = true)
    private String regTime;

    @ApiModelProperty(name = "age", value = "年龄", required = true, example = "18")
    private Integer age;


    public User() {
        super();
    }

    public User(String email, String nickName, String passWord, String userName, String regTime) {
        super();
        this.email = email;
        this.nickName = nickName;
        this.passWord = passWord;
        this.userName = userName;
        this.regTime = regTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
