public class StudySession extends PlanItem {
    private int minutes;

    public StudySession(Course course, int minutes) {
        super("Study Session:  " + course.getName(), course, (int) Math.ceil(minutes / 60.0));
        this.minutes = minutes;
    }

    public double hours() {
        return (minutes/60.0);
    }

    @Override
    public String toString() {
        return "StudySession{" + "course=" + course + ", minutes=" + minutes + "}";
    }
    @Override
    public int calculateUrgency() {
        return 50;
    }
}


