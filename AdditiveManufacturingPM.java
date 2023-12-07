import java.util.ArrayList;
import java.util.List;

public class AdditiveManufacturingPM {

  // needs interface once database is finished


  public static void main(String[] args) {
    // Example usage of the classes

    // Create a TemperatureRange instance
    TemperatureRange tempRange = new TemperatureRange(150, 250);

    // Create a Printer instance (FDM Printer)
    List<String> fdmSupportedMaterials = new ArrayList<>();
    fdmSupportedMaterials.add("PLA");
    fdmSupportedMaterials.add("ABS");

    FDMPrinter fdmPrinter =
        new FDMPrinter("XYZ FDM Printer", fdmSupportedMaterials, 200.0, tempRange);

    // Create a Printer instance (Resin Printer)
    List<String> resinSupportedMaterials = new ArrayList<>();
    resinSupportedMaterials.add("Resin A");
    resinSupportedMaterials.add("Resin B");

    ResinPrinter resinPrinter =
        new ResinPrinter("UV Resin Printer", resinSupportedMaterials, 100.0);

    // Create a Settings instance
    Settings commonSettings = new Settings();

    // Create a Materials instance (Filament)
    Filament filament =
        new Filament("Filament Brand", "PLA", 10.0, 1.75, "Type A", "Green", 1.0, commonSettings);

    // Create a Materials instance (Resin)
    Resin resin = new Resin("Resin Brand", "Resin A", 20.0, "Type B", "Grey", 1.0, commonSettings);

    // Save and load settings using the Database
    Database database = new Database();
    database.saveSettings(commonSettings);
    Settings loadedSettings = database.loadSettings();
  }
}
