import java.io.*;
import javax.xml.bind.*;

public class LoadXml {
    
    public static void main(String[] args) throws Exception {
        
        File file = new File("person.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Person person = (Person) jaxbUnmarshaller.unmarshal(file);
        
        System.out.println("Loading person:");
        System.out.println(person);
        
    }
}