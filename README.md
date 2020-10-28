# 计G202 2020322090王瑞峰 
### ***实验三 :学生选课系统***
## 1.实验目的
1. 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2. 掌握面向对象的类设计方法（属性、方法）；
3. 掌握类的继承用法，通过构造方法实例化对象；
4. 学会使用super()，用于实例化子类；
5. 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 2.实验内容
#### ①业务要求 ：
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
#### ②对象 ：
> 1. 人员 ：编号、学校、姓名、性别
> 2. 教师 ：工号、学校、姓名、性别
> 3. 学生 ：学号、学校、姓名、性别
> 4. 课程 ：课程编号、课程名称
#### ③实验要求 ：
- [x] a.编写上述实体类以及测试主类（注意类之间继承关系的适用）
- [x] b.在测试主类中，实例化多个类实体，
- [ ] c.模拟学生选课操作、
- [x] d.打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）
- [ ] e.模拟学生退课操作，再打印课程信息。
- [x] f.编写实验报告。
## 3.实验设计
①. 设计了父类
```java
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
```
②. 子类继承了父类的方法，重载了父类的方法
```java
public class Teacher extends Member{
    @Override
    void setName(String name) {
        super.setName(name);
    }
```
③. 调用了课程的构造方法
```java
 Course cour0 = new Course(254,"语文",tea3);
        Course cour1 = new Course(24,"物理化学",tea4);
        Course cour2 = new Course(210,"英语",tea5);
```
## 4. 流程图
![]()
## 5. 实验感想
