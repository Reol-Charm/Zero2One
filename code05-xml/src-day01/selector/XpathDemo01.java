package selector;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XpathDemo01 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        /* 1. 导入 jar 包 : jsoupXpath-0.3.2.jar*/
        /* 2. 解析出 document 对象*/
        Document doc = Jsoup.parse(
                new File(XpathDemo01.class
                        .getClassLoader()
                        .getResource("FirstXml.xml")
                        .getPath()), "utf-8");
        /* 3. 获取能够查找的 JXDocument 对象*/
        JXDocument jxdoc = new JXDocument(doc);
        /* 4. 查找, 四个方法. */
        List<Object> sel = jxdoc.sel("//@id");
        List<JXNode> jxNodes = jxdoc.selN("//age[@hello]");
        JXNode selNOne = jxdoc.selNOne("//age[@id]");
        Object selOne = jxdoc.selOne("//*[count(*)]=3]");

//       name01
        System.out.println("sel.get(0) = " + sel.get(0));
//        sel = [name01, age01, gender01, name, age, gender02, name03, age03, gender03, hobby]
        System.out.println("sel = " + sel);
        System.out.println("--------------");
//        jxNodes = [<age id="age03" number="age-003" hello="New Attribute">
//                      23
//                  </age>]
        System.out.println("jxNodes = " + jxNodes);
        System.out.println("jxNodes = " + jxNodes.get(0));
        System.out.println("--------------");
//        selNOne.getTextVal() = null
//selNOne = <age id="age01" number="age-001">
//  23
//</age>
        System.out.println("selNOne.getTextVal() = " + selNOne.getTextVal());
        System.out.println("selNOne = " + selNOne);
        System.out.println("--------------");
        System.out.println("selOne = " + selOne);
    }
}
