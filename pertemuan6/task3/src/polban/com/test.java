package polban.com;

public class test {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("Before raising salary:");
        for (Employee e : staff) {
            e.print();
        }

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        System.out.println("\nAfter raising salary:");
        for (Employee e : staff) {
            e.print();
        }

        System.out.println("\nBefore sorting:");
        for (Employee e : staff) {
            e.print();
        }

        Sortable.shell_sort(staff);

        System.out.println("\nAfter sorting:");
        for (Employee e : staff) {
            e.print();
        }
    }
}