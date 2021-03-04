package per.real.cool.module.system.entity;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;
import per.real.cool.module.common.entity.DataEntity;

import java.util.List;

@Data
public class SysUser extends DataEntity<SysUser> implements UserDetails {

    private static final long serialVersionUID = 1L;

    private String name;

    private String username;

    private String password;

    private String sex;

    private String phone;

    private String email;

    private String address;

    private List<SysMenu> authorities;

    public SysUser(String username){
        this.username = username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
