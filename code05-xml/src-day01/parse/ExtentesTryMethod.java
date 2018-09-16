package parse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class ExtentesTryMethod {
    public static void main(String[] args) throws IOException {
        /* 1. 获取 document 对象 */
        /* 1.1 获取 src 目录下 xml 文件路径*/
        String xmlPath = ExtentesTryMethod.class
                .getClassLoader()
                .getResource("FirstXml.xml")
                .getPath();
        /* 1.2 传入路径, 解析文件, 获取 document 对象*/
        Document xml1stDocument = Jsoup.parse(new File(xmlPath), "utf-8");
        /* 2. 获取 Elements 对象*/
        /* Elements ==> ArrayList<Element>*/
        Elements eleName = xml1stDocument.getElementsByAttributeValue("number", "name-002");
        System.out.println("numberName[0] = " + eleName.get(0));
        System.out.println("------------------");
        /* 3. 获取属性值.*/
        String numAttrVal = eleName.attr("number");
//        numAttrVal = name-002
        System.out.println("numAttrVal = " + numAttrVal);
        /* 4. 获取标签下所有元素*/
        Elements information = xml1stDocument.getElementsByTag("information");
        for (Element e : information) {
            System.out.println("e = " + e);
            System.out.println("-=-=-=-=-==-=");
            /* 4.2 获取子元素 */
            Element name01 = e.getElementById("name01");
            System.out.println("name01 = " + name01);
            System.out.println("=================");
        }
    }
}
