package com.example.klein.service;

import com.example.klein.entity.Roomorder;

/**
 * (Roomorder)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:09:37
 */
public interface RoomorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    Roomorder queryById(Long orderid);

    /**
     * 分页查询
     *
     * @param roomorder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Roomorder> queryByPage(Roomorder roomorder, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param roomorder 实例对象
     * @return 实例对象
     */
    Roomorder insert(Roomorder roomorder);

    /**
     * 修改数据
     *
     * @param roomorder 实例对象
     * @return 实例对象
     */
    Roomorder update(Roomorder roomorder);

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 是否成功
     */
    boolean deleteById(Long orderid);

}
