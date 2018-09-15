package me.rekolcharm.selftaughtbook;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/26 21:24
 * @version: 1.0
 */

public class MultiQuestion extends Question {
    public MultiQuestion(char[] answers) {
        this.answers = answers;
    }

    public MultiQuestion(String text, String[] options, char[] answers) {
        super(text, options);
        this.answers = answers;
    }

    char[] answers;

    @Override
    public void show() {
    }
}
