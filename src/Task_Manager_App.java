import java.util.Scanner;

public class Task_Manager_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task_Manager taskManager = new Task_Manager();

        while (true){
            System.out.println("=== Aplikacja do zarządzania listą zadań ===");
            System.out.println("1. Dodaj zadanie");
            System.out.println("2. Usuń zadanie");
            System.out.println("3. Wyświetl zadania");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");


            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){

                case 1:
                    System.out.println("Podaj nazwę zadnia: ");
                    String name = scanner.nextLine();

                    System.out.println("Podaj opis zadania: ");
                    String description = scanner.nextLine();

                    System.out.println("Podaj czas ukończenia: ");
                    String deadline = scanner.nextLine();


                    Task task = new Task(name, description, deadline);
                    taskManager.addTask(task);
                    System.out.println("Zadania zostało dodane!");
                    break;

                case 2:
                    System.out.println("Podaj zadnaie do usunięcia: ");
                    String taskName = scanner.nextLine();
                    Task taskToRemove = null;
                    for (Task t: taskManager.getTasks()) {
                        if (t.getTask_name().equals(taskName)){
                            taskToRemove = t;
                            break;
                        }

                    }

                    if (taskToRemove != null){
                        taskManager.removeTask(taskToRemove);
                        System.out.println("Zadanie zostało usunięte");
                    }else{
                        System.out.println("Zadanie o podanej nazwie nie zostało usunięte!");

                    }
                    break;

                case 3:
                    System.out.println("Lista zadań: ");
                    taskManager.displayTasks();
                    break;

                case 0:
                    System.out.println("Dziękujemy za korzystanie z aplikacji. Do widzenia!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nieznana opcja. Spróbuj ponownie");



            }













        }






    }
}
