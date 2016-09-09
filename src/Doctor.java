
import java.util.List;

public class Doctor extends Person implements Departments {

    private Department depatment;

    private List<Pacient> pacients;

    @Override
    public String getDepartment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Department setDerartment(Department department) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
