import java.util.*;
public class Main {
    public static void main(String[] args) {
        Course OOP = new Course("OOP", "Dr.Lee", 6);
        Course DMath = new Course("Discreate Math", "Dr.Wee", 4);
        Course English = new Course("English Language", "Dr.Kee", 2);

        List<PlanItem> plan = new ArrayList<>();
        plan.add(new AssignmentTask("Lab1", OOP, 4, 5));
        plan.add(new AssignmentTask("Lab2", OOP, 3, 9));
        plan.add(new AssignmentTask("HW1", DMath, 3, 7));
        plan.add(new AssignmentTask("Quiz1", English, 5, 4));

        plan.add(new StudySession(OOP, 90));
        plan.add(new StudySession(OOP, 45));
        plan.add(new StudySession(DMath, 120));
        plan.add(new StudySession(English, 60));

        System.out.println("ПЛАН НА БЛИЖАЙШЕЕ ВРЕМЯ");
        for (PlanItem item : plan) {
            System.out.println(item);
        }
        PlanItem mostUrgent = null;
        int minUrgency = Integer.MAX_VALUE;
        for (PlanItem item : plan) {
            int urg = item.calculateUrgency();
            if (urg < minUrgency && !item.isCompleted()) {
                minUrgency = urg;
                mostUrgent = item;
            }
            if (mostUrgent != null) {
                System.out.println("\nСамое срочное сейчас: " + mostUrgent);
            }
            int remainingHours = 0;
            for (PlanItem i : plan) {
                if (!i.isCompleted()) {
                    remainingHours += item.getEstimatedHours();
                }
            }
            System.out.println("Оставшееся время на всё: " + remainingHours + " часов");
        }
        System.out.println("Веведите название задание которое отметить как завершенное: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        for (PlanItem item : plan) {
            if (item instanceof AssignmentTask && item.getTitle().equals(x)) {
                item.markCompleted();
                System.out.println("Пометили как выполненное: " + item.getTitle());
                break;
            }
        }
    }
}