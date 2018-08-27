package com.joker;

public class User {
    private String name;
    private int age;
    private int sexDm;
    private String addr;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSexDm() {
        return sexDm;
    }

    public void setSexDm(int sexDm) {
        this.sexDm = sexDm;
    }

    public User(String name, int age, int sexDm) {
        this.name = name;
        this.age = age;
        this.sexDm = sexDm;
    }

    public User(String name, int age, int sexDm, String addr) {
        this.name = name;
        this.age = age;
        this.sexDm = sexDm;
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sexDm=" + sexDm +
                '}';
    }
}
