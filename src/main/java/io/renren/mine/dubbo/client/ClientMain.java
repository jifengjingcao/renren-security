package io.renren.mine.dubbo.client;

import io.renren.mine.dubbo.server.MyService;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wzf on 2017/12/5.
 */
public class ClientMain {
    static {
        BasicConfigurator.configure();
    }

    public static String path="application-client.xml";

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String[]{path});
        // 开始RPC调用
        MyService myService = (MyService)app.getBean("MyServiceImpl");
        System.out.println(myService.doMyTest("123rrr", "345"));
        while(true){
            if(!app.isActive()){
                app.start();
            }
        }
    }
}
