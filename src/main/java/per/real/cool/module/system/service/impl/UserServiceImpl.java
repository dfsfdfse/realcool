package per.real.cool.module.system.service.impl;

import org.springframework.stereotype.Service;
import per.real.cool.module.common.service.CrudService;
import per.real.cool.module.system.dao.UserDao;
import per.real.cool.module.system.entity.SysUser;
import per.real.cool.module.system.service.UserService;

@Service
public class UserServiceImpl extends CrudService<UserDao,SysUser> implements UserService {
}
