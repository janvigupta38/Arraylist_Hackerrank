import java.util.ArrayList;
public class main {
    public ArrayList<Employee> employees;
    public Linked_list list;

    public  void addToArray(Employee employee, int k){
        if(employees.size()!=k){
            employees.add(employee);
        }
        if(employees.size()==k){
            for (Employee employee1: employees){
                list.addElement(employee);
            }
            employees.removeAll(employees);
        }
    }
    public static void main(String[] args) {
            main obj=new main();
            obj.addToArray(new Employee(),5);
    }
}
