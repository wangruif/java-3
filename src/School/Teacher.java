package School;

public class Teacher extends Member{
    @Override
    void setName(String name) {
        super.setName(name);
    }

    @Override
    String getName() {
        return super.getName();
    }

    @Override
    void setId(int id) {
        super.setId(id);
    }

    @Override
    int getId() {
        return super.getId();
    }

    @Override
    void setSex(String sex) {
        super.setSex(sex);
    }

    @Override
    String getSex() {
        return super.getSex();
    }

    @Override
    void setAge(int age) {
        super.setAge(age);
    }

    @Override
    int getAge() {
        return super.getAge();
    }

    @Override
    String getSchool() {
        return super.getSchool();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "school='" + school + '\'' +
                '}';
    }
}
