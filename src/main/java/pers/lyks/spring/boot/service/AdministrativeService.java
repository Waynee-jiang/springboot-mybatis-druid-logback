package pers.lyks.spring.boot.service;

import pers.lyks.spring.boot.model.area.AdministrativeModel;

import java.util.List;
import java.util.Map;

/**
 * @author lawyerance
 * @version 1.0 2017-05-20
 */
public interface AdministrativeService {
    List<AdministrativeModel> getAll();

    List<AdministrativeModel> getChildren(String adminCode);
}
