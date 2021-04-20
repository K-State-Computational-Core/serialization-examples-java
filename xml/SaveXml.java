import java.io.*;
import javax.xml.bind.*;

public class SaveXml {
    
    public static void main(String[] args) throws Exception {
        
        Person person = new Person("Willie Wildcat", 42, new Pet("Reggie", 4, "Shorkie"));
        System.out.println("Saving person:");
        System.out.println(person);
        
        File file = new File("person.xml");
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(person, file);
        
    }
}