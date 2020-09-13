public class StudentManagement {
    Student[] students = new Student[100];
    public static boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().compareTo(s2.getGroup()) == 0;
    }
    public void addStudent(Student newStudent)
    {
        Student stu = new Student(newStudent);
        for (int i=0; i<100; i++)
        {
            if (students[i] == null)
            {
                students[i] = stu;
                return;
            }
        }
    }
    public String studentsByGroup()
    {
        boolean[] check = new boolean[100];
        for (int i=0; i<100; i++)
        {
            check[i] = true;
        }
        StringBuilder output = new StringBuilder();
        int i = 0;
        while(students[i] != null)
        {
            if (check[i])
            {
                int j = i+1;
                output.append(students[i].getGroup()).append("\n");
                output.append(students[i].getInfo()).append("\n");
                while(students[j] != null)
                {
                    if (students[j].getGroup().compareTo(students[i].getGroup()) == 0)
                    {
                        output.append(students[j].getInfo()).append("\n");
                        check[j] = false;
                    }
                    j++;
                }
            }
            i++;
        }
        return output.toString();
    }
    public void removeStudent(String id)
    {
        int i=0;
        while (students[i] != null)
        {
            if (students[i].getId().compareTo(id) == 0)
            {
                while(students[i] != null)
                {
                    students[i] = students[i+1];
                    i++;
                }
                break;
            }
            i++;
        }
    }
    /*public static void main(String[] args)
    {
        StudentManagement s = new StudentManagement();
        Student s1 = new Student("dung", "19020261", "19020261@vnu.edu.vn");
        s1.setGroup("K64CB");
        s.addStudent(s1);
        Student s2 = new Student();
        s2.setName("Nguyen van A");
        s2.setEmail("lthdt@gmail.com");
        s2.setId("1209");
        s.addStudent(s2);
        Student s3 = new Student("kara", "20202222", "uet@vnu.edu.vn");
        //Student s4 = new Student(s3);
        s.addStudent(s3);
        s.removeStudent("000");
        System.out.println(s.studentsByGroup());
    }*/
}
