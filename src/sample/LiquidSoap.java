package sample;
import javafx.scene.image.Image;

public class LiquidSoap {

    private String brandName, intendedUse;
    private int volume;
    private Image imageFile;

    public LiquidSoap(String brandName, String intendedUse, int volume, Image imageFile) {


        setBrandName(brandName);
        setIntendedUse(intendedUse);
        setVolume(volume);
        setImageFile(imageFile);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        if (!brandName.isEmpty()) {
            this.brandName = brandName;
        } else {
            throw new IllegalArgumentException("Brand Name cannot be empty");
        }
    }

    public String getIntendedUse() {
        return intendedUse;
    }

    public void setIntendedUse(String intendedUse) {
        if ("Dish".equals(intendedUse) || "Hand".equals(intendedUse) || "Floor".equals(intendedUse)) {
            this.intendedUse = intendedUse;
        } else {
            throw new IllegalArgumentException("Intended Use can only be 'Dish','Hand' or 'Floor");
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 0 && volume <= 10000) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException("Volume shoud be between 0 and 10000");
        }
    }

    public Image getImageFile() {
        return imageFile;
    }

    public void setImageFile(Image imageFile) {
        this.imageFile = imageFile;
    }

    public String toString() {

        return String.format("%n %s   (%s ml)", brandName, volume);

    }

    public String toString2() {

        return String.format("%n Brand     %18s  %n Intended Use    %s %n Volume in mL    %s", brandName, intendedUse, volume);

    }
}
