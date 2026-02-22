//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course OOP = new Course("OOP", "Dr.Lee", 6);
        Course DiscreateMath = new Course("Discreate Math", "Dr.Knee", 4);
        Course EnglishLanguage = new Course("English", "Dr.Wee", 2);
        AssignmentTask Lab1 = new AssignmentTask("Lab1", OOP, 4, 5);
        AssignmentTask Lab2 = new AssignmentTask("Lab2", OOP, 3, 9);
        AssignmentTask HW1 = new AssignmentTask("Homework1", DiscreateMath, 3, 7);
        AssignmentTask HW2 = new AssignmentTask("Homework2", DiscreateMath, 5, 10);
        AssignmentTask Quiz1 = new AssignmentTask("Quiz1", EnglishLanguage, 5, 4);
        AssignmentTask Quiz2 = new AssignmentTask("Quiz2", EnglishLanguage, 4, 8);
        StudySession session1 = new StudySession (OOP, 90);
        StudySession session2 = new StudySession (OOP, 45);
        StudySession session3 = new StudySession (DiscreateMath, 120);
        StudySession session4 = new StudySession (EnglishLanguage, 60);
        StudySession session5 = new StudySession (EnglishLanguage, 30);




        System.out.println("=== Все курсы ===");
        System.out.println(OOP);
        System.out.println(DiscreateMath);
        System.out.println(EnglishLanguage);

        System.out.println("=== Задания ===");
        AssignmentTask[] tasks = {Lab1, Lab2, HW1, HW2, Quiz1, Quiz2};
        int remainHours = 0;
        for (AssignmentTask task : tasks) {
            if (task.isUrgent()) {
                System.out.println(task + " is Urgent!");
            }else {
                System.out.println(task);
            }
            if (!task.isCompleted()) {
                remainHours += task.getEstimatedHours();
            }
        }
        System.out.println("Общее оставшееся время на задания: " + remainHours);


        System.out.println("=== Время учёбы по курсам (в часах) ===");
        double oopTime = session1.hours() + session2.hours() + session5.hours();
        double mathTime = session3.hours();
        double englishTime = session4.hours();
        System.out.println("OOP:"  + oopTime);
        System.out.println("Discrete Math: " + mathTime);
        System.out.println("English: " + englishTime);


        HW1.markCompleted();
        System.out.println(HW1.getCourse().getName() + " был изменен на Completed");

        int totalRemainingHours = 0;
        for (AssignmentTask t : tasks) {
            if (!t.isCompleted()) {
                totalRemainingHours += t.getEstimatedHours();
            }
        }
        System.out.println("Новое оставшееся время: " + totalRemainingHours + " часов");
    }
}