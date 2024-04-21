package inventory;

public class Product{
    int productId;
    protected String productName;
    public String description;

    protected void displayProduct(){
        System.out.println("Product Name"+productName);
    }
}