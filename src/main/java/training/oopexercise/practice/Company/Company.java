package training.oopexercise.practice.Company;

public class Company {
    public static void main(String[] args) {

        CEO ceo = new CEO("Pooriya");
        paySalary(ceo);
        System.out.println("CEO Name: " + ceo.name);

        CTO cto = new CTO();
        paySalary(cto);

        CFO cfo = new CFO();
        paySalary(cfo);

        Manager manager = new Manager();
        paySalary(manager);

        Staff staff = new Staff();
        paySalary(staff);

        System.out.println(Employee.companyName);
        System.out.println(CEO.companyName);

        ceo.displayCompanyName();
    }

    public static void paySalary(Employee role) {
        role.salaryGet();
    }
}
