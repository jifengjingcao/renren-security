package io.renren.mine.exceptionResolver.service;

import io.renren.mine.exceptionResolver.BusinessException;
import io.renren.mine.exceptionResolver.ParameterException;
import io.renren.mine.exceptionResolver.dao.TestDao;

import javax.annotation.Resource;

/**
 * Created by wzf on 2018/1/8.
 */
public class TestServiceImpl implements TestService{
    @Resource
    private TestDao testDao;

    public void exception(Integer id) throws Exception {
        switch(id) {
            case 1:
                throw new BusinessException("11", "service11");
            case 2:
                throw new BusinessException("21", "service21");
            case 3:
                throw new BusinessException("31", "service31");
            case 4:
                throw new BusinessException("41", "service41");
            case 5:
                throw new BusinessException("51", "service51");
            default:
                throw new ParameterException("Service Parameter Error");
        }
    }

    @Override
    public void dao(Integer id) throws Exception {
        testDao.exception(id);
    }
}
