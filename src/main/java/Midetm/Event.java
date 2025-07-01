package Midetm;

import java.time.LocalDate;

// Event კლასი წარმოადგენს ერთ ივენთს კალენდარში
public class Event {
    // დავამატოთ შემდეგი ველები კლასისთვის
    private String name;
    private String description;
    private LocalDate date;
    private boolean isDone;

    // შევქმნათ კონსტრუქტორი მხოლოდ name, description და date-სთვის
    // isDone false-ით იწყება იმიტო რო  ივენთი ჯერ არ არის დასრულებული
    public Event(String name, String description, LocalDate date) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.isDone = false;
    }

    // გამოვიყენოთ getter and setter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isDone() {
        return isDone;
    }

    // გამოვიყენოთ setter ები

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }

    // დამხმარე მეთოდი ივენთის დასრულებულად აღსანიშნავად
    public void markAsDone() {
        this.isDone = true;
    }

    // toString მეთოდი ივენთის ტექსტური სახით დასაბეჭდად
    @Override
    public String toString() {
        return name + " | " + date + " | " + (isDone ? "დასრულებულია" : "პროცესშია");
    }
}
