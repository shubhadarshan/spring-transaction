package in.spdev.proxy;

public class StudentInstanceGenerator {
    public static Student getInstance(ClassAttendance classAttendance){
        return new StudentProxy(classAttendance);
    }
}
