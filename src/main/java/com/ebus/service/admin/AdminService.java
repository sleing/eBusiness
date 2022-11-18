package com.ebus.service.admin;

import javax.servlet.http.HttpSession;

import com.ebus.entity.AUser;
import org.springframework.ui.Model;

public interface AdminService {
    public String login(AUser aUser, HttpSession session, Model model);
}
