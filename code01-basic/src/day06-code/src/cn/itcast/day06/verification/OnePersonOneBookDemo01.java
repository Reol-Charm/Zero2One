
/**
 * @Description:一个人有一本书,一本书属于一个人;
 * @Author: Rekol
 * @CreateDate: 2018/7/15 19:18
 * @version: 1.0
 */

class Person {
    private String name;
    private int age;
    private Book book;
    public Person() {
    }
    public Person(String name, int age) {
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

    public Book getBook() {//get the Person's book???获取Book的地址值
        return book;
    }

    public void setBook(Book book) {//setup which Book???将 Person 类与 Book 类连接起来
        this.book = book;
    }
}

class Book {
    private String title;
    private float price;
    private Person people;
    private PersonAndChild child;//new
    public Book() {
    }

    public Book(String title, float price) {
        /*this.title = title;
        this.price = price;*/
        setTitle(title);//第二种构造方法内写法.
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Person getPeople() {
        return people;
    }

    public void setPeople(Person people) {
        this.people = people;
    }

    public PersonAndChild getChild() {//new
        return child;
    }

    public void setChild(PersonAndChild child) {//new
        this.child = child;
    }
}

public class OnePersonOneBookDemo01 {
    public static void main(String[] args) {
        Person per = new Person();
        Book bk = new Book("Core java", 35.0f);
        per.setName("Rekol");
        per.setAge(23);
        per.setBook(bk);
        bk.setPeople(per);//将两个类连接起来, 互相获取地址值后访问对方类中变量.
        System.out.println("per.getBook() = " + per.getBook());//@7c30a502
        System.out.println("bk = " + bk);//@7c30a502
        System.out.println("bk.getPeople() = " + bk.getPeople());//@49e4cb85
        System.out.println("per = " + per);//@49e4cb85

        System.out.print("从人找到书----> 姓名: " + per.getName() + "; 年龄" + per.getAge());
        System.out.println("; 书名: " + (per.getBook().getTitle()) + "; 价格: " + (per.getBook().getPrice()));
        System.out.println("---------------------------------------------------------------");
        System.out.print("从书找到人----> 书名: " + bk.getTitle() + "; 价格: " + bk.getPrice());
        System.out.println("; 姓名: " + bk.getPeople().getName() + "; age: " + bk.getPeople().getAge());

    }
}
