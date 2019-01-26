import org.json.JSONObject;

public class ConfigurableProduct extends Product {
    public ConfigurableProduct(String name, double salePrice, double marketPrice, JSONObject attributes) {
        super(name, salePrice, marketPrice, attributes);
    }
}
