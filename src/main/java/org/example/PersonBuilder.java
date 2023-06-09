package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException(
                    "Возрастные ограничения от 0 до 150. Вы указали " + age
            );
        }

        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException(
                    "Имя является обязательным полем для заполнения"
            );
        }
        if (surname == null) {
            throw new IllegalStateException(
                    "Фамилия является обязательным полем для заполнения"
            );
        }

        Person person;
        if (age == -1) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }
        if (address != null) {
            person.setAddress(address);
        }

        return person;
    }
}
