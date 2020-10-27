package School;

class Member {
    private String name;
    private int id;
    private String sex;
    private int age;
    final String school = "北京石油化工学院";
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setId(int id){
        this.id = id;
    }
    int getId(){
        return id;
    }
    void setSex(String sex){
        this.sex = sex;
    }
    String getSex(){
        return sex;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    String getSchool(){
        return school;
    }
}
