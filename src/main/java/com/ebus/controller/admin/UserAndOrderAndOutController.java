package com.ebus.controller.admin;

import javax.servlet.http.HttpSession;

import com.ebus.entity.AUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ebus.service.admin.UserAndOrderAndOutService;

@Controller
public class UserAndOrderAndOutController extends AdminBaseController {
    @Autowired
    private UserAndOrderAndOutService userAndOrderAndOutService;
    //安全退出
    @RequestMapping("/loginOut")
    public String loginOut(@ModelAttribute("aUser") AUser aUser, HttpSession session) {
        session.invalidate();
        return "admin/login";
    }

    @RequestMapping("/selectUser")
    public String selectUser(Model model, int currentPage) {
        return userAndOrderAndOutService.selectUser(model, currentPage);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(Model model, int id) {
        return userAndOrderAndOutService.deleteUser(model, id);
    }

    @RequestMapping("/selectOrder")
    public String selectOrder(Model model, int currentPage) {
        return userAndOrderAndOutService.selectOrder(model, currentPage);
    }
}