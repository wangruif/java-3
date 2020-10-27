package School;

public class Course {
    private String courseName;
    private int courseId;
    private Teacher teacher;

    public Course(int courseId,String courseName,Teacher teacher){
        super();
        this.courseId = courseId;
        this.courseName = courseName;
        this.setTeacher(teacher);
    }
    public void setId(int Id){
        this.courseId = Id;
    }

    public int getId(){
        return this.courseId;
    }
    public void setName(String name){
        this.courseName = name;
    }

    public String getName(){
        return this.courseName;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
}
