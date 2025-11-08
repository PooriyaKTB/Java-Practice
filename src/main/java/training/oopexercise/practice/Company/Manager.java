package training.oopexercise.practice.Company;

public class Manager extends Employee{

    @Override
    public void salaryGet() {
        System.out.println("--Manager--");
        System.out.println("£2500 per month");
        System.out.println("£500 profit bonus per month");
    }
}
