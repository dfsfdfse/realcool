package per.real.cool.module.system.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import per.real.cool.module.common.result.JsonResult;
import per.real.cool.module.system.entity.SysUser;
import per.real.cool.module.system.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/a/sys/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findList")
    public JsonResult findList(SysUser user){
        List<SysUser> list = userService.findList(user);
        return JsonResult.success(list);
    }
}
