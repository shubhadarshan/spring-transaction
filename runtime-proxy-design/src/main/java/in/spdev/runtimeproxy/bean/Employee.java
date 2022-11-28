package in.spdev.runtimeproxy.bean;

import java.math.BigDecimal;

public class Employee implements IEmployee {
    public Employee() {
    }

    private int empId;
    private String empName;
    private BigDecimal salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public BigDecimal giveHike(BigDecimal hike) {
        setSalary(getSalary().add(hike));
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
