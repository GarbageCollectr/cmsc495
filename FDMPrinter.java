// FDM Printer Class (Subclass of Printer)

public class FDMPrinter extends Printer {
  // Additional properties or methods specific to FDM Printer

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  // Example constructor
  public FDMPrinter(String brand, double bedArea) {
    super(brand, bedArea);
  }

  public String toString() {
    return "FDM " + super.toString();
  }
}
