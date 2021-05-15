package com.djn.dao;

import com.djn.pojo.Fsuser;
import com.djn.vo.FsuserVo;

import java.util.List;

public interface FsuserDao {

    void insertUser(Fsuser fsuser);

    Fsuser queryUserById(int id);

    void updateUser(Fsuser fsuser);

    void deleteUser(int id);

    List<Fsuser> queryUserByVo(FsuserVo fsuserVo);
}
