/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.study.librarywithmaven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nikolaeva
 */
public class BookTest {
   /**
     * Название книги
     */
    @Test
    public void testGetName() {
        Book testBook = new Book();
        testBook.setName("Капитал");
        assertEquals("Капитал", testBook.getName());
        testBook.setName("");
        assertEquals("без названия", testBook.getName());
    }

    @Test
    public void testGetAuthor() {
        Book testBook = new Book();
        String result = testBook.getAuthor();
        assertEquals("не определен", result);
    }

   
    @Test
    public void testSetAuthor() {
        Book testBook = new Book();
        testBook.setAuthor("Карл Маркс");
        assertEquals("Карл Маркс", testBook.getAuthor());
    }

  
    
}
