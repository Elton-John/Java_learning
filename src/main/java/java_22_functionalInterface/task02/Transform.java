package java_22_functionalInterface.task02;

@FunctionalInterface
public interface Transform<T, S> {
    T transform(S s);
}
