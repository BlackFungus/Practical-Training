package cn.itcast.service;

import cn.itcast.domain.PersonData;

import java.util.List;

public interface PersonDataService {

    public List<PersonData> findAll(Integer sid);

    public int updata(PersonData personData);

}
