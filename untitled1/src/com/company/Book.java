package com.company;

public class Book extends PrintE {
    public Book(String author, String name, int pages) {
        this.authorName = author;
        this.Name = name;
        this.pages = pages;
    }
    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("id: " + this.id + "\n");
        stringBuilder.append("Автор: " + this.authorName + "\n");
        stringBuilder.append("Название: " + this.Name + "\n");
        stringBuilder.append("Количество страниц: " + this.pages + "\n");
        System.out.println(stringBuilder.toString());
    }
}
