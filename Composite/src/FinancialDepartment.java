
public class FinancialDepartment implements Department {

    private String name;
    private int id;

    public FinancialDepartment(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void printNameAndID() {
        System.out.println("-------\nName: " + name + "\nID: " + id);
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Department Name: " + name);
    }

    @Override
    public void printDepartmentID() {
        System.out.println("ID: " + id);
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
}
