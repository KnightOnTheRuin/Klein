package com.example.klein.service;

import com.example.klein.entity.Guestroom;

/**
 * (Guestroom)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:07:45
 */
public interface GuestroomService {

    /**
     * 通过ID查询单条数据
     *
     * @param roomid 主键
     * @return 实例对象
     */
    Guestroom queryById(Long roomid);

    /**
     * 分页查询
     *
     * @param guestroom 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Guestroom> queryByPage(Guestroom guestroom, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param guestroom 实例对象
     * @return 实例对象
     */
    Guestroom insert(Guestroom guestroom);

    /**
     * 修改数据
     *
     * @param guestroom 实例对象
     * @return 实例对象
     */
    Guestroom update(Guestroom guestroom);

    /**
     * 通过主键删除数据
     *
     * @param roomid 主键
     * @return 是否成功
     */
    boolean deleteById(Long roomid);

}
