import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private int id;
    private String name;
    private List<Department> childDepartments;
    private List<Person> employees = new ArrayList<>();

    public HeadDepartment(String name, int id) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void printDepartmentID() {
        System.out.println("ID: " + id);
    }


    @Override
    public void printNameAndID() {
        childDepartments.forEach(Department::printNameAndID);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addEmployee(Person person) {
        employees.add(person);
    }

    public void killEmployee(Person person) {
        employees.remove(person);
    }

    public List<Person> getEmployees() {
        return employees;
    }
}
