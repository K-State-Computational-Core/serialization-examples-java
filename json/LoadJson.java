import java.io.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LoadJson {
    
    public static void main(String[] args) throws Exception {
        
        File file = new File("person.json");
        
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(file, new TypeReference<Person>(){});       
        
        System.out.println("Loading person:");
        System.out.println(person);
        
    }
}