代理模式

1，静态代理

简单案例；
使用ThreadLocal进行数据源的静态代理切换；
`ThreadLocal相关资料已经整理到有道云上`

2，动态代理

通过JDK动态代理实现案例；
分析JDK动态代理原理；  `新的Proxy实现了被代理类（Customer）实现的接口（IFindLove）`
使用JDK动态代理实现数据源的切换；
手写JDK动态代理工具；



使用CGLib实现动态代理；
分析CGLib原理；  `新的Proxy继承了被代理类（Customer）`



Spring使用的哪种？
被代理的类（customer）若没有实现接口，则Cglib代理，相反实现了接口，则通过JDK动态代理实现；