package cn.itcast.service.impl;


import cn.itcast.dao.DeleteDao;
import cn.itcast.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("deleteService")
public class DeleteServiceImpl  implements DeleteService {

    @Autowired
    private DeleteDao  deleteDao;
    //按照学号删除学生信息
    public void DeleteStudent(Integer sid){
        deleteDao.deleteOne(sid);
        deleteDao.deleteTwo(sid);
    }

}
