package io.renren.mine.exceptionResolver.service;

/**
 * Created by wzf on 2018/1/8.
 */
public interface TestService {
    public void exception(Integer id) throws Exception;

    public void dao(Integer id) throws Exception;
}
