package cn.itcast.service.impl;

import cn.itcast.dao.PersonDataDao;
import cn.itcast.domain.PersonData;
import cn.itcast.service.PersonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("PersonDataService")
public class PersonDataServiceImpl implements PersonDataService {

    @Autowired
    private PersonDataDao personDataDao;

    public List<PersonData> findAll(Integer sid){
        return personDataDao.findAll(sid);
    }


    public int updata(PersonData personData){
        return personDataDao.updata(personData);
    }

    @Override
    public int insert(Integer sid) {
        return personDataDao.insert(sid);
    }
}
