package com.example.klein.service;

import com.example.klein.entity.Performance;


/**
 * (Performance)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:08:51
 */
public interface PerformanceService {

    /**
     * 通过ID查询单条数据
     *
     * @param performanceid 主键
     * @return 实例对象
     */
    Performance queryById(Long performanceid);

    /**
     * 分页查询
     *
     * @param performance 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Performance> queryByPage(Performance performance, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param performance 实例对象
     * @return 实例对象
     */
    Performance insert(Performance performance);

    /**
     * 修改数据
     *
     * @param performance 实例对象
     * @return 实例对象
     */
    Performance update(Performance performance);

    /**
     * 通过主键删除数据
     *
     * @param performanceid 主键
     * @return 是否成功
     */
    boolean deleteById(Long performanceid);

}
