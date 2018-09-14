import java.util.List;

public class Main {

    public static void main(String[] args) {
        int currentID = 0;

        HeadDepartment headDepartment = new HeadDepartment("Head Department", currentID++);

        Department salesDepartment = new SalesDepartment("Sales Department", currentID++);
        Department financialDepartment = new FinancialDepartment("Financial Department", currentID++);
        Department devDepartment = new DevDepartment("Development Department", currentID++);

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(devDepartment);


        PersonData personDataJanne = new PersonData();
        PersonData personDataJurve = new PersonData();
        PersonData personDataJenny = new PersonData();
        PersonData personDataJaine = new PersonData();

        headDepartment.addEmployee(new Person(1,"Janne", salesDepartment, personDataJanne));
        headDepartment.addEmployee(new Person(2,"Jurve", devDepartment, personDataJurve));
        headDepartment.addEmployee(new Person(3,"Jenny", headDepartment, personDataJenny));
        headDepartment.addEmployee(new Person(4,"Jaine", financialDepartment, personDataJaine));


        List<Person> employees = headDepartment.getEmployees();

        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).getDepartment().printNameAndID();
            System.out.println(employees.get(i).getPersonData().getSickDays());
        }


    }
}
