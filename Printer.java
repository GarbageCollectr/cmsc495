// Printer Class

import java.io.Serializable;

public class Printer implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String brand;
  private double bedArea;


  // Constructor, getters, setters, and any other necessary methods

  // Example constructor
  public Printer(String brand, double bedArea) {
    this.setBrand(brand);
    this.setBedArea(bedArea);

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


  public String toString() {
    return "Brand: " + this.brand + ", Print Area: " + this.bedArea + "cm^3";
  }
}
