package java_00_revision;

import java.util.ArrayList;
import java.util.List;
public class Calculator{

    private List<String> operations;

    public Calculator(){
        operations = new ArrayList<>();
    }

    public double add (double a, double b){
        double result = a + b;
       addToMemory(String.format("%.2f + %.2f = %.2f", a, b, result));
        return result;
    }

    public double subtract (double a, double b){
        double result = a - b;
        addToMemory(String.format("%.2f - %.2f = %.2f", a, b, result));
        return result;

    }

    public double multiply (double a, double b){
        double result = a * b;
        addToMemory(String.format("%.2f * %.2f = %.2f", a, b, result));
        return result;

    }

    public double divide (double a, double b){
        double result = a / b;
        addToMemory(String.format("%.2f / %.2f = %.2f", a, b, result));
        return result;

    }

    public void printAllOperations(){
        for(String op : operations){
            System.out.println(op);
        }
    }

    public void cleanOperations(){
        operations.clear();
    }

    protected void addToMemory(String op){
        operations.add(op);
    }


//zamyka calculator
}

