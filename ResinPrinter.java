// Resin Printer Class (Subclass of Printer)

public class ResinPrinter extends Printer {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  // Additional properties or methods specific to Resin Printer
  // Example constructor
  public ResinPrinter(String brand, double bedArea) {
    super(brand, bedArea);
  }

  public String toString() {
    return "Resin " + super.toString();
  }
}
