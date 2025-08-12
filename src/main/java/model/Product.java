package model;

public class Product {
    private String title;
    private String description;
    private String price;
    private String discountPercentage;
    private String soldQuantity;

    public Product(String title, String description, String price, String discountPercentage, String soldQuantity) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.soldQuantity = soldQuantity;
    }

    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getPrice() { return price; }
    public String getDiscountPercentage() { return discountPercentage; }
    public String getSoldQuantity() { return soldQuantity; }
}
