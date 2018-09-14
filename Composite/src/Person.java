public class Person implements Department {

    private int id;
    private PersonData personData;

    private String name;
    private Department department;
    private String gender;
    private float height;

    public Person(int id, String name, Department department, PersonData personData) {
        this.id = id;
        this.name = name;
        this.personData = personData;
        this.department = department;
    }

    @Override
    public void printNameAndID() {
        System.out.println("Name: " + name + "\nID: " + id);
    }

    @Override
    public void printDepartmentName() {
        department.printDepartmentName();
    }

    @Override
    public void printDepartmentID() {
        department.printDepartmentID();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonData getPersonData() {
        return personData;
    }

    public void setPersonData(PersonData personData) {
        this.personData = personData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
