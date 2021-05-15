package com.djn.service;

import com.djn.dao.FsuserDao;
import com.djn.pojo.Fsuser;
import com.djn.vo.FsuserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FsuserService {

    @Resource
    private FsuserDao fsuserDao;

    public Fsuser queryUserById(int id) {
        return fsuserDao.queryUserById(id);
    }

    public void insertUser(Fsuser fsuser) {
        fsuserDao.insertUser(fsuser);
    }

    public void updateUser(Fsuser fsuser) {
        fsuserDao.updateUser(fsuser);
    }

    public void deleteUser(int id) {
        fsuserDao.deleteUser(id);
    }

    public List<Fsuser> queryUserByVo(FsuserVo fsuserVo) {
        return fsuserDao.queryUserByVo(fsuserVo);
    }
}
