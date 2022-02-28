package com.learn.threading;

public class Person {
    private String name;
    private Integer age;

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("------" + i);
        }
    }


    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
