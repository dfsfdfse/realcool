package per.real.cool.module.system.entity;

import lombok.Data;
import per.real.cool.module.common.entity.DataEntity;

import java.util.List;

@Data
public class SysRole extends DataEntity<SysRole> {

    private String name;

    private String dataScope;

    private List<SysOffice> customScope;
}
