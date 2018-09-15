package cn.itcast.day16.exception.homework;

/**
 * @Description: 自定义异常类.
 * @Author: Rekol
 * @CreateDate: 2018/8/6 20:33
 * @version: 1.0
 */

public class NoBloodException extends Exception {
    public NoBloodException() {
    }
    public NoBloodException(String message) {
        super(message);
    }
}
