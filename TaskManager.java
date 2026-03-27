import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskManager {
  public static void main(String[] args) {
    ArrayList<String> checkList = new ArrayList<>();
    Scanner reader = new Scanner(System.in);

    Collections.addAll(checkList, "Estudiar francés", "Estudiar matemáticas", "Estudiar programación");

    System.out.println("TAREAS PENDIENTES:");
    for (int list = 0; list < checkList.size(); list++) {
      System.out.println((list + 1) + "." + checkList.get(list));
    }

    System.out.println("Nueva tarea:");
    String newTask = reader.nextLine();
    checkList.add(newTask);

    System.out.println("Tarea ha eliminar");
    String deleteTask = reader.nextLine();
    checkList.remove(deleteTask);

    System.out.println("Tareas marcadas");
    int checkTask = reader.nextInt();
    checkList.set(checkTask, "[✔]" + checkList.get(checkTask));

    System.out.println("TAREAS ACTUALIZADAS:");
    for (int list = 0; list < checkList.size(); list++) {
      System.out.println((list + 1) + "." + checkList.get(list));
    }
    reader.close();
  }

}

// 1. Agregar tareas
// 2. Mostrar tareas
// 3. Eliminar tareas
// 4. Marcar tareas como completadas