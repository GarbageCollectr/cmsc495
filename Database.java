import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// Database Class
public class Database {
  // Responsibilities: Allow the application to read and write from the database

  // Each ArrayList should be able to be saved to a file and then reloaded at will from same file.
  public List<Printer> printerList = new ArrayList<Printer>();
  public List<Materials> materialList = new ArrayList<Materials>();

  // list save methods here:

  // list load methods here:

  // needs functionality to return a List<Material> with a subset of materialList that has only
  // nodes with certain colors, material types, etc

  public static void writePrinters(String fileName, List<Printer> printers) {
    try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
      stream.writeObject(printers);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

  @SuppressWarnings("unchecked")
  public static List<Printer> readPrinters(String fileName) {
    try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
      return (List<Printer>) stream.readObject();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public static void writeMaterials(String fileName, List<Materials> mats) {
    try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
      stream.writeObject(mats);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

  @SuppressWarnings("unchecked")
  public static List<Materials> readMaterials(String fileName) {
    try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
      return (List<Materials>) stream.readObject();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public void saveSettings(Settings settings) {
    // Implement the logic to save settings to the database
    System.out.println("Settings saved to the database.");
  }

  public Settings loadSettings() {
    // Implement the logic to load settings from the database
    System.out.println("Settings loaded from the database.");
    return null; // Placeholder, replace with actual implementation



  }
}
