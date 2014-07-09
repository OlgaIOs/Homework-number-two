/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.librarywithmaven;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author nikolaeva
 */
public class LibraryTest {

    public LibraryTest() {
    }

    /**
     * Добавление книги в библиотеку.
     */
    @Test
    public void testAddBook() {
        Book book = new Book("Отверженные", "Виктор Гюго", 2000, "Иностранка", "Иностранная литература. Большие книги");
        Library myLib = new Library();
        boolean result = myLib.addBook(book);
        assertTrue(result);
        assertEquals(1, myLib.getBooksCount()); //размер книжной полки 
        // можно ли делать 2 ассерта в 1 тесте?
    }

    /**
     * Добавление пустой книги в библиотеку.
     */
    @Test
    public void testAddEmptyBook() {
        Book book = new Book();
        Library myLib = new Library();
        boolean result = myLib.addBook(book);
        assertTrue(result); // добавление успешно
        assertEquals(1, myLib.getBooksCount()); //размер книжной полки
    }

    /**
     * Удаление книги из библиотеки
     */
    @Test
    public void testRemoveBook() {
        Library myLib = new Library();
        Book book = new Book("Вий", "Н.Гоголь", 2014, "Эксмо", "Русская классика");
        myLib.addBook(book); // добавляем
        // проверка размера. если увеличился на 1, то удаляем элемент
        if (myLib.getBooksCount() == 1) {
            boolean result = myLib.removeBook(book);
            assertTrue(result);
            assertEquals(0, myLib.getBooksCount()); //размер книжной полки. после удаления должен стать 0
        } else {
            fail("Test not work");
        }
    }

    /**
     * Добавление читателя
     */
    @Test
    public void testAddReader() {
        Reader newReader = new Reader("Читатель Х", "пр.Карла Маркса, 1", "XZ", 554433, 2014);
        Library myLib = new Library();
        boolean result = myLib.addReader(newReader);
        assertTrue(result);
    }

    /**
     * Удаление человека из читателей
     */
    @Test
    public void testRemoveReader() {
        Reader newReader = new Reader(); //создаем пустого читателя
        Library myLib = new Library();
        myLib.addReader(newReader);
        assertEquals(1, myLib.getReadersCount()); //размер увелич.на 1
        boolean result = myLib.removeReader(newReader);
        assertTrue(result);
    }

    /**
     * Проверка гороскопа
     */
    @Test
    public void testGetReaderBadDestiny() { //плохое предсказание
        Library myLib = new Library();

        Reader testReader = mock(Reader.class);
        when(testReader.getDestinyMark()).thenReturn(0.2);  // заменяем рандомное число на конкретное
        when(testReader.getName()).thenReturn("Ольга Н");
        when(testReader.getTime()).thenReturn("11:11");     
        myLib.addReader(testReader);
        String expResult = "Ольга Н, сегодня не твой день, даже читать не стоит. А время сейчас, кстати говоря - 11:11";// + format2.format(d); // // пердсказание + время                
        assertEquals(expResult, myLib.getReaderDestiny(testReader));
    }

    @Test
    public void testGetReaderGoodDestiny() { //хорошее предсказание
        Library myLib = new Library();
        Reader testReader = mock(Reader.class);

        when(testReader.getDestinyMark()).thenReturn(0.7);  // заменяем рандомное число на конкретное
        when(testReader.getName()).thenReturn("Ольга Н");
        when(testReader.getDate()).thenReturn("01.06.2014");

        testReader.setName("Ольга Н");
        testReader.setAddress("пр.Героев, 40");
        testReader.setPassportSerie("АЕ");
        testReader.setPassportNumber(998877);
        testReader.setRegistrationYear(2014);
        myLib.addReader(testReader);
        String expResult = "01.06.2014 - хороший день для Ольга Н";// + format2.format(d); // // пердсказание + время                
        assertEquals(expResult, myLib.getReaderDestiny(testReader));
    }

}
