package in.spdev.proxy;

public class ClassAttendance {
    private int rollNo;
    private boolean isPresent;

    public ClassAttendance(int rollNo, boolean isPresent) {
        this.rollNo = rollNo;
        this.isPresent = isPresent;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
