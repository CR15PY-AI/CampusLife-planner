public class AssignmentTask extends PlanItem{
    int daysUntilDue;

    public AssignmentTask(String title, Course course, int estimatedHours, int daysUntilDue) {
        super(title, course, estimatedHours);
        this.daysUntilDue = daysUntilDue;
    }

    public boolean isUrgent() {
        return daysUntilDue <= 2 && !completed;
    }
    @Override
    public int calculateUrgency() {
        if (completed) return 100;           // уже сделано → не срочно
        if (daysUntilDue <= 1) return 1;     // очень срочно
        if (daysUntilDue <= 3) return 3;
        if (daysUntilDue <= 7) return 7;
        return 10;
    }
    @Override
    public String toString() {
        return "AssignmentTask[title='" + title + "', " + "course='" + (course.getName()) + "', " + "estHours=" + estimatedHours + ", " + "dueIn=" + daysUntilDue + ", " + "completed=" + completed + "]" ;
    }
    public int getDaysUntilDue() {
        return daysUntilDue;
    }
}

