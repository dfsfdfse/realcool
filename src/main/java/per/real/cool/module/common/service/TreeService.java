package per.real.cool.module.common.service;

import per.real.cool.module.common.dao.TreeDao;
import per.real.cool.module.common.entity.DataEntity;
import per.real.cool.module.common.entity.TreeEntity;

import java.util.List;

public class TreeService<T extends TreeDao<E>,E extends TreeEntity> extends CrudService<T,E>{

    private void setTreeParentIds(E entity){
        if(null == entity.getParentIds()){
            DataEntity parent = entity.getParent();
            if(null != parent && null != parent.getId() && "" != parent.getId()){
                E e = dao.get(parent.getId());
                entity.setParentIds(e.getParentIds() + parent.getId() + ",");
            }else {
                entity.setId("");
                entity.setParentIds("0,");
            }
        }
    }

    @Override
    public int save(E entity) {
        setTreeParentIds(entity);
        return super.save(entity);
    }

    public List<E> findCurrentLevelChildren(E entity){
        setTreeParentIds(entity);
        return dao.findByParentIds(entity.getParentIds()+entity.getId());
    }

    public List<E> findAllChildren(E entity){
        setTreeParentIds(entity);
        return dao.findByParentIdsLike(entity.getParentIds()+entity.getId());
    }
}
