package FactoryEmployeeSalaryInformationProject;

public class Employee {
    String name, surname;
    double salary;
    int workHours;
    int hireYear;
    double increasedSalary;
    double netSalary;
    int yearsOfWorking;
    double bonusAmount;
    double taxedSalary;

    public Employee(String name, String surname, double salary, int workHours, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void calculateTax() {
        calculateBonus();
        if (this.salary >= 0) {
            if (this.netSalary > 1000) {
                taxedSalary = this.netSalary - (this.netSalary * 0.03);
            } else {
                taxedSalary = this.netSalary; // If netSalary is less than or equal to 1000, no tax deduction
            }
        } else {
            System.out.println("Salary information entered incorrectly.");
        }
    }

    public void calculateBonus() {
        calculateIncreasedSalary();
        if (workHours > 40) {
            bonusAmount = (this.workHours - 40) * 30.0;
            this.netSalary = this.increasedSalary + bonusAmount;
        } else {
            this.netSalary = this.increasedSalary; // If worked 40 hours or less, netSalary is equal to increasedSalary
        }
    }

    public void calculateIncreasedSalary() {
        this.yearsOfWorking = 2024 - this.hireYear;
        if (this.yearsOfWorking < 10) {
            this.increasedSalary = this.salary + (this.salary * 0.05);

        } else if (this.yearsOfWorking < 20) {
            this.increasedSalary = this.salary + (this.salary * 0.10);

        } else {
            this.increasedSalary = this.salary + (this.salary * 0.15);
        }
    }

    public void printInfoEmp() {
        calculateTax();
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Salary: " + this.salary +" TL");
        System.out.println("Work Hours: " + this.workHours +" Saat");
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Net Salary: " + this.taxedSalary +" TL");
        System.out.println("--------------------------------------");
    }
}
