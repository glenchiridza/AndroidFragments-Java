package com.glencconnect.exercisefragments.Model;

public class Chat {
    private String name, surname, message;
    public Chat(){

    }

    public Chat(String name, String surname, String message) {
        this.name = name;
        this.surname = surname;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
