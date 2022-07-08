package com.example.klein.service;

import com.example.klein.entity.Administration;

/**
 * (Administration)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:05:31
 */
public interface AdministrationService {

    /**
     * 通过ID查询单条数据
     *
     * @param administrationid 主键
     * @return 实例对象
     */
    Administration queryById(Long administrationid);

    /**
     * 分页查询
     *
     * @param administration 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Administration> queryByPage(Administration administration, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param administration 实例对象
     * @return 实例对象
     */
    Administration insert(Administration administration);

    /**
     * 修改数据
     *
     * @param administration 实例对象
     * @return 实例对象
     */
    Administration update(Administration administration);

    /**
     * 通过主键删除数据
     *
     * @param administrationid 主键
     * @return 是否成功
     */
    boolean deleteById(Long administrationid);

}
