package com.example.klein.service;

import com.example.klein.entity.Showteam;

/**
 * (Showteam)表服务接口
 *
 * @author makejava
 * @since 2022-07-08 19:10:43
 */
public interface ShowteamService {

    /**
     * 通过ID查询单条数据
     *
     * @param showteamid 主键
     * @return 实例对象
     */
    Showteam queryById(Long showteamid);

    /**
     * 分页查询
     *
     * @param showteam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*Page<Showteam> queryByPage(Showteam showteam, PageRequest pageRequest);*/

    /**
     * 新增数据
     *
     * @param showteam 实例对象
     * @return 实例对象
     */
    Showteam insert(Showteam showteam);

    /**
     * 修改数据
     *
     * @param showteam 实例对象
     * @return 实例对象
     */
    Showteam update(Showteam showteam);

    /**
     * 通过主键删除数据
     *
     * @param showteamid 主键
     * @return 是否成功
     */
    boolean deleteById(Long showteamid);

}
