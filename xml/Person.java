import javax.xml.bind.annotation.*;

@XmlRootElement
public class Person {

    private String name;
    private int age;
    private Pet pet;
    
    public Person() {
        this.name = null;
        this.age = -1;
        this.pet = null;
    }
    
    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
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

    public Pet getPet() {
        return this.pet;
    }
    
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    public String toString() {
        return "Person\nName = " + this.name + "\nAge = " + this.age + "\n" + this.pet.toString();
    }
}