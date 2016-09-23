public class Doctor extends Person implements Employee {

    private Integer salary;

    @Override
    public Integer getSalary() {
        return this.salary;
    }

    public Doctor(Integer salary) {
        this.salary = salary;
    }

    public Doctor() {
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    
}
