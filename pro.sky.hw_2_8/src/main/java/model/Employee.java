package model;


import java.util.Objects;

public class Employee {



    private final String name;

    private final String surname;


    private final int departmant;
    private final double salary;

    public Employee(String name,
                    String surname,
                    int departmant,
                    double salary) {
        this.name = name;
        this.surname = surname;
        this.departmant =departmant;
        this.salary = salary;

    }
    public String getName(){
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public int getDepartmant() {
        return departmant;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Employee employee = (Employee) o;
        return departmant == employee.departmant && Double.compare(employee.salary,salary)==0&&Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname,departmant,salary);
    }

    @Override
    public String toString() {
        return String.format("ФИ; %s %s, отдел: %d, ЗП: %.2f", surname, name,departmant,salary);
    }

}
