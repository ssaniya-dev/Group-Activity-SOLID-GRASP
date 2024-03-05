import java.time.LocalDate;

public abstract class Task {
    protected String title;
    protected String description;
    protected LocalDate dueDate;
    protected String status;
    protected int priority;
}

public class RecurringTask extends Task {
    private LocalDate recurrence;
}

public class RegularTask extends Task {
   
}
