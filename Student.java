public class Student {
    private String name;
    private String group;
    private String id;
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String n) {
        this.group = n;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String n) {
        this.email = n;
    }
    public String getId() {
        return id;
    }
    public void setId(String n) {
        this.id = n;
    }
    public String getInfo() {
        String p = "";
        p = getName() + " - " + getId() + " - " + getGroup() + " - " + getEmail();
        return p;
    }
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }
}