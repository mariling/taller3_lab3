import java.util.ArrayList;
import java.util.Collections;

public class ShoppingCar {
  public static void main(String[] args) {
    ArrayList<Double> prices = new ArrayList<>();
    Collections.addAll(prices, 5.99, 14.78, 11.99, 3.99, 7.98);
    System.out.printf("El total de la compra es: %.2f%n", calculateTotal(prices));

  }

  public static double calculateTotal(ArrayList<Double> prices) {
    double additionPrices = 0;
    for (double price : prices) {
      additionPrices = additionPrices + price;
    }
    return additionPrices;

  }
}

// 1. Crear una lista llamada prices
// 2. Guardar al menos 5 precios
// 3. Crear una función llamada calculateTotal
// 4. La función debe sumar todos los precios
// 5. Mostrar el total de la compra