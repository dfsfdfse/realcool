package per.real.cool.module.common.service;

import per.real.cool.module.common.entity.DataEntity;

import java.util.List;

public interface IService<T extends DataEntity> {
    T get(String id);

    T get(T entity);

    List<T> findList(T entity);

    List<T> findAllList();

    int save(T entity);

    int delete(T entity);

    int delete(String id);

    int deleteByIds(List<String> ids);
}
