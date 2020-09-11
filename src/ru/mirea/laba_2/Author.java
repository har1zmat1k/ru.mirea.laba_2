package ru.mirea.laba_2;

public class Author {
    private String name = "none";
    private String email = "none";
    private char gender = 'U';

    public Author(String name, String email, char gender ) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return  this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  name + " (" + gender + ") at " + email;
    }
}
