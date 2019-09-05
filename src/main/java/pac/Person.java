package pac;

import java.io.Serializable;

public class Person implements Serializable {
    private String fullName;
    private String nationality;
    private String ethnicity;
    private int birthDate;   
    private String gender;
    
    public Person(){
    }
    
    public Person(String fullName, String nationality, String ethnicity, int birthDate, String gender) {
        this.fullName = fullName;
        this.nationality = nationality;
        this.ethnicity = ethnicity;
        this.birthDate = birthDate;
        this.gender = gender;
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

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    //need a method to check for numbers in name fields
    
    public void displayDetails(){
        if(fullName.equals("")){
        System.out.println("Hello" + getFullName());
        } else{
            System.out.println("Please try again");
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.birthDate != other.birthDate) {
            return false;
        }
        return true;
    }

}