package in.spdev.runtimeproxy.bean;

import java.math.BigDecimal;

public interface IEmployee {
    //accessor
    public int getEmpId();

    public void setEmpId(int empId);

    public String getEmpName();

    public void setEmpName(String empName);

    public BigDecimal getSalary();

    public void setSalary(BigDecimal salary);

    public BigDecimal giveHike(BigDecimal hike);

}
