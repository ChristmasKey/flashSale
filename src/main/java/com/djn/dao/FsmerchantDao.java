package com.djn.dao;

import com.djn.pojo.Fsmerchant;

public interface FsmerchantDao {

    Fsmerchant queryMerchantById(int id);

    void insertMerchant(Fsmerchant fsmerchant);

    void updateMerchant(Fsmerchant fsmerchant);

    void deleteMerchant(int id);
}
