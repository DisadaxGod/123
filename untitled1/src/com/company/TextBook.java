package com.company;

public class TextBook extends PrintE {

    protected static String Subject;

    public TextBook(String author, String name, String subject , int pages){
        this.authorName = author;
        this.Name = name;
        this.Subject = subject;
        this.pages = pages;


    }
    public String getSubject() {
        return TextBook.Subject;
    }
    public void setSubject(String Subject) {
        TextBook.Subject = Subject;
    }
    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("id: "+this.id+"\n");
        stringBuilder.append("Автор: "+this.authorName+"\n");
        stringBuilder.append("Название: "+this.Name+"\n");
        stringBuilder.append("Дисциплина: "+this.Subject+"\n");
        stringBuilder.append("Количество страниц: "+this.pages+"\n");
        System.out.println(stringBuilder.toString());

    }
}
