package com.tipster.tipster.Pojo;

/**
 * Created by David_tepoche on 29/10/2016.
 */

public class Rate {

    private int good;
    private int bad;
    private int totalVote;

    //todo pojo/rate voir avec eddie pour le total vote (à risque)
    public Rate(int good, int bad) {
        this.bad = bad;
        this.good = good;
        this.totalVote = this.good + this.bad;
    }

    public int getGood() {
        return good;
    }

    public int getBad() {
        return bad;
    }

    public int getTotalVote() {
        return totalVote;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

//    public void setTotalVote(int totalVote) {
//        this.totalVote = totalVote;
//    }
}
