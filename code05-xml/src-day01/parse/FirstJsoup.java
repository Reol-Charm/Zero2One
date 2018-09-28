package parse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FirstJsoup {
    public static void main(String[] args) throws IOException {
        /* 1. 获取document 对象*/
//        InputStream is = FirstJsoup.class.getClassLoader().getResourceAsStream("student.xml");
        String path = FirstJsoup.class.getClassLoader().getResource("FirstXml.xml").getPath();
        Document document = Jsoup.parse(new File(path)/*String.valueOf(is)*/, "utf-8");
        /* 2. 获取 Element 对象*/
        /* 唯一标识 id, getElementById 只取出现的第一个*/
        Element name = document.getElementById("name");
        Element gender01 = document.getElementById("gender01");
        /* 3. 获取数据 */
        System.out.println("gender01.text() = " + gender01.text());
        System.out.println("gender01.className() = " + gender01.className());
        System.out.println("gender01.html() = " + gender01.html());
        System.out.println("gender01.nodeName() = " + gender01.nodeName());
        System.out.println("gender01.tagName() = " + gender01.tagName());

    }
}
