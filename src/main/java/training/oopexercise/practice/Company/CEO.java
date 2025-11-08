package training.oopexercise.practice.Company;

public class CEO extends Employee{

    @Override
    public void salaryGet() {
        System.out.println("--CEO--");
        System.out.println("£3000 per month");
        System.out.println("100 stuck per month");
        System.out.println("£1000 profit bonus per month");
    }
}
