import javax.xml.bind.annotation.*;

@XmlRootElement
public class Pet {

    private String name;
    private int age;
    private String breed;
    
    public Pet() {
        this.name = null;
        this.age = -1;
        this.breed = null;
    }
    
    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getBreed() {
        return this.breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String toString() {
        return "Pet\nName = " + this.name + "\nAge = " + this.age + "\nBreed = " + this.breed;
    }
}