package com.example.klein.service;

import com.example.klein.entity.Roombelongs;

/**
 * (Roombelongs)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:09:22
 */
public interface RoombelongsService {

    /**
     * 通过ID查询单条数据
     *
     * @param belongsid 主键
     * @return 实例对象
     */
    Roombelongs queryById(Long belongsid);

    /**
     * 分页查询
     *
     * @param roombelongs 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Roombelongs> queryByPage(Roombelongs roombelongs, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param roombelongs 实例对象
     * @return 实例对象
     */
    Roombelongs insert(Roombelongs roombelongs);

    /**
     * 修改数据
     *
     * @param roombelongs 实例对象
     * @return 实例对象
     */
    Roombelongs update(Roombelongs roombelongs);

    /**
     * 通过主键删除数据
     *
     * @param belongsid 主键
     * @return 是否成功
     */
    boolean deleteById(Long belongsid);

}
