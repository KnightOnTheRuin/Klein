package com.example.klein.service;

import com.example.klein.entity.Scenicarea;

/**
 * (Scenicarea)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:10:23
 */
public interface ScenicareaService {

    /**
     * 通过ID查询单条数据
     *
     * @param scenicareaid 主键
     * @return 实例对象
     */
    Scenicarea queryById(Long scenicareaid);

    /**
     * 分页查询
     *
     * @param scenicarea 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Scenicarea> queryByPage(Scenicarea scenicarea, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param scenicarea 实例对象
     * @return 实例对象
     */
    Scenicarea insert(Scenicarea scenicarea);

    /**
     * 修改数据
     *
     * @param scenicarea 实例对象
     * @return 实例对象
     */
    Scenicarea update(Scenicarea scenicarea);

    /**
     * 通过主键删除数据
     *
     * @param scenicareaid 主键
     * @return 是否成功
     */
    boolean deleteById(Long scenicareaid);

}
