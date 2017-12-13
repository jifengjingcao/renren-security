package io.renren.mine.dubbo.server;

import java.util.List;

/**
 * Created by wzf on 2017/12/5.
 */
public interface  DemoService {
    String sayHello(String name);

     List getUsers();
}
