package in.spdev.proxy;

public class Student implements DailySession{
    private ClassAttendance classAttendance;

    public Student(ClassAttendance classAttendance) {
        this.classAttendance = classAttendance;
    }

    @Override
    public void attendSession() {
        System.out.print("Printing in original class ");
        System.out.println("Attending Session");
    }

    public ClassAttendance getClassAttendance() {
        return classAttendance;
    }
}
