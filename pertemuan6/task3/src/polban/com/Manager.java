package polban.com;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int day, int month, int year, double bonus) {
        super(n, s, day, month, year);
        this.bonus = bonus;
    }

    @Override
    public void raiseSalary(double byPercent) {
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    @Override
    public int compare(Sortable b) {
        if (b instanceof Manager) {
            Manager mb = (Manager) b;
            double totalCompensationThis = this.getSalary() + this.bonus;
            double totalCompensationOther = mb.getSalary() + mb.bonus;
            if (totalCompensationThis < totalCompensationOther) return -1;
            if (totalCompensationThis > totalCompensationOther) return +1;
            return 0;
        } else {
            return super.compare(b);
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" (Total compensation: " + (getSalary() + bonus) + ")");
    }
}

