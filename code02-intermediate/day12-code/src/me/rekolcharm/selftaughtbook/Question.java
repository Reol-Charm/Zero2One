package me.rekolcharm.selftaughtbook;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/26 21:17
 * @version: 1.0
 */

public abstract class Question {
    private String text;
    private String[] options;

    public Question() {
    }

    public Question(String text, String[] options) {
        this.text = text;
        this.options = options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", options=" + Arrays.toString(options) +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public abstract void show();

    public boolean check(char[] answers) {
        return false;
    }
}
