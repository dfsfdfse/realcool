package per.real.cool.module.common.dao;

import per.real.cool.module.common.entity.TreeEntity;

import java.util.List;

public interface TreeDao<T extends TreeEntity> extends CrudDao<T> {

    List<T> findByParentIds(String parentIds);

    List<T> findByParentIdsLike(String parentIds);
}
