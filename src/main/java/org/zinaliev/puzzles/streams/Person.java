package org.zinaliev.puzzles.streams;

public class Person {

    public String firstName;
    public String lastName;
    public boolean male = false;
    public int age = 25;

    public boolean isMale() {
        return male;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", male=").append(male);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
