package com.company;

public class Magazine extends PrintE {
    protected static String Genre;

    public String getGenre() {
        return Magazine.Genre;
    }
    public void setGenre(String Genre) {
        Magazine.Genre = Genre;
    }

    public Magazine(String author, String name, String genre , int pages){
        this.authorName = author;
        this.Name = name;
        this.Genre = genre;
        this.pages = pages;
    }

    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("id: "+this.id+"\n");
        stringBuilder.append("Автор: "+this.authorName+"\n");
        stringBuilder.append("Название: "+this.Name+"\n");
        stringBuilder.append("Количество страниц: "+this.pages+"\n");
        stringBuilder.append("Жанр: "+this.Genre+"\n");
        System.out.println(stringBuilder.toString());

    }
}