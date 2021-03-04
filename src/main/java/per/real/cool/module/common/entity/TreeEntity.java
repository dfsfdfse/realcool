package per.real.cool.module.common.entity;

import lombok.Data;

@Data
public class TreeEntity<T extends DataEntity> extends DataEntity<T>{

    private T parent;

    private String parentIds;

    @Override
    public void genInfo(){
        super.genInfo();
    }
}
