import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InventoryGame {
  public static void main(String[] args) {

    ArrayList<String> inventoryGame = new ArrayList<>();
    Scanner reader = new Scanner(System.in);

    int option;

    Collections.addAll(inventoryGame, "sword", "shield", "potion", "armor");
    System.out.println(inventoryGame);

    do {
      System.out.println("ELIGE QUÉ HACER:");
      System.out.println("1. Agregar objeto");
      System.out.println("2. Mostrar inventario");
      System.out.println("3. Eliminar objeto");
      System.out.println("4. Buscar objeto");
      System.out.println("5. Salir");

      option.nextInt();

    } while (condition);

    read.close();
  }

}

// 1.Mostrar todos los objetos del inventario
// 2. Eliminar un objeto
// 3. Buscar si un objeto existe
// 4. Crear una función llamada showInventory