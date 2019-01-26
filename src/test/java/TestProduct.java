import org.json.JSONObject;
import org.junit.Test;



public class TestProduct {
    @Test
    public void testProduct(){

        System.out.println("---------------------------Product 1--------------------------------");
        //First product
        String productName1 = "Iphone X";
        double salePrice1 = 999;
        double marketPrice1 = 999;
        JSONObject images1 = new JSONObject();
        images1.put("default","F:/1.jpg");
        images1.put("gallery","F:/2.jpg");
        images1.put("image1","F:/3.jpg");
        JSONObject attribute1 = new JSONObject();
        attribute1.put("color", "Black");
        attribute1.put("description", "This is a iphone x black");
        attribute1.put("origin", "VietNam");
        attribute1.put("storage", "64 Gb");
        attribute1.put("factorydate", "26/01/2019");
        attribute1.put("weight", 2.5);
        JSONObject attributes1 = new JSONObject();
        attributes1.put("images",images1);
        attributes1.put("attributes",attribute1);

        Product product1 = new Product(productName1, salePrice1, marketPrice1, attributes1);

        System.out.println("Product name: " + product1.getProductName());
        System.out.println("Sale price: " + product1.getSalePrice());
        System.out.println("Market price: " + product1.getMarketPrice());
        System.out.println("Description: " + product1.getProductAttributes().getAttributes().getDescription());
        System.out.println("Origin: " + product1.getProductAttributes().getAttributes().getOrigin());
        System.out.println("Factory date: " + product1.getProductAttributes().getAttributes().getFactoryDate());
        System.out.println("Color: " + product1.getProductAttributes().getAttributes().getColor());
        System.out.println("Storage: " + product1.getProductAttributes().getAttributes().getStorage());
        System.out.println("Weight: " + product1.getProductAttributes().getAttributes().getWeight());
        System.out.println("Default image: " + product1.getProductAttributes().getImages().getDefaultImage());
        System.out.println("Gallery: " + product1.getProductAttributes().getImages().getGallery());
        System.out.println("other images: " + product1.getProductAttributes().getImages().getOthers());


        System.out.println("---------------------------Product 2--------------------------------");
        //Second product
        String productName = "Iphone X";
        double salePrice = 999;
        double marketPrice = 999;
        JSONObject images = new JSONObject();
        images.put("default","F:/4.jpg");
        images.put("gallery","F:/5.jpg");
        images.put("image1","F:/6.jpg");
        JSONObject attribute = new JSONObject();
        attribute.put("color", "Yellow");
        attribute.put("storage", "128 Gb");
        attribute.put("description", "This is a iphone super yellow");
        attribute.put("origin", "US");
        attribute.put("factorydate", "24/01/2019");
        attribute.put("weight", 3.5);
        JSONObject attributes = new JSONObject();
        attributes.put("images",images);
        attributes.put("attributes",attribute);

        Product product = new Product(productName, salePrice, marketPrice, attributes);

        System.out.println("Product name: " +product.getProductName());
        System.out.println("Sale price: " + product.getSalePrice());
        System.out.println("Market price: " +product.getMarketPrice());
        System.out.println("Description: " + product.getProductAttributes().getAttributes().getDescription());
        System.out.println("Origin: " + product.getProductAttributes().getAttributes().getOrigin());
        System.out.println("Factory date: " +product.getProductAttributes().getAttributes().getFactoryDate());
        System.out.println("Color: " + product.getProductAttributes().getAttributes().getColor());
        System.out.println("Storage: " + product.getProductAttributes().getAttributes().getStorage());
        System.out.println("Weight: " + product.getProductAttributes().getAttributes().getWeight());
        System.out.println("Default image: " + product.getProductAttributes().getImages().getDefaultImage());
        System.out.println("Gallery: " + product.getProductAttributes().getImages().getGallery());
        System.out.println("other images: " +product.getProductAttributes().getImages().getOthers());

        System.out.println("---------------------------Configurable product--------------------------------");
        //ConfigurableProduct
        ConfigurableProduct configurableProduct = new ConfigurableProduct(product1.getName(), product.getSalePrice(), product.getMarketPrice(), product1.getAttributes());
        System.out.println("Product name: " +configurableProduct.getProductName());
        System.out.println("Sale price: " + configurableProduct.getSalePrice());
        System.out.println("Market price: " +configurableProduct.getMarketPrice());
        System.out.println("Description: " + configurableProduct.getProductAttributes().getAttributes().getDescription());
        System.out.println("Origin: " + configurableProduct.getProductAttributes().getAttributes().getOrigin());
        System.out.println("Factory date: " +configurableProduct.getProductAttributes().getAttributes().getFactoryDate());
        System.out.println("Color: " + configurableProduct.getProductAttributes().getAttributes().getColor());
        System.out.println("Storage: " + configurableProduct.getProductAttributes().getAttributes().getStorage());
        System.out.println("Weight: " + configurableProduct.getProductAttributes().getAttributes().getWeight());
        System.out.println("Default image: " + configurableProduct.getProductAttributes().getImages().getDefaultImage());
        System.out.println("Gallery: " + configurableProduct.getProductAttributes().getImages().getGallery());
        System.out.println("other images: " +configurableProduct.getProductAttributes().getImages().getOthers());
    }
}
