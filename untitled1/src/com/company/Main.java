package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new SimpleFrame("Новая программа");
        /*
        int c = -1;
        do {
            System.out.println("1 - Вывести хранилище");
            System.out.println("2 - Добавить книгу");
            System.out.println("3 - Добавить журнал");
            System.out.println("4 - Добавить учебник");

            System.out.println("5 - удалить продукцию");
            System.out.println("6 - Вывести всю продукцию одного автора");
            System.out.println("7 - Вывести все книги");
            System.out.println("73 - Выход");
            c = readC();
            switch (c){
                case 1: {
                    System.out.println("_______________________________________");
                    library.print();
                    System.out.println("_______________________________________");
                }break;
                case 2: {
                    System.out.println("Имя автора");
                    String author = scanner.nextLine();
                    System.out.println("Название книги");
                    String name = scanner.nextLine();
                    System.out.println("Количество страниц");
                    int pages = scanner.nextInt();
                    library.add(new Book(author, name, pages));
                }break;
                case 3: {
                    System.out.println("Имя автора");
                    String author = scanner.nextLine();
                    System.out.println("Название книги");
                    String name = scanner.nextLine();
                    System.out.println("Название жанра");
                    String genre = scanner.nextLine();
                    System.out.println("Количество страниц");
                    int pages = scanner.nextInt();
                    library.add(new Magazine(author, name, genre, pages));
                }break;
                case 4:{
                    System.out.println("Имя автора");
                    String author = scanner.nextLine();
                    System.out.println("Название книги");
                    String name = scanner.nextLine();
                    System.out.println("Название дисциплины");
                    String subject = scanner.nextLine();
                    System.out.println("Количество страниц");
                    int pages = scanner.nextInt();
                    library.add(new TextBook(author, name, subject , pages));
                }
                case 5:{
                    System.out.println("Имя автора");
                    String author = scanner.nextLine();
                    System.out.println("Название книги");
                    String name = scanner.nextLine();
                    System.out.println("Название дисциплины");
                    String subject = scanner.nextLine();
                    System.out.println("Количество страниц");

                    int pages = scanner.nextInt();
                    library.add(new TextBook(author, name, subject , pages));
                }
                case 6:{
                    System.out.println("avtor");
                    String author = scanner.nextLine();
                    library.print(author);
                }


            }


        }while (c != 0);
         */

    }

    /*private static int readC() {
        int readed = -1;
        try {
            readed = Integer.parseInt(scanner.nextLine());

        }
        catch (NumberFormatException ex){
            System.out.println("Вводите только цифры");
            readed = readC();
        }
        return readed;
    }*/
}
