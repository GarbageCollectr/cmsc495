import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Database Class
public class Database {
  // Responsibilities: Allow the application to read and write from the database

  // Each ArrayList should be able to be saved to a file and then reloaded at will from same file.
  public final List<Printer> printerList = new ArrayList<>();
  public final List<Materials> materialList = new ArrayList<>();

  private static final Comparator<Printer> PRINTER_COMPARATOR =
      Comparator.comparing(Printer::getBrand);

  private static final Comparator<Materials> MATERIALS_COMPARATOR =
      Comparator.comparing(Materials::getType).thenComparing(Comparator
          .comparing(Materials::getBrand).thenComparing(Comparator.comparing(Materials::getColor)));

  // list save methods here:

  public Database() {
    // initialize Database
  }

  public void savePrinters() {
    writePrinters("printers.txt", printerList);
  }

  public void saveMaterials() {
    writeMaterials("materials.txt", materialList);
  }

  // list load methods here:

  public void loadPrinters() {
    printerList.clear();
    printerList.addAll(readPrinters("printers.txt"));
    sortPrinters();
  }

  public void sortPrinters() {
    Collections.sort(printerList, PRINTER_COMPARATOR);
  }

  public void loadMaterials() {
    materialList.clear();
    materialList.addAll(readMaterials("materials.txt"));
    sortMaterials();
  }

  public void sortMaterials() {
    Collections.sort(materialList, MATERIALS_COMPARATOR);
  }

  // needs functionality to return a List<Material> with a subset of materialList that has only
  // nodes with certain colors, material types, etc

  public List<Materials> filterMaterials(String color, String type) {
    List<Materials> filteredMaterials = new ArrayList<>();

    for (Materials mat : materialList) {
      if (mat.getColor().equals(color) && mat.getType().equals(type)) {
        filteredMaterials.add(mat);
      }
    }

    return filteredMaterials;
  }

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
      System.err.println("printers.txt not found");
      System.err.println("Initializing blank printers.txt");
      writePrinters(fileName, new ArrayList<>());
      List<Printer> p = readPrinters(fileName);
      return p;
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
      System.err.println("materials.txt not found");
      System.err.println("Initializing blank materials.txt");
      writePrinters(fileName, new ArrayList<>());
      List<Materials> p = readMaterials(fileName);
      return p;
    }


  }

}
