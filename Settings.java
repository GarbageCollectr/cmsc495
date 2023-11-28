import java.io.Serializable;

// Settings Class
public class Settings implements Serializable {
  // Placeholder for settings common to both Materials and Printer



  /**
   * 
   */
  private static final long serialVersionUID = 1L;
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
