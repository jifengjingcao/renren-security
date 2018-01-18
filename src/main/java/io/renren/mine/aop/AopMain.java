package io.renren.mine.aop;

/**
 * Created by wzf on 2018/1/10.
 */
public class AopMain {


    public static void main(String[] args) {
        /*Greeting greeting = new GreetingImpl();
        greeting.sayHello("你好");*/


       /* Greeting greetingProxy =  new GreetingProxy(new GreetingImpl());
        greetingProxy.sayHello("静态代理");*/

        Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
        greeting.sayHello("动态代理");



    }
}
