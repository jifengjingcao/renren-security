package io.renren.mine.aop;

/**
 * Created by wzf on 2018/1/10.
 */
public class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

}
