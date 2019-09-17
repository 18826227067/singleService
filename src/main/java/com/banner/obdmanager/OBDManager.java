package com.banner.obdmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/obd")
public class OBDManager {
    @RequestMapping(value = "add")
    @ResponseBody
    public String addOBDToCar(){
        return "OBD已安装+ 机器1";
    }
}
