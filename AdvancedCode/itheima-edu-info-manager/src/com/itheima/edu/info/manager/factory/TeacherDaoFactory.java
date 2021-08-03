package com.itheima.edu.info.manager.factory;

import com.itheima.edu.info.manager.dao.BaseTeacherDao;
import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.OtherTeacherDao;

public class TeacherDaoFactory {
    public static BaseTeacherDao getTeacherDao(){
        return new OtherTeacherDao();
    }
}
