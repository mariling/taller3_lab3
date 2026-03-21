import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {

    ArrayList<Integer> gradesList = new ArrayList<>();
    Scanner reader = new Scanner(System.in);

    int numberNotes = 5;
    int userNotes = 0;
    for (int i = 0; i < numberNotes; i++) {

      System.out.println("Ingrese sus notas:" + (i + 1));
      userNotes = Integer.parseInt(reader.nextLine()); // Para pasar de String a Int
      gradesList.add(userNotes); // Guardo la nota ingresada
    }
    reader.close();
    System.out.println("Tu promedio es:" + calculateAverage(gradesList));
  }

  public static int calculateAverage(ArrayList<Integer> gradesList) {
    int additionNotes = 0;
    for (Integer userNotes : gradesList) {
      additionNotes = additionNotes + userNotes;
    }
    additionNotes = additionNotes / 5;
    return additionNotes;
  }

}

// Crear lista llmada grades
// Guardar almenos 5 notas
// Crear una funcion llamada calculateAverage
// La funcion debe recibir una lista de notas
// Debe devolver el promedio
// Mostrar el resultado en pantalla