package per.real.cool.module.common.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import per.real.cool.module.system.entity.SysUser;
import per.real.cool.module.system.service.UserService;

@Service
public class SystemDetailService implements UserDetailsService {
    @Autowired
    UserService userService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser sysUser = userService.get(new SysUser(s));
        if(null != sysUser){
            return new User(sysUser.getUsername(),sysUser.getPassword(),sysUser.getAuthorities());
        }
        return null;
    }
}
