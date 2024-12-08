package com.mall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class R <T>{
    private Integer code;      // 状态码，例如：200表示成功，500表示失败等
    private String message;    // 提示信息
    private T data;           // 数据部分，可以是任何类型的对象

    // 工厂方法
    public static <T> R<T> success(T data) {
        return new R<>(200, "成功", data);
    }

    public static <T> R<T> success(String message, T data) {
        return new R<>(200, message, data);
    }

    public static <T> R<T> error(String message) {
        return new R<>(500, message, null);
    }

    public static <T> R<T> error(String message, T data) {
        return new R<>(500, message, data);
    }
}
