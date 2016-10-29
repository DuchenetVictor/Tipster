package com.tipster.tipster.Pojo;

/**
 * Created by David_tepoche on 29/10/2016.
 */

public class Tip {

    private int ID;
    private String title;
    private String author;
    private String date; //utilisation de l'api 24 pour utiliser le format date...
    private Rate rate;
    private String message;

    public Tip(int ID, String title,String author, String date, Rate rate, String message) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.date = date;
        this.rate = rate;
        this.message = message;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public Rate getRate() {
        return rate;
    }

    public String getMessage() {
        return message;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
