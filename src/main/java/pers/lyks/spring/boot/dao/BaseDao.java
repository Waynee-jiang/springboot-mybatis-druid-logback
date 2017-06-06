package pers.lyks.spring.boot.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lawyerance
 * @version 1.0 2017-05-13
 */
public class BaseDao {
    @Autowired
    protected SqlSession sqlSession;
}
