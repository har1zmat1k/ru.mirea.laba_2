package ru.mirea.laba_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Jhon", "jhon1978@gmail.com", 'M');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.toString());
        a1.setEmail("jhon_trueman1978@gmail.com");
        System.out.println(a1.toString());
    }
}