package cn.itcast.day24_Stream.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/22 21:00 - 17
 * @version: 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 问题：
 * 以下是某不知名机构评出的全球最佳影片及华人最佳影片前十名 ：
 * 全球
 * 　　1、 《教父》
 * 　　2、 《肖申克的救赎》
 * 　　3、 《辛德勒的名单》
 * 　　4、 《公民凯恩》
 * 　　5、 《卡萨布兰卡》
 * 　　6、 《教父续集》
 * 　　7、 《七武士》
 * 　　8、 《星球大战》
 * 　　9、 《美国美人》
 * 　　10、 《飞跃疯人院》
 * <p>
 * 华人
 * 　  1、 《霸王别姬》
 * 　　2、 《大闹天宫》
 * 　　3、 《鬼子来了》
 * 　　4、 《大话西游》
 * 　　5、 《活着》
 * 　　6、 《饮食男女》
 * 　　7、 《无间道》
 * 　　8、 《天书奇谭》
 * 　　9、 《哪吒脑海》
 * 　　10、 《春光乍泄》
 * <p>
 * <p>
 * 1、现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList集合
 * 2、通过流的方式
 * 1）打印全球影片排行榜中的前三甲影片名
 * 2）打印华人影片排行榜中倒数5名的影片名
 * 3）将两个排行榜中的前5名挑出来共同存入新的集合
 * 4）定义电影Film类，以影片名为name创建Film对象并保存至集合
 */
public class Practice10 {
    public static void main(String[] args) {

        ArrayList<String> globalList = new ArrayList<String>();
        globalList.add("《教父》");
        globalList.add("《肖申克的救赎》");
        globalList.add("《辛德勒的名单》");
        globalList.add("《公民凯恩》");
        globalList.add("《卡萨布兰卡》");
        globalList.add("《教父续集》");
        globalList.add("《七武士》");
        globalList.add("《星球大战》");
        globalList.add("《美国美人》");
        globalList.add("《飞跃疯人院》");

        ArrayList<String> cnnList = new ArrayList<>();
        cnnList.add("《霸王别姬》");
        cnnList.add("《大闹天宫》");
        cnnList.add("《鬼子来了》");
        cnnList.add("《大话西游》");
        cnnList.add("《活着》");
        cnnList.add("《饮食男女》");
        cnnList.add("《无间道》");
        cnnList.add("《天书奇谭》");
        cnnList.add("《哪吒脑海》");
        cnnList.add("《春光乍泄》");
        /**     2、通过流的方式
         * 1）打印全球影片排行榜中的前三甲影片名
         * 2）打印华人影片排行榜中倒数5名的影片名
         * 3）将两个排行榜中的前5名挑出来共同存入新的集合
         * 4）定义电影Film类，以影片名为name创建Film对象并保存至集合*/
        globalList.stream().limit(3).forEach(System.out::println);

        cnnList.stream().skip(cnnList.size() - 5).forEach(System.out::println);

        List<String> collect = Stream.concat(
                globalList.stream().limit(5),
                cnnList.stream().limit(5))
                .collect(Collectors.toList());
        /**
         * 存进新的数组中:
         * toArray(String[]::new);*/
//        Stream<FilmsName> filmsNameStream = collect.stream().map(fileName -> new FilmsName(fileName));
        /*以影片名为name创建Film对象*/
        Stream<FilmsName> filmsNameStream = collect.stream().map(FilmsName::new);
        /*并保存至集合*/
        List<FilmsName> collect1 = filmsNameStream.collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
    }
}

class FilmsName {
    private String name;

    public FilmsName() {
    }

    public FilmsName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FilmsName{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}