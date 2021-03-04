package per.real.cool.module.system.entity;

import org.springframework.security.core.GrantedAuthority;
import per.real.cool.module.common.entity.TreeEntity;

public class SysMenu extends TreeEntity<SysMenu> implements GrantedAuthority {

    private String name;

    private String type;

    private String permission;

    private String url;

    private String icon;

    private String show;

    @Override
    public String getAuthority() {
        return this.permission;
    }
}
