package per.real.cool.module.common.dao;

import per.real.cool.module.common.entity.DataEntity;

import java.util.List;

public interface CrudDao<T extends DataEntity> {

    T get(String id);

    T get(T entity);

    /**
     * 不包括逻辑删除
     * @param entity
     * @return
     */
    List<T> findList(T entity);

    /**
     * 包括逻辑删除
     * @return
     */
    List<T> findAllList();

    int insert(T entity);

    int update(T entity);

    int delete(String id);

    int delete(T entity);

    int deleteByIds(List<String> ids);
}
