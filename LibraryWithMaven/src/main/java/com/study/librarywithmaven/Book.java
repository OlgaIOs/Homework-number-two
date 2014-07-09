
package com.study.librarywithmaven;

/**
 *
 * @author nikolaeva
 */
public class Book {

    private String name; // название книги 
    private String author; // автор
    private int editionYear; // год издания
    private String editionHouse; //издательство
    private String series; //серия

    public Book() {
        this.name = "без названия";
        this.author = "не определен";
        this.editionYear = 0;
        this.editionHouse = "не определено";
        this.series = "";
    }

    public Book(String name, String author, int editionYear, String editionHouse, String series) { // конструктор
        if (name.length() == 0) {
            this.name = "без названия";
        } else {
            this.name = name;
        }

        if (author.length() == 0) {
            this.author = "не определен";
        } else {
            this.author = author;
        }

        if (editionYear < 0) {
            this.editionYear = 0;
        } else {
            this.editionYear = editionYear;
        }
        if (editionHouse.length() == 0) {
            this.editionHouse = "не определено";
        } else {
            this.editionHouse = editionHouse;
        }
        if (series.length() == 0) {
            this.series = "";
        } else {
            this.series = series;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            this.name = "без названия";
        } else {
            this.name = name;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.length() == 0) {
            this.author = "не определен";
        } else {
            this.author = author;
        }
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(int editionYear) {
        if (editionYear < 0) {
            this.editionYear = 0;
        } else {
            this.editionYear = editionYear;
        }
    }

    public String getEditionHouse() {
        return editionHouse;
    }

    public void setEditionHouse(String editionHouse) {
        if (editionHouse.length() == 0) {
            this.editionHouse = "не определено";
        } else {
            this.editionHouse = editionHouse;
        }
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        if (series.length() == 0) {
            this.series = "не определена";
        } else {
            this.series = series;
        }
    }

    public String getBookInfo() {
        return "Книга: " + this.name + ". Автор: " + this.author + ". Издательство: " + this.editionHouse + ". Год издания: " + this.editionYear;
    }
}
