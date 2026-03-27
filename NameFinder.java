import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameFinder {
  public static void main(String[] args) {

    ArrayList<String> students = new ArrayList<>();
    Scanner reader = new Scanner(System.in);

    Collections.addAll(students, "Maria", "Rodrigo", "Clarisa", "Pedro", "Lucia", "Esteban");
    System.out.println("Ingrese su nombre");
    String searchName = reader.next();
    boolean found = students.contains(searchName);
    if (found) {
      System.out.println("Student found");
    } else {
      System.out.println("Student not found");
    }
    reader.close();
  }
}
// 1. Crear una lista llamada students
// 2. Guardar al menos 6 nombres
// 3. Pedir al usuario un nombre
// 4. Verificar si ese nombre está en la lista
// 5. Mostrar un mensaje:
// * "Student found"
// * "Student not found"