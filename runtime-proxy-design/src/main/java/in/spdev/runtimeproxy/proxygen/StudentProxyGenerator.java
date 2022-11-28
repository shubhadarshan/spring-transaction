package in.spdev.runtimeproxy.proxygen;

import in.spdev.runtimeproxy.bean.IEmployee;
import in.spdev.runtimeproxy.handler.EmployeeProxyInvocationHandler;

import java.lang.reflect.Proxy;

public class StudentProxyGenerator {

    public static IEmployee employeeProxy() {
        IEmployee newProxyInstance = (IEmployee) Proxy.newProxyInstance
                (IEmployee.class.getClassLoader(),
                        new Class[]{IEmployee.class},
                        new EmployeeProxyInvocationHandler());
        return newProxyInstance;
    }
}
