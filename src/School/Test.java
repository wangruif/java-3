package School;

public class Test {
    public static void main(String[] args){
        Student stu0 = new Student();
        Student stu1 = new Student();
        Student stu2 = new Student();
        Teacher tea0 = new Teacher();
        Teacher tea1 = new Teacher();
        Teacher tea2 = new Teacher();
        Course cour0 = new Course(549,"高等数学",tea0);
        Course cour1 = new Course(21,"离散数学",tea1);
        Course cour2 = new Course(102,"近代历史",tea2);
        stu0.setName("fuck");
        System.out.println(stu0.getName());

    }


}
