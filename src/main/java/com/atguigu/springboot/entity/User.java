package com.atguigu.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
@Entity
@Table(name = "tbl_user")//如果省略，默认表名为类名小写
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增组件
    private Integer id;
    @Column(name ="last_name") //这是和数据表对应的一个列
    private String lastName;
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
