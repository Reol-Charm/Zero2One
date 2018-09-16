package selector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import parse.ExtentesTryMethod;

import java.io.File;
import java.io.IOException;

public class Selector01 {
    public static void main(String[] args) throws IOException {
        /* 1. 获取 document 对象*/
        /* 1.1 获取 src 目录下 xml 文件路径*/
        String xmlPath = ExtentesTryMethod.class
                .getClassLoader()
                .getResource("FirstXml.xml")
                .getPath();
        /* 1.2 传入路径, 解析文件, 获取 document 对象*/
        Document xml1stDocument = Jsoup.parse(new File(xmlPath), "utf-8");
        /* 2. 获取到所有的性别元素*/
        Elements s = xml1stDocument.select("gender");
        for (Element element : s) {
//            System.out.println("element = " + element);
        }
        System.out.println("==========");

        /* 3. 常见选择器 (css选择器)*/

        /* 常见选择器
         * #id值  ----  .类属性值 ---- 标签名
         * [attr=val]
         * element,element	div,p	选择所有<div>元素和<p>元素
         * 更多见 菜鸟教程.
         */
//        Elements name_001 = xml1stDocument.select("information");
//        Elements name_001 = xml1stDocument.select("#name01");
//        Elements name_001 = xml1stDocument.select("name[id]");
//       [attr=val]
//        Elements name_001 = xml1stDocument.select("name[id=name01]");
//
//        Elements name_001 = xml1stDocument.select("name[hello=\"New Attribute\"]");
//        Elements name_001 = xml1stDocument.select("information > age");
//        wrong!
//        Elements name_001 = xml1stDocument.select("information[id=name01],information[hello=\"New Attribute\"]");
        Elements name_001 = xml1stDocument.select("information, hobby");
        System.out.println("name_001 = " + name_001);

    }
}
