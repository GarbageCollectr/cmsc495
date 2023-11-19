// Settings Class
public class Settings {
  // Placeholder for settings common to both Materials and Printer
  private TemperatureRange tempSettings;

  public Settings() {
    tempSettings = new TemperatureRange(0, 0);
  }

  public Settings(TemperatureRange tempRange) {
    tempSettings = tempRange;
  }

  public Settings(int min, int max) {
    tempSettings = new TemperatureRange(min, max);
  }

  public TemperatureRange getTempRange() {
    return this.tempSettings;
  }



}
