package in.spdev.proxy;

public class StudentProxy extends Student {
    public StudentProxy(ClassAttendance classAttendance) {
        super(classAttendance);
    }

    @Override
    public void attendSession() {
        System.out.println("Executing proxy class \n\n\n");
        if (getClassAttendance().isPresent()) {
            super.attendSession();
        }else {
            throw new RuntimeException("Student must be present to attend the class");
        }
    }
}
