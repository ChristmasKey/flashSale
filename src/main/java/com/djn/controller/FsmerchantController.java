package com.djn.controller;

import com.djn.pojo.Fsmerchant;
import com.djn.service.FsmerchantService;
import com.djn.vo.FsmerchantVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("merchant")
public class FsmerchantController {

    @Resource
    FsmerchantService fsmerchantService;

    @RequestMapping("toAdd")
    public String toAdd() {
        return "merchant/add";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(HttpServletRequest request, int id) {
        Fsmerchant fsmerchant = fsmerchantService.queryMerchantById(id);
        request.setAttribute("merchant",fsmerchant);
        return "merchant/update";
    }

    @RequestMapping("queryMerchantById")
    public String queryMerchantById(HttpServletRequest request, int id) {
        Fsmerchant fsmerchant = fsmerchantService.queryMerchantById(id);
        request.setAttribute("merchant",fsmerchant);
        return "merchant/view";
    }

    @RequestMapping(value = "insertMerchant",method = RequestMethod.POST)
    public String insertMerchant(Fsmerchant fsmerchant) {
        fsmerchantService.insertMerchant(fsmerchant);
        return "redirect:/merchant/queryByVo";
    }

    @RequestMapping(value = "updateMerchant",method = RequestMethod.POST)
    public String updateMerchant(Fsmerchant fsmerchant) {
        fsmerchantService.updateMerchant(fsmerchant);
        return "redirect:/merchant/queryByVo";
    }

    @RequestMapping("deleteMerchant")
    public String deleteMerchant(int id) {
        fsmerchantService.deleteMerchant(id);
        return "redirect:/merchant/queryByVo";
    }

    @RequestMapping("queryByVo")
    public String queryByVo(HttpServletRequest request,FsmerchantVo fsmerchantVo) {
        List<Fsmerchant> fsmerchants = fsmerchantService.queryMerchantByVo(fsmerchantVo);
        request.setAttribute("merchantList", fsmerchants);
        return "merchant/list";
    }
}