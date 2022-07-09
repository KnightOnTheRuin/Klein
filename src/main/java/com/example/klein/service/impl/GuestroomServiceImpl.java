package com.example.klein.service.impl;

import com.example.klein.entity.Guestroom;
import com.example.klein.dao.GuestroomDao;
import com.example.klein.service.GuestroomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;

/**
 * (Guestroom)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:07:45
 */
@Service("guestroomService")
@Transactional
public class GuestroomServiceImpl implements GuestroomService {
    @Resource
    private GuestroomDao guestroomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roomid 主键
     * @return 实例对象
     */
    @Override
    public Guestroom queryById(Long roomid) {
        return this.guestroomDao.queryById(roomid);
    }

    /**
     * 分页查询
     *
     * @param guestroom 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
   /* @Override
    public Page<Guestroom> queryByPage(Guestroom guestroom, PageRequest pageRequest) {
        long total = this.guestroomDao.count(guestroom);
        return new PageImpl<>(this.guestroomDao.queryAllByLimit(guestroom, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param guestroom 实例对象
     * @return 实例对象
     */
    @Override
    public Guestroom insert(Guestroom guestroom) {
        this.guestroomDao.insert(guestroom);
        return guestroom;
    }

    /**
     * 修改数据
     *
     * @param guestroom 实例对象
     * @return 实例对象
     */
    @Override
    public Guestroom update(Guestroom guestroom) {
        this.guestroomDao.update(guestroom);
        return this.queryById(guestroom.getRoomId());
    }

    /**
     * 通过主键删除数据
     *
     * @param roomid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long roomid) {
        return this.guestroomDao.deleteById(roomid) > 0;
    }
}
