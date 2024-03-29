package ru.alishev.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author Neil Alishev
 */
public class Person {
    private int id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной")
    private String fullName;

    @Min(value = 1900, message = "Год рождения должен быть больше, чем 1900")
    private int yearOfBitrth;

    // Конструктор по умолчанию нужен для Spring
    public Person() {

    }

    public Person(String fullName, int yearOfBitrth) {
        this.fullName = fullName;
        this.yearOfBitrth = yearOfBitrth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBitrth() {
        return yearOfBitrth;
    }

    public void setYearOfBitrth(int yearOfBirth) {
        this.yearOfBitrth = yearOfBirth;
    }
}