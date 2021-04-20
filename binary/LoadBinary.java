import java.io.*;

public class LoadBinary {
    
    public static void main(String[] args) throws Exception {
        
        File file = new File("person.ser");
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Person person = (Person) in.readObject();
        
        System.out.println("Loading person:");
        System.out.println(person);
        
    }
}