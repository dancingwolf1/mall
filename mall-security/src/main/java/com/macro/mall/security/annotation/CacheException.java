package com.macro.mall.security.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解，有该注解的缓存方法会抛出异常
 */
@Documented
@Target(ElementType.METHOD)// 可能出现在Java程序中的语法位置
@Retention(RetentionPolicy.RUNTIME)//描述保留注解的各种策略，它们与元注解(@Retention)一起指定注释要保留多长时间
public @interface CacheException {
}
