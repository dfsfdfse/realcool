package per.real.cool.module.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import per.real.cool.module.common.dao.CrudDao;
import per.real.cool.module.common.entity.DataEntity;

import java.util.List;

public abstract class CrudService<E extends CrudDao<T>,T extends DataEntity> {

    @Autowired
    protected E dao;

    public T get(String id){
        return dao.get(id);
    }

    public T get(T entity){
        return dao.get(entity);
    }

    public List<T> findList(T entity){
        return dao.findList(entity);
    }

    public List<T> findAllList(){
        return dao.findAllList();
    }

    public int save(T entity){
        entity.genInfo();
        if(null == entity.getId() || "" == entity.getId()){
            entity.genId();
            return dao.insert(entity);
        }else {
            return dao.update(entity);
        }
    }

    public int delete(T entity){
        return dao.delete(entity);
    }

    public int delete(String id){
        return dao.delete(id);
    }

    public int deleteByIds(List<String> ids){
        return dao.deleteByIds(ids);
    }
}
