import java.io.Serializable;

// Materials Class
class Materials implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String brand;
  private String material;
  private double cost;
  private String type;
  private Settings optimalSettings;
  private String color;

  // Constructor, getters, setters, and any other necessary methods

  // Example constructor



  public Materials(String brand, String material, double cost, String type, String col,
      Settings optimalSettings) {
    this.setBrand(brand);
    this.setMaterial(material);
    this.setCost(cost);
    this.setType(type);
    this.setOptimalSettings(optimalSettings);
    this.color = col;
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
   * @return the cost
   */
  public double getCost() {
    return cost;
  }

  /**
   * @param cost the cost to set
   */
  public void setCost(double cost) {
    this.cost = cost;
  }

  /**
   * @return the material
   */
  public String getMaterial() {
    return material;
  }

  /**
   * @param material the material to set
   */
  public void setMaterial(String material) {
    this.material = material;
  }

  /**
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * @return the optimalSettings
   */
  public Settings getOptimalSettings() {
    return optimalSettings;
  }

  /**
   * @param optimalSettings the optimalSettings to set
   */
  public void setOptimalSettings(Settings optimalSettings) {
    this.optimalSettings = optimalSettings;
  }

  /**
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(String color) {
    this.color = color;
  }
}
