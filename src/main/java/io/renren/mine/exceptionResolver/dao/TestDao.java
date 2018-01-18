package io.renren.mine.exceptionResolver.dao;

import io.renren.mine.exceptionResolver.BusinessException;
import io.renren.mine.exceptionResolver.ParameterException;

/**
 * Created by wzf on 2018/1/8.
 */
public class TestDao {
    public void exception(Integer id) throws Exception {
        switch(id) {
            case 1:
                throw new BusinessException("12", "dao12");
            case 2:
                throw new BusinessException("22", "dao22");
            case 3:
                throw new BusinessException("32", "dao32");
            case 4:
                throw new BusinessException("42", "dao42");
            case 5:
                throw new BusinessException("52", "dao52");
            default:
                throw new ParameterException("Dao Parameter Error");
        }
    }
}
