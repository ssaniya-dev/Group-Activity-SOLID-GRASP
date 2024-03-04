import java.time.LocalDate;

public interface Task {
    String getTitle();
    void setTitle(String title);
    String getDescription();
    void setDescription(String description);
    LocalDate getDueDate();
    void setDueDate(LocalDate dueDate);
    String getStatus();
    void setStatus(String status);
    int getPriority();
    void setPriority(int priority);
}

public class RecurringTask implements Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;
    private int priority;
    private LocalDate recurrence;
}

public class RegularTask implements Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;
    private int priority;
}