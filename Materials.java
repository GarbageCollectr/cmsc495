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
  private String color;
  private double amountLeft;

  // Constructor, getters, setters, and any other necessary methods

  // Example constructor



  public Materials(String brand, String material, double cost, String type, String col) {
    this.setBrand(brand);
    this.setMaterial(material);
    this.setCost(cost);
    this.setType(type);
    this.color = col;
  }

  public String toString() {
    return this.material + " " + this.type + ", Brand: " + this.brand + ", Color: " + this.color;
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

  /**
   * @return the amountLeft
   */
  public double getAmountLeft() {
    return amountLeft;
  }

  /**
   * @param amountLeft the amountLeft to set
   */
  public void setAmountLeft(double amountLeft) {
    this.amountLeft = amountLeft;
  }
}
