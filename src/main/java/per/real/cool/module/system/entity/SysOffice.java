package per.real.cool.module.system.entity;

import lombok.Data;
import per.real.cool.module.common.entity.TreeEntity;

@Data
public class SysOffice extends TreeEntity<SysOffice> {

    private String name;

    private String email;

    private String phone;

    private SysUser principal;
}
