package top.petter.permission.framework.core.annotation;

/**
 * 权限实体字段注册注解
 * @author : GD
 * @date :2021/3/2 : 19:01
 */
public @interface Field {

    /**
     * 是否拥有权限
     */
    boolean value() default true;
}
