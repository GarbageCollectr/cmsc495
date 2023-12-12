import java.util.ListIterator;
import java.util.Scanner;


public class AdditiveManufacturingPM {

  // needs interface once database is finished
  public static Database db = new Database();

  public static void main(String[] args) {

    initialize();

    int choice = 0;
    Scanner scanner = new Scanner(System.in);

    while (choice != 99) {

      System.out.println("\n");
      System.out.println("0 -- Display Configured Printers");
      System.out.println("1 -- Display Inventoried Materials");
      System.out.println("2 -- Add New Printer");
      System.out.println("3 -- Add New Filament");
      System.out.println("4 -- Add New Resin");
      System.out.println("5 -- Update Filament Inventory");
      System.out.println("6 -- Update Printer Inventory");
      System.out.println("99 -- Save and Quit");
      System.out.print("Select option: ");

      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 0:
          displayPrinters();
          break;

        case 1:
          displayAllFilament();
          break;

        case 2:
          addNewPrinter(scanner);
          break;

        case 3:
          addNewFilament(scanner);
          break;
        case 4:
          addNewResin(scanner);
          break;
        case 5:
          materialInventoryTool(scanner);
          break;
        case 6:
          printerInventoryTool(scanner);
          break;
        case 99:
          saveAndQuit();
          break;

        default:
          System.out.println("Invalid option. Please try again.");
          break;


      }


    }
    scanner.close();
  }



  private static void initialize() {

    /*
     * Filament filament = new Filament("Hatchbox", "PLA", 10.0, 1.75, "Filament", "Green", 1.0);
     * Filament filament2 = new Filament("eSun", "PLA", 10.0, 1.75, "Filament", "Black", 1.0);
     * Filament filament3 = new Filament("Overture", "PLA", 10.0, 1.75, "Filament", "Orange", 1.0);
     * Resin resin = new Resin("Anycubic", "ABS-like", 10.0, "Resin", "Grey", 1000.0); Resin resin2
     * = new Resin("Anycubic", "ABS-like", 10.0, "Resin", "Translucent Green", 1000.0); Resin resin3
     * = new Resin("Anycubic", "ABS-like", 10.0, "Resin", "Clear", 1000.0);
     * db.materialList.add(filament); db.materialList.add(filament2);
     * db.materialList.add(filament3); db.materialList.add(resin); db.materialList.add(resin2);
     * db.materialList.add(resin3); db.sortMaterials();
     */
    db.loadMaterials();
    db.loadPrinters();
  }

  private static void saveAndQuit() {
    // TODO Auto-generated method stub
    db.saveMaterials();
    db.savePrinters();

  }

  private static void printerInventoryTool(Scanner bob) {
    ListIterator<Printer> l = db.printerList.listIterator();
    while (l.hasNext()) {
      System.out.println("Would you like to remove this printer?(y/n)");
      Printer p = l.next();
      System.out.println(p);
      String choice = bob.nextLine();
      if (choice.equalsIgnoreCase("y")) {
        System.out.println("Printer Removed!");
        l.remove();

      }

    }

  }



  private static void materialInventoryTool(Scanner bob) {


    ListIterator<Materials> l = db.materialList.listIterator();
    while (l.hasNext()) {
      System.out.println("Would you like to update this material?(y/n)");
      Materials m = l.next();
      System.out.println(m);
      String choice = bob.nextLine();
      if (choice.equalsIgnoreCase("y")) {
        System.out.println("Enter weight or volume amount of 0 to remove material from inventory.");
        System.out.println("Please enter new weight(kg) or volume(mm)");
        double newValue = bob.nextDouble();
        bob.nextLine();
        if ((int) newValue == 0) {
          l.remove();
        } else {
          m.setAmountLeft(newValue);
          l.set(m);
        }

      }

    }

  }

  private static void addNewFilament(Scanner bob) {



    System.out.println("Please enter Filament Brand: ");
    String brand = bob.nextLine();
    System.out.println("Please enter Filament Type: ");
    String material = bob.nextLine();
    System.out.println("Please enter Filament Diameter(mm): ");
    double diameter = bob.nextDouble();
    bob.nextLine();
    System.out.println("Please enter Filament Color: ");
    String color = bob.nextLine();
    System.out.println("Please enter Filament weight(kg): ");
    double weight = bob.nextDouble();
    bob.nextLine();
    db.materialList.add(new Filament(brand, material, 10.0, diameter, "Filament", color, weight));

    db.sortMaterials();

  }

  private static void addNewResin(Scanner bob) {

    System.out.println("Please enter Resin Brand: ");
    String brand = bob.nextLine();
    System.out.println("Please enter Resin Type: ");
    String material = bob.nextLine();
    System.out.println("Please enter Resin Color: ");
    String color = bob.nextLine();
    System.out.println("Please enter Resin volume(ml): ");
    double weight = bob.nextDouble();
    bob.nextLine();
    db.materialList.add(new Resin(brand, material, 10.0, "Resin", color, weight));

    db.sortMaterials();
  }


  private static void addNewPrinter(Scanner bob) {


    System.out.println("\n1 -- Add a new FDM Printer");
    System.out.println("2 -- Add a new Resin Printer");
    System.out.println("Please Select an option from above: ");
    int c = bob.nextInt();
    bob.nextLine();

    switch (c) {
      case 1:
        System.out.println("\n\nPlease enter Brand of new Printer:");
        String brand = bob.nextLine();
        System.out.println("\n\nPlease enter total bed size of new Printer (cm^3):");
        double bSize = bob.nextDouble();
        bob.nextLine();
        FDMPrinter x = new FDMPrinter(brand, bSize);
        db.printerList.add(x);
        break;
      case 2:
        System.out.println("\n\nPlease enter Brand of new Printer:");
        String brand2 = bob.nextLine();
        System.out.println("\n\nPlease enter total bed size of new Printer (cm^3):");
        double bSize2 = bob.nextDouble();
        bob.nextLine();
        ResinPrinter y = new ResinPrinter(brand2, bSize2);
        db.printerList.add(y);
        break;
      default:
        System.err.println("Invalid choice, returning to main menu.");

    }


    db.sortPrinters();



  }

  private static void displayAllFilament() {
    // TODO Auto-generated method stub
    System.out.println();
    ListIterator<Materials> l = db.materialList.listIterator();
    while (l.hasNext()) {
      System.out.println(l.next());
    }
  }

  private static void displayPrinters() {
    System.out.println();
    ListIterator<Printer> l = db.printerList.listIterator();
    while (l.hasNext()) {
      System.out.println(l.next());
    }
  }
}
