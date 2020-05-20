package com.nivket.collection.onlineclasspractice;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String passport;

	//getters and setters, constructor

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }
public static void main(String[] args) {
	User user = new User();

	System.out.println();
}
}