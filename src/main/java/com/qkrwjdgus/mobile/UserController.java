package com.qkrwjdgus.mobile;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String getUser(Device device) {

        if (device.isMobile()) {
            return "m/user";
        } else {
            return "m/desktop";
        }

    }

}
