package java_21_designePattern.factory;

public class Main01 {
    public static void main(String[] args) {
        ProductCreator productCreator = new ProductCreator();
        System.out.println(productCreator.createProduct("simple").getClass().getSimpleName());
        System.out.println(productCreator.createProduct("advanced").getClass().getSimpleName());
        System.out.println(productCreator.createProduct("virtual").getClass().getSimpleName());
        System.out.println(productCreator.createProduct("eee").getClass().getSimpleName());
    }
}
