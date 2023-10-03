public class Task {
    private String task_name;
    private String description;

    private String deadline;

    public Task(String task_name,String description, String deadline){
        this.task_name =task_name;
        this.description =description;
        this.deadline = deadline;
    }

    public String getTask_name(){
        return task_name;
    }

    public void setTask_name(){
        this.task_name = task_name;
    }


   public void setDescription(){
        this.description = description;
   }

    public String getDescription(){
        return description;
    }

    public String getDeadline(){
        return deadline;
    }


    public void setDeadline(){
        this.deadline = deadline;
    }






}
