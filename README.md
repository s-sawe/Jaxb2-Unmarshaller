# jaxb2-unmarshaller
XML parsing into Java Objects

BELOW DEPENDENCIES ARE IMPORTANT:

        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.0</version>
        </dependency>

        <dependency>
            <groupId>org.glassfish.jaxb</groupId>
            <artifactId>jaxb-runtime</artifactId>
        </dependency>
        
 ADD THIS PLUGIN TO pom.xml FILE
 
            <plugin>
                <groupId>org.jvnet.jaxb2.maven2</groupId>
                <artifactId>maven-jaxb2-plugin</artifactId>
                <version>0.14.0</version>
            </plugin>
