package cn.itcast.day06.verification;

/**
 * @Description: 1. 一个类获取另外一个已被实例类的地址值
 * 2. 将类作为变量私有声明成为起点;
 * 3. 通过getter / setter 方法获取和选择哪个类.
 * @Author: Rekol
 * @CreateDate: 2018/7/15 20:55
 * @version: 1.0
 */
class PersonAndChild {
    private String name;
    private int age;
    private Book book;
    private PersonAndChild child;
    public PersonAndChild(String name, int age) {
        setName(name);
        setAge(age);
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public PersonAndChild getChild() {
        return child;
    }

    public void setChild(PersonAndChild child) {
        this.child = child;
    }
}

public class OnePersonOneBookPlus {
    public static void main(String[] args) {
        PersonAndChild pers = new PersonAndChild("Rekol_Charm", 22);
        PersonAndChild cil = new PersonAndChild("Rekol_Reol", 1);
        Book peopleBook = new Book("Core JAVA", 45);
        Book childBook = new Book("Thinking in Java", 55);

        pers.setBook(peopleBook);//Class get the address value of "peopleBook";
        cil.setBook(childBook);
        pers.setChild(cil);// Person
        peopleBook.setChild(pers);
        childBook.setChild(cil);//Book get the address value of "cil"


//        pers.setChild();//Did not instant it.
//        pers.setChild(cil);

        System.out.println("childBook = " + childBook);
        System.out.println("peopleBook = " + peopleBook);
        System.out.println("cil = " + cil);
        System.out.println("pers = " + pers);
        /*        childBook.setChild(cil);//Book get the address value of "cil"*/
        System.out.println("childBook.getChild() = " + childBook.getChild());
        System.out.println("--------------------------------------------------------------");
        System.out.print("从人找到书----> 姓名: " + pers.getName() + "; age: " + pers.getAge());
        System.out.println("; title: " + pers.getBook().getTitle() + "; price: " + pers.getBook().getPrice());
        System.out.println("--------------------------------------------------------------");
        System.out.print("Child----> 姓名: " + cil.getName() + "; age: " + cil.getAge());
        System.out.println("; title: " + cil.getBook().getTitle() + "; price: " + cil.getBook().getPrice());
        System.out.println("--------------------------------------------------------------");
        System.out.println("cil.getBook() = " + cil.getBook());
    }
}
