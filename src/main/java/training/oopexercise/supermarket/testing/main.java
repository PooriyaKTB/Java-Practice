package training.oopexercise.supermarket.testing;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
//        System.out.println("hello");
        devideByZero();
    }
    static void devideByZero(){
//        System.out.println("hey");
        try{
            try{
                int zero = 0/0;
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
                throw e;
            }
        }catch(ArithmeticException e){
            System.out.println("outer Exception");
            throw e;
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
        System.out.println(":pooriya");
    }
}
