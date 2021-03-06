package cap.dao.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository(value = "adminDAO")
public class AdminDAOImpl implements AdminDAO {

    @Resource
    @Qualifier(value = "admin")
    private Admin admin;
    @Override
    public String sayHello() {
        return "您好：" + admin.getUsername();
    }
}
