package cn.itcast.day14.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/2 18:44
 * @version: 1.0
 */

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /*一. 比较对象地址值是否一致*/
        if (this == o) return true;
        /*二. 对象是否为空, 或者判断是否为 o 的实例*/
        if (o == null || getClass() != o.getClass()) return false;
        /*三. downcast*/
        Student student = (Student) o;
        /*四. 判断子类属性*/
        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
