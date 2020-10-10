package org.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pprod")
public class User {
    @Id
    private String id;
    private String login;
    private String city;
    private int age;


    public User() {
    }

    public User(String id, String login, String city, int age) {
        this.id = id;
        this.login = login;
        this.city = city;
        this.age = age;
    }

    public User(String login, String city, int age) {
        this.login = login;
        this.city = city;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
