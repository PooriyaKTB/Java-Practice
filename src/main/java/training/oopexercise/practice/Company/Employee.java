package training.oopexercise.practice.Company;

public abstract class Employee {
    String name;
    static String companyName = "iCompany"; // This property belongs to class itself, not each instances than created from this class.

    public Employee(){
        System.out.println("\nNew " + this.getClass().getSimpleName() + " joined to " + companyName); // this.getClass().getSimpleName() returns the direct class name which the instance has been created from it.
    }
    public void startWork(){

    }
    public void stopWork(){

    }
    public abstract void salaryGet();
}
