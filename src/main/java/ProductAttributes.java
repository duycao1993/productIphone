import org.json.JSONObject;

public class ProductAttributes {
    Attributes attributes;
    Images images;

    public Attributes getAttributes() {
        return attributes;
    }

    public Images getImages() {
        return images;
    }

    public ProductAttributes(JSONObject productAttributes) {
        for(String attribute : productAttributes.keySet()){
            if(attribute.equalsIgnoreCase("images")){
                this.images =  new Images(productAttributes.getJSONObject("images"));
            }

            if(attribute.equalsIgnoreCase("attributes")){
                this.attributes = new Attributes(productAttributes.getJSONObject("attributes"));
            }
        }
    }
}
