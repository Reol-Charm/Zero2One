package cn.itcast.day16.exception.homework;

/**
 * @Description: 自定义异常类的格式
 * @Author: Rekol
 * @CreateDate: 2018/8/6 19:57
 * @version: 1.0
 */

class NumberSmallerThan0Exception extends RuntimeException {
    public NumberSmallerThan0Exception(){}
    public NumberSmallerThan0Exception(String message) {
        super(message);
    }
}
