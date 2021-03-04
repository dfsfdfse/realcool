package per.real.cool.module.common.service;

import per.real.cool.module.common.entity.TreeEntity;

import java.util.List;

public interface ITreeService<T extends TreeEntity> extends IService<T>{

    List<T> findCurrentLevelChildren(T entity);

    List<T> findAllChildren(T entity);
}
