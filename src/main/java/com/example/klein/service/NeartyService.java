package com.example.klein.service;

import com.example.klein.entity.Nearty;


/**
 * 景区附近的酒店关系表(Nearty)表服务接口
 *
 * @author makejava
 * @since 2022-07-09 19:20:18
 */
public interface NeartyService {

    /**
     * 通过ID查询单条数据
     *
     * @param neartyid 主键
     * @return 实例对象
     */
    Nearty queryById(Long neartyid);

    /**
     * 分页查询
     *
     * @param nearty 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
   /* Page<Nearty> queryByPage(Nearty nearty, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param nearty 实例对象
     * @return 实例对象
     */
    Nearty insert(Nearty nearty);

    /**
     * 修改数据
     *
     * @param nearty 实例对象
     * @return 实例对象
     */
    Nearty update(Nearty nearty);

    /**
     * 通过主键删除数据
     *
     * @param neartyid 主键
     * @return 是否成功
     */
    boolean deleteById(Long neartyid);

}
