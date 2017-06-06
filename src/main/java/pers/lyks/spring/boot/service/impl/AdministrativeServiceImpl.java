package pers.lyks.spring.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.lyks.spring.boot.dao.AdministrativeDao;
import pers.lyks.spring.boot.model.area.AdministrativeModel;
import pers.lyks.spring.boot.service.AdministrativeService;

import java.util.List;
import java.util.Map;

/**
 * @author lawyerance
 * @version 1.0 2017-05-20
 */
@Service
public class AdministrativeServiceImpl implements AdministrativeService {
    @Autowired
    private AdministrativeDao administrativeDao;

    @Override
    public List<AdministrativeModel> getAll() {
        return administrativeDao.getAll();
    }

    @Override
    public List<AdministrativeModel> getChildren(String adminCode) {
        return administrativeDao.getChildren(adminCode);
    }
}
