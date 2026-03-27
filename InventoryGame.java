import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InventoryGame {
  public static void showInventory(ArrayList<String> inventoryGame) {
    System.out.println(inventoryGame);
  }

  public static void main(String[] args) {

    ArrayList<String> inventoryGame = new ArrayList<>();
    Scanner reader = new Scanner(System.in);

    int option;

    Collections.addAll(inventoryGame, "Posión", "Espada", "Hechizo", "Cura");
    System.out.println(inventoryGame);

    do {
      System.out.println("ELIGE QUÉ HACER:");
      System.out.println("1. Mostrar inventario");
      System.out.println("2. Eliminar objeto");
      System.out.println("3. Buscar objeto");
      System.out.println("4. Salir");

      option = reader.nextInt();

      switch (option) {
        case 1:
          showInventory(inventoryGame);
          break;

        case 2:
          System.out.println("¿Qué objeto desea eliminar?");
          String deleteObject = reader.next();
          inventoryGame.remove(deleteObject);
          break;

        case 3:
          System.out.println("Escribe el objeto que deseas buscar");
          String searchObject = reader.next();
          boolean found = inventoryGame.contains(searchObject);
          System.out.println(found);
          break;

        case 4:
          System.out.println("CHAU");
          break;

        default:
          System.out.println("Opción no válida");
          break;
      }

    } while (option != 4);
    reader.close();
  }

}

// 1. Mostrar todos los objetos del inventario
// 2. Eliminar un objeto
// 3. Buscar si un objeto existe
// 4. Crear una función llamada showInventory