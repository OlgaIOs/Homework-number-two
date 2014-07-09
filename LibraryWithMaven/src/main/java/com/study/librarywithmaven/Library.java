/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.librarywithmaven;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nikolaeva
 */
public class Library implements LibraryOperations {

    private Set<Book> books; // хранилище книг
    private Set<Reader> readers; // читатели

    public Library() {
        books = new HashSet<Book>();
        readers = new HashSet<Reader>();
    }

    public int getBooksCount() {
        return this.books.size();
    }

    public int getReadersCount() {
        return this.readers.size();
    }

    @Override
    public boolean addBook(Book book) { //добавить книжку в библиотеку
        boolean result = false;
        result = this.getBooks().add(book);
        return result;
    }

    @Override
    public boolean removeBook(Book book) {  //удалить книжку
        boolean result = false;
        result = this.getBooks().remove(book);
        return result;
    }

    @Override
    public boolean addReader(Reader reader) { //добавить читателя
        boolean result = false;
        result = this.getReaders().add(reader);
        return result;
    }

    @Override
    public boolean removeReader(Reader reader) { //удалить читателя
        boolean result = false;
        result = this.getReaders().remove(reader);
        return result;
    }

  

    @Override
    public String getReaderDestiny(Reader reader) { // предсказание для читателя. 
        String result = "";

        reader.setDestinyMark();
        double dest = reader.getDestinyMark(); // поле с рандомом

        if (dest < 0.5) {
            result = reader.getName() + ", сегодня не твой день, даже читать не стоит. А время сейчас, кстати говоря - "+ reader.getTime(); // // пердсказание + время
        } else {
            result = reader.getDate() + " - хороший день для " + reader.getName();  // дата + пердсказание
        }
        return result;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    public void setReaders(Set<Reader> readers) {
        this.readers = readers;
    }

}
