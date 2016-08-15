####  README

######  1.  cglib 
    介绍cglib动态代理的基本用法.  
    通过getProxyObject生成动态代理类, 通过intercept拦截方法.

######  2.  jersey
    介绍jersey的基本用法.  
    注意对CORS跨域访问的支持.

######  3.  validator
    自定义数据校验工具, 不使用validation-api以及hibernate-validator的主要原因是不想使用springmvc.  
    ValidateService的实现主要通过java的反射机制完成.
    也可以使用jersey提供的数据校验功能, [传送门]: <https://jersey.java.net/documentation/latest/bean-validation.html>

######  4.  locksupport
    LockSupport.park()方法的使用, 以及对中断的响应.