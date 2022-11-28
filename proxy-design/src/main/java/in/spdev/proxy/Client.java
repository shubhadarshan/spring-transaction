package in.spdev.proxy;

public class Client {
    public static void main(String[] args) {
        ClassAttendance classAttendance = new ClassAttendance(1,false);
        Student studentProxy = StudentInstanceGenerator.getInstance(classAttendance);
        System.out.println(studentProxy.getClass().getName());
        studentProxy.attendSession();
    }
}
