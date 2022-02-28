package com.learn.threading.lambda;

public class LambdaPerson {
    public String name;
    public int age;

    public LambdaPerson() {
    }

    public LambdaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "LambdaPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
