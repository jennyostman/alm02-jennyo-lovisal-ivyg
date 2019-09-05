
package pac;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "Controller")
@SessionScoped
public class Controller implements Serializable {
    
    Translate t = new Translate();
    Message m = new Message();
    
    private String fullName;
    private String nationality;
    private String ethnicity;
    private int age;   
    private String gender;
    private String response;
    
    public Controller(){}

    
    public void getMessage(){
        int randomNr = t.randomNr(t.getLimitation(age));
        response = m.getMessageValue(randomNr);
    }
    
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    
    

}
