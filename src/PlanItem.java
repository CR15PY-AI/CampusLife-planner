public abstract class PlanItem {
    protected String title;
    protected Course course;
    protected boolean completed = false;
    protected int estimatedHours;

    public PlanItem(String title, Course course, int estimatedHours) {
        this.title = title;
        this.course = course;
        this.estimatedHours = estimatedHours;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getEstimatedHours() {
        return estimatedHours;
    }
    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }
    public boolean isCompleted() {
        return completed;
    }
    public abstract int calculateUrgency();

    @Override
    public abstract String toString();

    public void markCompleted() {
        this.completed = true;
    }
}