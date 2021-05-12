package com.djn.controller;

import com.djn.pojo.Fsmerchant;
import com.djn.service.FsmerchantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("merchant")
public class FsmerchantController {

    @Resource
    FsmerchantService fsmerchantService;

    @ResponseBody
    @RequestMapping("queryMerchantById")
    public Fsmerchant queryMerchantById(int id) {
        return fsmerchantService.queryMerchantById(id);
    }

    @RequestMapping("insertMerchant")
    public void insertMerchant(Fsmerchant fsmerchant) {
        fsmerchantService.insertMerchant(fsmerchant);
    }

    @RequestMapping("updateMerchant")
    public void updateMerchant(Fsmerchant fsmerchant) {
        fsmerchantService.updateMerchant(fsmerchant);
    }

    @RequestMapping("deleteMerchant")
    public void deleteMerchant(int id) {
        fsmerchantService.deleteMerchant(id);
    }
}
