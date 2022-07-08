package com.example.klein.service;

import com.example.klein.entity.Entertainment;

/**
 * (Entertainment)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:06:08
 */
public interface EntertainmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param entertainmentid 主键
     * @return 实例对象
     */
    Entertainment queryById(Long entertainmentid);

    /**
     * 分页查询
     *
     * @param entertainment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Entertainment> queryByPage(Entertainment entertainment, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param entertainment 实例对象
     * @return 实例对象
     */
    Entertainment insert(Entertainment entertainment);

    /**
     * 修改数据
     *
     * @param entertainment 实例对象
     * @return 实例对象
     */
    Entertainment update(Entertainment entertainment);

    /**
     * 通过主键删除数据
     *
     * @param entertainmentid 主键
     * @return 是否成功
     */
    boolean deleteById(Long entertainmentid);

}
