package pac;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    Person p = new Person();
    
    @Test
    public void testFullName(){
        String name;
        for (int i = 0; i < 10; i++) {
            name = "Name" + i;
            p.setFullName(name);
            assertEquals(name, p.getFullName());
        }
    }
    
    @Test
    public void testNationality(){
        String nationality;
        for (int i = 0; i < 10; i++) {
            nationality = "Land" + i;
            p.setNationality(nationality);
            assertEquals(nationality, p.getNationality());
        }
    }
    
    @Test
    public void testEthnicity(){
        String ethnicity;
        for (int i = 0; i < 10; i++) {
            ethnicity = "Etnicity" + i;
            p.setEthnicity(ethnicity);
            assertEquals(ethnicity, p.getEthnicity());
        }
    }
    
    @Test
    public void testBirthDate(){
        int birthDate;
        for (int i = 0; i < 100; i++) {
            birthDate = i;
            p.setBirthDate(birthDate);
            assertEquals(birthDate, p.getBirthDate());
        }
    }
    
    @Test
    public void testGender(){
        String gender;
        for (int i = 0; i < 10; i++) {
            gender = "G" + i;
            p.setGender(gender);
            assertEquals(gender, p.getGender());
        }
    }
    
    @Test
    public void testConstructor(){
        String name;
        String nationality;
        String ethnicity;
        int birthDate;
        String gender;
        
        for (int i = 0; i < 10; i++) {
            name = "Name" + i;
            nationality = "Land" + i;
            ethnicity = "Etnicity" + i;
            birthDate = i;
            gender = "G" + i;
            
            Person person = new Person(name, nationality, ethnicity, birthDate, gender);
            assertEquals(name, person.getFullName());
            assertEquals(nationality, person.getNationality());
            assertEquals(ethnicity, person.getEthnicity());
            assertEquals(birthDate, person.getBirthDate());
            assertEquals(gender, person.getGender());
            
        }
    }
    
}
