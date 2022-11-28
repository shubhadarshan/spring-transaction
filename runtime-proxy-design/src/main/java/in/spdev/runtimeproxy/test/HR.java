package in.spdev.runtimeproxy.test;

import in.spdev.runtimeproxy.bean.IEmployee;
import in.spdev.runtimeproxy.proxygen.StudentProxyGenerator;

import java.math.BigDecimal;

public class HR {
    public static void main(String[] args) {
        IEmployee employee = StudentProxyGenerator.employeeProxy();
        System.out.println(employee.getClass());
        employee.setEmpId(1);
        employee.setEmpName("dev");
        employee.setSalary(new BigDecimal(20000));
        System.out.println("Employee toString " + employee);

        employee.giveHike(new BigDecimal(2000));
        System.out.println(employee.getSalary());
    }
}
