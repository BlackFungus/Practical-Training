package cn.itcast.service.impl;

import cn.itcast.dao.DengluDao;
import cn.itcast.dao.PersonDataDao;
import cn.itcast.domain.Denglu;
import cn.itcast.service.aaaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("aaaService")
public class aaaServiceImpl implements  aaaService {
    @Autowired
    private DengluDao denluDao;
    @Override
    public List<Denglu> denglua(String password) {
        return denluDao.denglua(password);
    }
}
