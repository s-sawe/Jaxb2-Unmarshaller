package com.example.jaxb2unmarshalling;

public class Answer {

    private String answername;
    private String postedby;

    private int id;

    public Answer(String answername, String postedby, int id) {
        this.answername = answername;
        this.postedby = postedby;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Answer(){

    }

    public String getAnswername() {
        return answername;
    }

    public void setAnswername(String answername) {
        this.answername = answername;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }
}
