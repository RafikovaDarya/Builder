package org.example;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    private final String NAME;
    private final String SURNAME;
    private int age;
    private String address;


    public Person(String NAME, String SURNAME) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        age=-1;
    }

    public Person(String NAME, String SURNAME, Integer age) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.age = age;
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(SURNAME).setAddress(address);
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }
    public boolean hasAge() {
        if (age == -1) {
            return false;
        } else {
            return true;
        }

    }
    public boolean hasAddress() {
        return address != null;

    }
    @Override
    public int hashCode() {
        return Objects.hash(NAME, SURNAME);
    }

    @Override
    public String toString() {

        return "Person{" +
                "Name='" + NAME + '\'' +
                ", Surname='" + SURNAME + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';

    }


}
