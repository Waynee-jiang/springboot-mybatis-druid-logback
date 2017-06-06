package pers.lyks.spring.boot.model.area;

import pers.lyks.spring.boot.model.BaseModel;

/**
 * @author lawyerance
 * @version 1.0 2017-06-05
 */
public class AdministrativeModel extends BaseModel {
    /**
     *
     */
    private static final long serialVersionUID = 1982807076526123305L;

    private int adminLevel;
    private String adminCode;
    private String adminName;
    private String parentCode;

    public int getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(int adminLevel) {
        this.adminLevel = adminLevel;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}
