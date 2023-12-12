// Filament Class (Subclass of Materials)
public class Filament extends Materials {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  // Additional properties or methods specific to Filament
  private double diameter;


  // Example constructor
  public Filament(String brand, String material, double cost, double diameter, String type,
      String col, double weight) {
    super(brand, material, cost, type, col);
    this.setDiameter(diameter);
    super.setAmountLeft(weight);
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



  public String toString() {
    return super.toString() + ", Diameter: " + diameter + "mm, Remaining Weight: "
        + super.getAmountLeft() + "kg";
  }
}
