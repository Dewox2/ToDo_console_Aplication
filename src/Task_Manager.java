import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task_Manager {
    private List<Task> tasks;


    public Task_Manager(){
        tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

     public List<Task> getTasks() {
        return tasks;
    }


    public void removeTask(Task task){
        tasks.remove(task);
    }

    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("Lista zadań jest pusta.");
        } else {
            for (Task task : tasks){
                System.out.println("Nazwa zadania: " + task.getTask_name());
                System.out.println("Opis: " + task.getDescription());
                System.out.println("Deadline: " + task.getDeadline());
                System.out.println("----------------------------------");
            }
        }
    }


}
