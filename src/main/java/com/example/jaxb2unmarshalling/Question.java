package com.example.jaxb2unmarshalling;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement
public class Question {

    private String questionname;
    private List<Answer> answers;

    private int id;

    public Question(String questionname, List<Answer> answers, int id) {
        this.questionname = questionname;
        this.answers = answers;
        this.id = id;
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question(){
        //no args constructor
    }


    @XmlElement
    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
    }

    @XmlElement
    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
