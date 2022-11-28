package in.spdev.runtimeproxy.handler;

import com.sun.jdi.IntegerValue;
import com.sun.jdi.Value;
import in.spdev.runtimeproxy.bean.Employee;
import in.spdev.runtimeproxy.bean.IEmployee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class EmployeeProxyInvocationHandler implements InvocationHandler {
    private IEmployee employeeTarget = new Employee();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----------");
        System.out.println("invoke");
        //pre processing
        System.out.println("proxy " + proxy.getClass());
        System.out.println(method.getName());
        if (Objects.nonNull(args)) {
            Arrays.stream(args).forEach(System.out::println);
        }

        if(method.getName().equals("giveHike")) {
            Integer hikeValue = Integer.valueOf(String.valueOf(args[0]));
            if(hikeValue>0){
                Object returnValue = method.invoke(employeeTarget, args);
                return returnValue;
            }else {
                throw new RuntimeException("Hike can't be in -ve");
            }
        }
        Object returnValue = method.invoke(employeeTarget, args);
        return returnValue;
    }
}
