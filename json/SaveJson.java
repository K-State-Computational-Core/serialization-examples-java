import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SaveJson {
    
    public static void main(String[] args) throws Exception {
        
        Person person = new Person("Willie Wildcat", 42, new Pet("Reggie", 4, "Shorkie"));
        System.out.println("Saving person:");
        System.out.println(person);
        
        File file = new File("person.json");
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(file, person);
        
    }
}