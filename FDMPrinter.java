// FDM Printer Class (Subclass of Printer)

import java.util.List;

public class FDMPrinter extends Printer {
  // Additional properties or methods specific to FDM Printer

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  // Example constructor
  public FDMPrinter(String brand, List<String> supportedMaterials, double bedArea,
      TemperatureRange tempRange) {
    super(brand, supportedMaterials, bedArea, tempRange);
  }
}
