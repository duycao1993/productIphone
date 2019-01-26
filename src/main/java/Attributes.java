import org.json.JSONObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Attributes {
    private String description;
    private String origin;
    private String color;
    private String storage;
    private Date factoryDate;
    private Float weight;

    public String getDescription() {
        return description;
    }

    public String getOrigin() {
        return origin;
    }

    public String getColor() {
        return color;
    }

    public String getStorage() {
        return storage;
    }

    public Date getFactoryDate() {
        return factoryDate;
    }

    public Float getWeight() {
        return weight;
    }

    public Attributes(JSONObject attributes) {
        for(String key : attributes.keySet()){
            if(key.equalsIgnoreCase("description")){
                this.description = attributes.getString(key);
            } else if(key.equalsIgnoreCase("origin")){
                this.origin = attributes.getString(key);
            } else if(key.equalsIgnoreCase("color")){
                this.color = attributes.getString(key);
            } else if(key.equalsIgnoreCase("storage")){
                this.storage = attributes.getString(key);
            } else if(key.equalsIgnoreCase("factorydate")){
                Date date = null;
                try{
                    date = new SimpleDateFormat("dd/MM/yyyy").parse(attributes.getString(key));
                } catch (Exception e){
                    e.printStackTrace();
                }
                this.factoryDate = date;
            } else if(key.equalsIgnoreCase("weight")){
                this.weight = attributes.getFloat(key);
            }

        }
    }
}
