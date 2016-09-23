
import java.util.List;

public class Division {

    private List<Doctor> doctor;
    private List<Nurse> nurses;
    private List<Staff> staff;
    private List<Ward> ward;
    private String divisionName;
    
    public Division() {
    }

    public Division(List<Doctor> doctor, List<Nurse> nurses, List<Staff> staff, List<Ward> ward, String divisionName) {
        this.doctor = doctor;
        this.nurses = nurses;
        this.staff = staff;
        this.ward = ward;
        this.divisionName = divisionName;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Ward> getWard() {
        return ward;
    }

    public void setWard(List<Ward> ward) {
        this.ward = ward;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    @Override
    public String toString() {
        return "Division{" + "doctor=" + doctor + ", nurses=" + nurses + ", staff=" + staff + ", ward=" + ward + ", divisionName=" + divisionName + '}';
    }
    
    
}
