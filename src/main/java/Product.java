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

    /**
     * Get the full product name
     */
    public String getProductName(){
        return name + " " + productAttributes.getAttributes().getStorage() + " " + productAttributes.getAttributes().getColor();
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    /**
     * Get all product attributes in JSON form
     * @return JSONObject
     */
    public JSONObject getAttributes() {
        return attributes;
    }

    /**
     * Get all product attributes in Object form
     * @return ProductAttributes
     */
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
