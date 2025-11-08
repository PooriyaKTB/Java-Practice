package training.oopexercise.practice.Company;

public class CFO extends Employee{

    @Override
    public void salaryGet() {
        System.out.println("--CFO--");
        System.out.println("£2500 per month");
        System.out.println("100 stuck per month");
    }
}
