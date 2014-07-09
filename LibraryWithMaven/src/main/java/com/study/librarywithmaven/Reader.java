/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.study.librarywithmaven;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Olga
 */
public class Reader {    
    private String name; // ФИО читателя
    private String address; // адрес читателя
    private String passportSerie; // серия паспорта
    private int passportNumber; // номер паспорта
    private int registrationYear; // год регистрации в библиотеке
    private String citizenship; // гражданство
    private final String passSeries[] = {"АЕ","АН","АК","КН","АИ"};
    private double destinyMark; //рандомное число для определения судьбы
    
    public Reader()
    {
    
    }
    
    public Reader(String name, String address, String pSerie, int passportNumber, int registrationYear)
    {
        this.name = name;
        if (address.length()==0) {
            this.address = "адрес не указан";
        }else {
        this.address = address;
        }     
        this.setPassportSerie(pSerie); //устанавливается серия паспорта и гражданство
        this.passportNumber = passportNumber;
        this.registrationYear = registrationYear;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length()==0) {
            this.address = "адрес не указан";
        }else {
        this.address = address;
        }
    }

    public String getPassportSerie() {
        return passportSerie;
    }

    public void setPassportSerie(String passportSerie) {
        boolean in = false;
        this.passportSerie = passportSerie;
        for(int i=0;i<this.passSeries.length;i++)
            if (passportSerie.equalsIgnoreCase(this.passSeries[i])) //если серия паспорта равна кому-то из массива, то гражданство - Украина. иначе - не определено
            {
                in = true;
            }
        if (in){
            this.citizenship = "Украина";
        } else
        {
        this.citizenship = "не определено";
        }        
    }

    public String getCitizenship() {
        return citizenship;
    }
    
    public int getPassportNumber() {
        return passportNumber;
    }


    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYesr) {
        if (registrationYear<=2000) {            
            this.registrationYear = 0;
        } else {
            this.registrationYear = registrationYesr;
        }
    }
    
      public String getReaderInfo() {
         return "Читатель: " + this.name + ". Адрес: " + this.address + ". Паспорт: " + this.getPassportSerie()+this.getPassportNumber() + ". Гражданство: " + this.citizenship;
    }
    
    public double getDestinyMark() {
        return destinyMark;
    }

    public void setDestinyMark() {
        this.destinyMark = Math.random(); //случайное число 
    }
    
      public String getDate() {
        Date d = new Date(); // текущая дата
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy"); //дата
        return format1.format(d);
    }

    public String getTime() {
        Date d = new Date(); // текущая дата
        SimpleDateFormat format2 = new SimpleDateFormat("hh:mm"); //время
        return format2.format(d);

    }
    
}
