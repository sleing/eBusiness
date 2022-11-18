package com.ebus.util;

import com.ebus.entity.BUser;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {
    //将实际的文件名重命名
    public static String getNewFileName(String oldFileName) {
        int lastIndex = oldFileName.lastIndexOf(".");
        String fileType = oldFileName.substring(lastIndex);
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDDHHmmssSSS");
        String time = sdf.format(now);
        String newFileName=time+fileType;
        return newFileName;
    }

    //获得用户信息
    public static BUser getUser(HttpSession session) {
        BUser bUser = (BUser) session.getAttribute("bUser");
        return bUser;
    }
}
