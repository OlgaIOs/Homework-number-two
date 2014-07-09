/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.study.librarywithmaven;

/**
 *
 * @author olga
 */
public interface LibraryOperations {
    
    boolean addBook(Book book);
    boolean removeBook(Book book);
    boolean addReader(Reader reader);
    boolean removeReader(Reader reader);
    String getReaderDestiny(Reader reader); // возвращает гороскоп Читателя(использовано для того, чтобы всунуть функцию random)
    
}
