
package com.study.librarywithmaven;

/**
 *
 * @author Olga
 */
public class JUnitTest {

    
    public static void main(String[] args) {
        
        // создаётся библиотека и добавляются в неё книги и читатели. в консоль - инфо. 
        Library bestLibrary = new Library();
        
        //первая книжка
        Book firstBook = new Book();
        firstBook.setName("Война и Мир");
        firstBook.setAuthor("Лев Толстой");
        firstBook.setEditionHouse("");
        firstBook.setEditionYear(0);
        firstBook.setSeries("");
        
        bestLibrary.addBook(firstBook);
        
        //вторая книжка
        Book secondBook = new Book();
        secondBook.setName("Повелитель мух");
        secondBook.setAuthor("Уильям Голдинг");
        secondBook.setEditionHouse("АСТ");
        secondBook.setEditionYear(2014);
        secondBook.setSeries("Эксклюзивная классика");
        
        bestLibrary.addBook(secondBook);
        
        //третья книжка
        Book thirdBook = new Book("Отверженные","Виктор Гюго",2000,"Иностранка","Иностранная литература. Большие книги");
        bestLibrary.addBook(thirdBook);
         
        //новый читатель
        Reader firstReader = new Reader();
        firstReader.setName("Ольга Н");
        firstReader.setAddress("пр.Героев, 40");
        firstReader.setPassportSerie("АЕ");
        firstReader.setPassportNumber(112233);
        firstReader.setRegistrationYear(0);
        
        bestLibrary.addReader(firstReader);

        //второй читатель
        Reader secondReader = new Reader("Читатель Х","пр.Карла Маркса, 1","XZ",554433,2014);
        
        bestLibrary.addReader(secondReader);
        
        System.out.println(firstReader.getReaderInfo() );
        System.out.println(bestLibrary.getReaderDestiny(firstReader) ); //метод getReaderDestiny использует генератор случайных чисел для определения судьбы читателя на сегодня :)
        
    }
    
}
