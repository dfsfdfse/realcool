package per.real.cool.module.system.service.impl;

import org.springframework.stereotype.Service;
import per.real.cool.module.common.service.TreeService;
import per.real.cool.module.system.dao.OfficeDao;
import per.real.cool.module.system.entity.SysOffice;
import per.real.cool.module.system.service.OfficeService;

@Service
public class OfficeServiceImpl extends TreeService<OfficeDao, SysOffice> implements OfficeService {
}
