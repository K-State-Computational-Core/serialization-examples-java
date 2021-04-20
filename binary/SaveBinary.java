import java.io.*;

public class SaveBinary {
    
    public static void main(String[] args) throws Exception {
        
        Person person = new Person("Willie Wildcat", 42, new Pet("Reggie", 4, "Shorkie"));
        System.out.println("Saving person:");
        System.out.println(person);
        
        File file = new File("person.ser");
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(person);
        
    }
}