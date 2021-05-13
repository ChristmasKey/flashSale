package com.djn.controller;

import com.djn.pojo.Fsmerchant;
import com.djn.service.FsmerchantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("merchant")
public class FsmerchantController {

    @Resource
    FsmerchantService fsmerchantService;

    @RequestMapping("add")
    public String toAdd() {
        return "merchant/add";
    }

    @RequestMapping("update")
    public String toUpdate(HttpServletRequest request, int id) {
        Fsmerchant fsmerchant = fsmerchantService.queryMerchantById(id);
        request.setAttribute("merchant",fsmerchant);
        return "merchant/update";
    }

    @ResponseBody
    @RequestMapping("queryMerchantById")
    public Fsmerchant queryMerchantById(int id) {
        return fsmerchantService.queryMerchantById(id);
    }

    @RequestMapping("insertMerchant")
    public String insertMerchant(Fsmerchant fsmerchant) {
        System.out.println(fsmerchant);
        fsmerchantService.insertMerchant(fsmerchant);
        return "merchant/success";
    }

    @RequestMapping("updateMerchant")
    public String updateMerchant(Fsmerchant fsmerchant) {
        System.out.println(fsmerchant);
        fsmerchantService.updateMerchant(fsmerchant);
        return "merchant/success";
    }

    @RequestMapping("deleteMerchant")
    public void deleteMerchant(int id) {
        fsmerchantService.deleteMerchant(id);
    }
}
