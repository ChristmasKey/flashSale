package com.djn.service;

import com.djn.dao.FsmerchantDao;
import com.djn.pojo.Fsmerchant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FsmerchantService {

    @Resource
    FsmerchantDao fsmerchantDao;

    public Fsmerchant queryMerchantById(int id) {
        return fsmerchantDao.queryMerchantById(id);
    }

    public void insertMerchant(Fsmerchant fsmerchant) {
        fsmerchantDao.insertMerchant(fsmerchant);
    }

    public void updateMerchant(Fsmerchant fsmerchant) {
        fsmerchantDao.updateMerchant(fsmerchant);
    }

    public void deleteMerchant(int id) {
        fsmerchantDao.deleteMerchant(id);
    }
}
