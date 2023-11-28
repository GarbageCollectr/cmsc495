// Printer Class

import java.io.Serializable;
import java.util.List;

public class Printer implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String brand;
  private List<String> supportedMaterials;
  private double bedArea;
  private Settings printerSettings;

  // Constructor, getters, setters, and any other necessary methods

  // Example constructor
  public Printer(String brand, List<String> supportedMaterials, double bedArea, int minTemp,
      int maxTemp) {
    this.setBrand(brand);
    this.setSupportedMaterials(supportedMaterials);
    this.setBedArea(bedArea);
    this.setPrinterSettings(new Settings(minTemp, maxTemp));
  }

  public Printer(String brand2, List<String> supportedMaterials2, double bedArea2,
      TemperatureRange tempRange) {
    this.setBrand(brand2);
    this.setSupportedMaterials(supportedMaterials2);
    this.setBedArea(bedArea2);
    this.setPrinterSettings(new Settings(tempRange));
  }

  /**
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }

  /**
   * @param brand the brand to set
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * @return the supportedMaterials
   */
  public List<String> getSupportedMaterials() {
    return supportedMaterials;
  }

  /**
   * @param supportedMaterials the supportedMaterials to set
   */
  public void setSupportedMaterials(List<String> supportedMaterials) {
    this.supportedMaterials = supportedMaterials;
  }

  /**
   * @return the bedArea
   */
  public double getBedArea() {
    return bedArea;
  }

  /**
   * @param bedArea the bedArea to set
   */
  public void setBedArea(double bedArea) {
    this.bedArea = bedArea;
  }

  /**
   * @return the printerSettings
   */
  public Settings getPrinterSettings() {
    return printerSettings;
  }

  /**
   * @param printerSettings the printerSettings to set
   */
  public void setPrinterSettings(Settings printerSettings) {
    this.printerSettings = printerSettings;
  }
}
