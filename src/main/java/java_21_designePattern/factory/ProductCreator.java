package java_21_designePattern.factory;

public class ProductCreator implements Creator {
    @Override
    public Product createProduct(String name) {
        Product product;
        if (name.equals("simple")) {
            product = new SimpleProduct();
        } else if (name.equals("advanced")) {
            product = new AdvancedProduct();
        } else if (name.equals("virtual")) {
            product = new VirtualProduct();
        } else {
            System.out.println("Product type was not given. The created product has a simple type");
            product = new SimpleProduct();
        }
        return product;
    }
}
