package java_00_revision;

public class AdvancedCalculator extends Calculator {

    public double pow (double a, double b){
        double result = Math.pow(a,b);
        addToMemory(String.format("%.2f pow %.2f = %.2f", a,b,result));
        return result;
    }

    @Override
    protected void addToMemory(String op) {
        super.addToMemory(op);
    }
}
