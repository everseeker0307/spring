package com.everseeker.spring.validator.annotation;

import com.everseeker.spring.validator.constraints.RegexType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by everseeker on 16/8/9.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface DataValidator {
    //默认不可以为null
    boolean notNull() default true;

    //默认可以为空
    boolean notEmpty() default false;

    //最大长度
    int max() default 0;

    //最小长度
    int min() default 0;

    //提供几种常见的正则验证
    RegexType regexType() default RegexType.NONE;

    //自定义正则验证
    String regexExpression() default "";

    //参数或者字段描述
    String msg() default "";
}
