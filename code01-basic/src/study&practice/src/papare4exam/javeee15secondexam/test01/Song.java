package papare4exam.javeee15secondexam.test01;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 19:24
 * @version:         1.0
 *
 */

public class Song {
    private String singer;
    private String name;

    public Song(String singer, String name) {
        this.singer = singer;
        this.name = name;
    }

    public Song() {

    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
