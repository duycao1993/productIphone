import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;

public class Images {
    private final String notFoundImagePath = System.getProperty("user.dir") + "/images/Not_Found_Image.jpg";
    private File defaultImage;
    private File gallery;
    private ArrayList<File> others;

    /**
     * Get the default image
     * @return image file
     * If the image is not found, return Not_Found_Image
     */
    public File getDefaultImage() {
        return defaultImage;
    }

    /**
     * Get the gallery image
     * @return image file
     * If the image is not found, return Not_Found_Image
     */
    public File getGallery() {
        return gallery;
    }

    /**
     * Get all other images
     * @return image file list
     * If the image is not found, return Not_Found_Image
     */
    public ArrayList getOthers() {
        return others;
    }

    public Images(JSONObject images)
    {
        others = new ArrayList<File>();
        for(String key : images.keySet()){
            if(key.equalsIgnoreCase("default")){
                this.defaultImage = getImage(images.getString(key));
            } else if(key.equalsIgnoreCase("gallery")){
                this.gallery = getImage(images.getString(key));
            } else {
                this.others.add(getImage(images.getString(key)));
            }
        }
    }

    private File getImage(String imagePath){
        File image = null;
        try{
            image = new File(imagePath);
            if(!image.exists()){
                image = new File(notFoundImagePath);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
