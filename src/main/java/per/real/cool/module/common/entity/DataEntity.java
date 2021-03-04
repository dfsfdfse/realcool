package per.real.cool.module.common.entity;

import lombok.Data;
import per.real.cool.module.system.entity.SysUser;

import java.util.Date;

@Data
public class DataEntity<T> extends BaseEntity<T> {
    private static final String DEFAULT_DEL = "0";
    private static final String IS_DELETE = "1";
    private static final long serialVersionUID = 1L;

    private SysUser createBy;

    private SysUser updateBy;

    private Date createTime;

    private Date updateTime;

    private Integer sort;

    private String delFlag;

    @Override
    public void genInfo(){
        this.updateTime = new Date();
        if(null == this.getId()){
            this.createTime = this.updateTime;
        }
    }
}
