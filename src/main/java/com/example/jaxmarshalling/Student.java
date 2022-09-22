package com.example.jaxmarshalling;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement
public class Student {

    private long id;
    private String firstName;
    private String lastName;

}
