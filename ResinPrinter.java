// Resin Printer Class (Subclass of Printer)

import java.util.List;

public class ResinPrinter extends Printer {
  // Additional properties or methods specific to Resin Printer
  // Example constructor
  public ResinPrinter(String brand, List<String> supportedMaterials, double bedArea) {
    super(brand, supportedMaterials, bedArea, 0, 0);
  }
}
