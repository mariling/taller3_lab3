import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

  public static void main(String[] args) {

    ArrayList<String> shoppingList = new ArrayList<>();
    Scanner reader = new Scanner(System.in);

    // Agrego
    shoppingList.add("Leche");
    shoppingList.add("Huevos");
    shoppingList.add("Pan");
    shoppingList.add("Mantequilla");
    shoppingList.add("Manzanas");

    // Mostrar
    System.out.println("Lista de compras:");
    for (int list = 0; list < shoppingList.size(); list++)
      System.out.println(shoppingList.get(list));

    // Par agregar
    System.out.println("Ingrese el nuevo producto:");
    String newProduct = reader.nextLine();
    shoppingList.add(newProduct);

    // para borrar
    System.out.println("Ingrese el producto a Eliminar");
    String deleteProduct = reader.next();
    shoppingList.remove(deleteProduct);

    // para buscar
    System.out.println("Escribe el objeto que deseas buscar");
    String searchProduct = reader.next();
    boolean found = shoppingList.contains(searchProduct);
    System.out.println(found);

    reader.close();
  }
}

// 1. Crear una lista llamada shoppingList
// 2. Agregar al menos 5 productos.
// 3. Mostrar todos los productos.
// 4. Permitir agregar un nuevo producto.
// 5. Permitir eliminar un producto.
// 6. Buscar si un producto existe en la lista.