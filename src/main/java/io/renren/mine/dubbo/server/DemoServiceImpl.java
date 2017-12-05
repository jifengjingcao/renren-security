package io.renren.mine.dubbo.server;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzf on 2017/12/5.
 */
public  class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
    public List getUsers() {
        List list = new ArrayList();
        User u1 = new User();
        u1.setName("jack");

        User u2 = new User();
        u2.setName("tom");

        User u3 = new User();
        u3.setName("rose");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}
