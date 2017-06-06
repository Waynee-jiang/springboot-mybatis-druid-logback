package pers.lyks.spring.boot.dao;

import pers.lyks.spring.boot.model.area.AdministrativeModel;

import java.util.List;

/**
 * @author lawyerance
 * @version 1.0 2017-05-13
 */
public interface AdministrativeDao {
    List<AdministrativeModel> getAll();

    List<AdministrativeModel> getChildren(String adminCode);
}
