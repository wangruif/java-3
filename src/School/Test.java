package School;

public class Test {
    public static void main(String[] args){
        Student stu0 = new Student();
        Student stu1 = new Student();
        Student stu2 = new Student();
        Teacher tea3 = new Teacher();
        Teacher tea4 = new Teacher();
        Teacher tea5 = new Teacher();
        Course cour0 = new Course(254,"语文",tea3);
        Course cour1 = new Course(24,"物理化学",tea4);
        Course cour2 = new Course(210,"英语",tea5);
        stu0.setAge(20);
        stu0.setId(2020102700);
        stu0.setMajor("食品科学与工程");
        stu0.setName("勇闯天涯");
        stu0.setSex("男");
        stu1.setAge(21);
        stu1.setId(2020102701);
        stu1.setMajor("环境工程");
        stu1.setName("雪花晶尊");
        stu1.setSex("女");
        stu2.setAge(22);
        stu2.setId(2020102702);
        stu2.setMajor("高分子材料与功能");
        stu2.setName("泰山原浆");
        stu2.setSex("男");
        tea3.setAge(53);
        tea3.setId(20100803);
        tea3.setName("孙燕京");
        tea3.setSex("女");
        tea4.setAge(54);
        tea4.setId(20100804);
        tea4.setName("韩宗旺");
        tea4.setSex("男");
        tea5.setAge(55);
        tea5.setId(20100805);
        tea5.setName("郑泰山");
        tea5.setSex("男");
        System.out.println("姓名；" + stu0.getName() +
                           "  性别；" + stu0.getSex() +
                           "  年龄；" + stu0.getAge() +
                           "  学号；" + stu0.getId() +
                           "  专业；" + stu0.getMajor() +
                           "  学校；" + stu0.getSchool() +
                "   课程；" + cour0.getName() +
                "   课程号；" + cour0.getId() +
                "   姓名；" + tea3.getName() +
                "   工号；" + tea3.getId() +
                "   性别；" + tea3.getSex() +
                "   年龄；" + tea3.getAge());
        System.out.println("姓名；" + stu1.getName() +
                "  性别；" + stu1.getSex() +
                "  年龄；" + stu1.getAge() +
                "  学号；" + stu1.getId() +
                "  专业；" + stu1.getMajor() +
                "  学校；" + stu1.getSchool() +
                "   课程；" + cour1.getName() +
                "   课程号；" + cour1.getId() +
                "   姓名；" + tea4.getName() +
                "   工号；" + tea4.getId() +
                "   性别；" + tea4.getSex() +
                "   年龄；" + tea4.getAge());
        System.out.println("姓名；" + stu2.getName() +
                "  性别；" + stu2.getSex() +
                "  年龄；" + stu2.getAge() +
                "  学号；" + stu2.getId() +
                "  专业；" + stu2.getMajor() +
                "  学校；" + stu2.getSchool() +
                "   课程；" + cour2.getName() +
                "   课程号；" + cour2.getId() +
                "   姓名；" + tea5.getName() +
                "   工号；" + tea5.getId() +
                "   性别；" + tea5.getSex() +
                "   年龄；" + tea5.getAge());

    }


}
