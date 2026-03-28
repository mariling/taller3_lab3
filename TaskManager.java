import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskManager {
  public static void main(String[] args) {
    ArrayList<String> checkList = new ArrayList<>();
    ArrayList<String> checkTask = new ArrayList<>();
    Scanner reader = new Scanner(System.in);

    Collections.addAll(checkList, "frances", "matematicas", "programacion");

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

    // allTask.addAll(checkList);

    System.out.println("Tareas marcadas");
    String taskCheck = reader.nextLine();
    checkList.remove(taskCheck);
    checkTask.add(taskCheck);

    System.out.println("Tareas pendientes: " + checkList);
    System.out.println("Tareas actualizadas: " + checkTask);

    // checkList.set(checkTask, "[✔]" + checkList.equals(checkTask));
    /*
     * System.out.println("checkTask" + checkTask);
     * 
     * for (int i = 0; i < checkList.size(); i++) {
     * System.out.println((i + 1) + ". " + checkList.get(i));
     * }
     * 
     * if (i= checkTask)
     * checkList.setSelected(true);
     */

    // System.out.println("TAREAS ACTUALIZADAS:");
    // for (int list = 0; list < checkList.size(); list++) {
    // System.out.println((list + 1) + "." + checkList.get(list));
    // }
    reader.close();
  }

}

// 1. Agregar tareas
// 2. Mostrar tareas
// 3. Eliminar tareas
// 4. Marcar tareas como completadas