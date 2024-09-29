package polban.com;


public class ManagerTest {
    public static void main(String[] args) {
        Sortable[] staff = new Sortable[3];
        staff[0] = new Manager("John Doe", 100000, 1, 1, 2020, 10000);
        staff[1] = new Manager("Jane Smith", 120000, 1, 1, 2019, 15000);
        staff[2] = new Manager("Bob Johnson", 90000, 1, 1, 2021, 20000);

        System.out.println("Before sorting:");
        for (Sortable s : staff) {
            ((Manager)s).print();
        }

        Sortable.shell_sort(staff);

        System.out.println("\nAfter sorting:");
        for (Sortable s : staff) {
            ((Manager)s).print();
        }
    }
}