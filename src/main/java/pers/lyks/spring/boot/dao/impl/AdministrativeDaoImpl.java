package pers.lyks.spring.boot.dao.impl;

import org.springframework.stereotype.Repository;
import pers.lyks.spring.boot.dao.AdministrativeDao;
import pers.lyks.spring.boot.dao.BaseDao;
import pers.lyks.spring.boot.model.area.AdministrativeModel;

import java.util.List;
import java.util.Map;

/**
 * @author lawyerance
 * @version 1.0 2017-05-13
 */
@Repository
public class AdministrativeDaoImpl extends BaseDao implements AdministrativeDao {

    @Override
    public List<AdministrativeModel> getAll() {
        return sqlSession.selectList("Administrative.select_admin_all");
    }

    @Override
    public List<AdministrativeModel> getChildren(String adminCode) {
        return sqlSession.selectList("Administrative.select_children", adminCode);
    }
}
