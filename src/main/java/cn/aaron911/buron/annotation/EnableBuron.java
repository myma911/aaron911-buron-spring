package cn.aaron911.buron.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.aaron911.buron.core.BuronAutoConfiguration;
import cn.aaron911.buron.listener.LogoApplactionListener;
import org.springframework.context.annotation.Import;


import cn.aaron911.buron.property.BuronProperty;

/**
 * 在springboot 项目启动类上添加@EnableBuron 注解
 * 
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({BuronAutoConfiguration.class, BuronProperty.class, LogoApplactionListener.class})
public @interface EnableBuron {
}
