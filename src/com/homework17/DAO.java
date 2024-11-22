package com.homework17;

import java.util.*;

/**
 * 泛型 DAO 类
 * @param <T> 表示存储的实体类型
 */
public class DAO<T> {
    private Map<String, T> map = new HashMap<>(); // 存储实体的 Map

    /**
     * 保存实体对象到 Map
     * @param id 实体的唯一标识
     * @param entity 实体对象
     */
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    /**
     * 根据 id 获取实体对象
     * @param id 实体的唯一标识
     * @return 实体对象，如果不存在返回 null
     */
    public T get(String id) {
        return map.get(id);
    }

    /**
     * 根据 id 删除实体对象
     * @param id 实体的唯一标识
     */
    public void delete(String id) {
        map.remove(id);
    }

    /**
     * 更新实体对象
     * @param id 实体的唯一标识
     * @param entity 新的实体对象
     */
    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        } else {
            throw new NoSuchElementException("Entity with id " + id + " not found.");
        }
    }

    /**
     * 返回所有存储的实体对象
     * @return 实体对象的 List
     */
    public List<T> list() {
        return new ArrayList<>(map.values());
    }
}
