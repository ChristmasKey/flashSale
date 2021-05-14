package com.djn.dao;

import com.djn.pojo.Fsmerchant;
import com.djn.vo.FsmerchantVo;

import java.util.List;

public interface FsmerchantDao {

    Fsmerchant queryMerchantById(int id);

    void insertMerchant(Fsmerchant fsmerchant);

    void updateMerchant(Fsmerchant fsmerchant);

    void deleteMerchant(int id);

    List<Fsmerchant> queryMerchantByVo(FsmerchantVo fsmerchantVo);
}
