class StudentM
{
    int rollNumber;
    String studentName;

    static String collegeName = "Mithibai College";
    static int count = 0;

    StudentM(int roll, String name)
    {
        rollNumber = roll;
        studentName = name;

        count++;
    }

    void display()
    {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println();
    }

    static void totalStudents()
    {
        System.out.println("Total Students: " + count);
    }

    public static void main(String[] args)
    {
        StudentM s1 = new StudentM(101, "Sherlyn");
        StudentM s2 = new StudentM(102, "Rahul");
        StudentM s3 = new StudentMs(103, "Riya");

        s1.display();
        s2.display();
        s3.display();

        Student.totalStudents();
    }
}