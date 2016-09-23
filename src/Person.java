
import util.ParseCode;

public class Person implements Peaple {

    private String firstName;

    private String lastName;
    private String code;
    private Integer age;
    private Address address;
    private ParseCode parseCode;
    private String Birthdey;
    private String Gender;

    public Person(String firstName, String lastName, String code, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
        this.address = address;
        this.parseCode = new ParseCode(this.code);
        this.setAge (this.parseCode);
        this.setBirthdey (this.parseCode);
        this.setGender (this.parseCode);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private void setAge(ParseCode parseCode) {
      this.age = parseCode.getAge();
    }

    public Integer getAge() {
        return age;
    }

    private void setBirthdey(ParseCode parseCode) {
        this.Birthdey = parseCode.getBirthdey();
        
    }

    public String getBirthdey() {
        return Birthdey;
    }

    private void setGender(ParseCode parseCode) {
        this.Gender = parseCode.getGender();
        
    }

    public String getGender() {
        return Gender;
    }
    
}
