
// Resin Class (Subclass of Materials)
class Resin extends Materials {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;


  // Example constructor
  public Resin(String brand, String material, double cost, String type, String col, double volume) {
    super(brand, material, cost, type, col);
    super.setAmountLeft(volume);
  }


  public String toString() {
    return super.toString() + ", Remaining Volume: " + super.getAmountLeft() + "ml";
  }
}
