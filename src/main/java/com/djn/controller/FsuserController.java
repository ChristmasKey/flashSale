package com.djn.controller;

import com.djn.pojo.Fsuser;
import com.djn.service.FsuserService;
import com.djn.vo.FsuserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class FsuserController {

    @Resource
    private FsuserService fsuserService;

    @RequestMapping("toAdd")
    public String toAdd() {
        return "user/add";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(HttpServletRequest request, int id) {
        Fsuser fsuser = fsuserService.queryUserById(id);
        request.setAttribute("user",fsuser);
        return "user/update";
    }

    @RequestMapping("queryUserById")
    public String queryUserById(HttpServletRequest request, int id) {
        Fsuser fsuser = fsuserService.queryUserById(id);
        request.setAttribute("user",fsuser);
        return "user/view";
    }

    @RequestMapping("insertUser")
    public String insertUser(Fsuser fsuser) {
        fsuserService.insertUser(fsuser);
        return "user/success";
    }

    @RequestMapping("updateUser")
    public String updateUser(Fsuser fsuser) {
        fsuserService.updateUser(fsuser);
        return "user/success";
    }

    @RequestMapping("deleteUser")
    public String deleteUser(int id) {
        fsuserService.deleteUser(id);
        return "user/success";
    }

    @RequestMapping("queryByVo")
    public String queryUserByVo(HttpServletRequest request, FsuserVo fsuserVo) {
        List<Fsuser> fsusers = fsuserService.queryUserByVo(fsuserVo);
        request.setAttribute("userList",fsusers);
        return "user/list";
    }
}
