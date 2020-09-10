package java_22_functionalInterface.task01;

public class IntegerFilter implements Filter<Integer> {
    @Override
    public boolean check(Integer integer) {
        return integer > 5;
    }
}
