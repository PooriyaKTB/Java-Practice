package training.oopexercise.practice.Company;

public class Company {
    public static void main(String[] args) {

        CEO ceo = new CEO();
        paySalary(ceo);

        CTO cto = new CTO();
        paySalary(cto);

        CFO cfo = new CFO();
        paySalary(cfo);

        Manager manager = new Manager();
        paySalary(manager);

        Staff staff = new Staff();
        paySalary(staff);
    }

    public static void paySalary(Employee role) {
        role.salaryGet();
    }
}
