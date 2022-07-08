package com.example.klein.service;

import com.example.klein.entity.Entertainmentbelongs;


/**
 * (Entertainmentbelongs)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:06:36
 */
public interface EntertainmentbelongsService {

    /**
     * 通过ID查询单条数据
     *
     * @param belongsid 主键
     * @return 实例对象
     */
    Entertainmentbelongs queryById(Long belongsid);

    /**
     * 分页查询
     *
     * @param entertainmentbelongs 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Entertainmentbelongs> queryByPage(Entertainmentbelongs entertainmentbelongs, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param entertainmentbelongs 实例对象
     * @return 实例对象
     */
    Entertainmentbelongs insert(Entertainmentbelongs entertainmentbelongs);

    /**
     * 修改数据
     *
     * @param entertainmentbelongs 实例对象
     * @return 实例对象
     */
    Entertainmentbelongs update(Entertainmentbelongs entertainmentbelongs);

    /**
     * 通过主键删除数据
     *
     * @param belongsid 主键
     * @return 是否成功
     */
    boolean deleteById(Long belongsid);

}
