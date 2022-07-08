package com.example.klein.service.impl;

import com.example.klein.entity.Showteam;
import com.example.klein.dao.ShowteamDao;
import com.example.klein.service.ShowteamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * (Showteam)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:10:43
 */
@Service("showteamService")
@Transactional
public class ShowteamServiceImpl implements ShowteamService {
    @Resource
    private ShowteamDao showteamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param showteamid 主键
     * @return 实例对象
     */
    @Override
    public Showteam queryById(Long showteamid) {
        return this.showteamDao.queryById(showteamid);
    }

    /**
     * 分页查询
     *
     * @param showteam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Showteam> queryByPage(Showteam showteam, PageRequest pageRequest) {
        long total = this.showteamDao.count(showteam);
        return new PageImpl<>(this.showteamDao.queryAllByLimit(showteam, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param showteam 实例对象
     * @return 实例对象
     */
    @Override
    public Showteam insert(Showteam showteam) {
        this.showteamDao.insert(showteam);
        return showteam;
    }

    /**
     * 修改数据
     *
     * @param showteam 实例对象
     * @return 实例对象
     */
    @Override
    public Showteam update(Showteam showteam) {
        this.showteamDao.update(showteam);
        return this.queryById(showteam.getShowteamid());
    }

    /**
     * 通过主键删除数据
     *
     * @param showteamid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long showteamid) {
        return this.showteamDao.deleteById(showteamid) > 0;
    }
}
