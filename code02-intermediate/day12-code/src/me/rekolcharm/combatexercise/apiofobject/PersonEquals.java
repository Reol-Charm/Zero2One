package me.rekolcharm.combatexercise.apiofobject;

import java.util.Objects;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/29 16:00 - 16:25
 * @version: 1.0
 */

public class PersonEquals {
    private String name;
    private int age;

    public PersonEquals() {
    }

    public PersonEquals(int age, String name) {
        setAge(age);
        setName(name);
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
    public boolean equals(Object obj) {
        /*compare address value*/
        if (obj == this) {
            return true;
        }
        /*judge whether same type*/
        if (obj instanceof PersonEquals) {
            return true;
        }

        /*向下转型, 比较内部属性.*/
        PersonEquals pe = (PersonEquals) obj;
        if (pe.getAge() == (this.getAge()) &&
                // compare two String.
                pe.getName().equals(this.getName())) {
            return true;
        } else {
            return false;
        }
    }

    /*alt + insert automatic generate.*/

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonEquals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        PersonEquals pe = new PersonEquals(12, "hello?");
        System.out.println(pe);
        System.out.println("pe.hashCode() = " + pe.hashCode());
    }
}
