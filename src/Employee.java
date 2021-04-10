public class Employee {
    private int emp_id;
    private int salary;
    private String name;
    private String email;
    private  static int object_count;

    public  Employee(){
        object_count++;
    }
    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getObject_count() {
        return object_count;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
