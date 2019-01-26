import org.json.JSONObject;

public class Product {
    private String name;
    private double salePrice;
    private double marketPrice;
    private JSONObject attributes;
    private ProductAttributes productAttributes;


    public String getName() {
        return name;
    }

    public String getProductName(){
        return name + " " + productAttributes.getAttributes().getStorage() + " " + productAttributes.getAttributes().getColor();
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public JSONObject getAttributes() {
        return attributes;
    }

    public ProductAttributes getProductAttributes() {
        return productAttributes;
    }

    public Product(String name, double salePrice, double marketPrice, JSONObject attributes) {
        this.name = name;
        this.salePrice = salePrice;
        this.marketPrice = marketPrice;
        this.attributes = attributes;
        if(attributes != null){
            this.productAttributes = new ProductAttributes(attributes);
        }
    }
}
