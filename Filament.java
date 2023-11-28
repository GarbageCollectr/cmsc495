// Filament Class (Subclass of Materials)
public class Filament extends Materials {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  // Additional properties or methods specific to Filament
  private double diameter;
  private double weight;

  // Example constructor
  public Filament(String brand, String material, double cost, double diameter, String type,
      double weight, Settings optimalSettings) {
    super(brand, material, cost, type, optimalSettings);
    this.setDiameter(diameter);
    this.setWeight(weight);
  }

  /**
   * @return the diameter
   */
  public double getDiameter() {
    return diameter;
  }

  /**
   * @param diameter the diameter to set
   */
  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  /**
   * @return the weight
   */
  public double getWeight() {
    return weight;
  }

  /**
   * @param weight the weight to set
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }
}
