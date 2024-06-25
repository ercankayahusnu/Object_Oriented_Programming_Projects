package FactoryEmployeeSalaryInformationProject;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali","Gün",17500,50,2024);
        Employee emp2 = new Employee("Mehmet","Atlı",25000,45,2020);
        Employee emp3 = new Employee("Ayşe","Görgün",35000,40,2000);
        emp1.printInfoEmp();
        emp2.printInfoEmp();
        emp3.printInfoEmp();
    }

}
