package com.example.jaxmarshalling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;

public class CustomerService {

    public static void main(String[] args){

        try{
            File file = new File("src\\main\\resources\\student.xml");
            /*String xmlStr = "<?xml version=\"1.0\"\n" +
                    "        encoding=\"UTF-8\"\n" +
                    "        standalone=\"yes\"?>\n" +
                    "<student>\n" +
                    "    <firstName>John</firstName>\n" +
                    "    <id>1</id>\n" +
                    "    <lastName>Smith</lastName>\n" +
                    "</student>";*/
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            //Student student = (Student) unmarshaller.unmarshal(new StringReader(xmlStr));
            Student student = (Student) unmarshaller.unmarshal(file);

            System.out.println(student.getFirstName());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
