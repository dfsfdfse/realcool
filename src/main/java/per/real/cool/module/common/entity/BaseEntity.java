package per.real.cool.module.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public abstract class BaseEntity<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    //使用uuid方案
    private String id;

    public BaseEntity(String id){
        this.id = id;
    }

    public void genId(){
        this.id = UUID.randomUUID().toString();
    }

    public abstract void genInfo();
}
