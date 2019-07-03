package cn.itcast.service;

import cn.itcast.domain.PersonData;

import java.util.List;

public interface PersonDataService {

    public List<PersonData> findAll(Integer sid);

    public int updata(PersonData personData);

    //向td_user_personaldata里插入一条数据
    public int insert(Integer sid);

}
