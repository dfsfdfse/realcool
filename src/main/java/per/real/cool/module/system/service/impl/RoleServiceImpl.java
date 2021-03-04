package per.real.cool.module.system.service.impl;

import org.springframework.stereotype.Service;
import per.real.cool.module.common.service.CrudService;
import per.real.cool.module.system.dao.RoleDao;
import per.real.cool.module.system.entity.SysRole;
import per.real.cool.module.system.service.RoleService;

@Service
public class RoleServiceImpl extends CrudService<RoleDao, SysRole> implements RoleService {
}
