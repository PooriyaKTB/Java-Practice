package training.oopexercise.practice.Company;

public class Company {
    public static void main(String[] args) {
        System.out.println("--CEO--");
        CEO ceo = new CEO();
        ceo.salaryGet();

        System.out.println("--CTO--");
        CTO cto = new CTO();
        cto.salaryGet();

        System.out.println("--CFO--");
        CFO cfo = new CFO();
        cfo.salaryGet();

        System.out.println("--Manager--");
        Manager manager = new Manager();
        manager.salaryGet();

        System.out.println("--Staff--");
        Staff staff = new Staff();
        staff.salaryGet();

        paySalary(ceo);
    }

    public static void paySalary(Employee role) {
        role.salaryGet();
    }
}
