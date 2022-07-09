package com.example.klein.service.impl;

import com.example.klein.entity.Roomorder;
import com.example.klein.dao.RoomorderDao;
import com.example.klein.service.RoomorderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * (Roomorder)表服务实现类
 *
 * @author makejava
 * @since 2022-07-08 19:09:37
 */
@Service("roomorderService")
@Transactional
public class RoomorderServiceImpl implements RoomorderService {
    @Resource
    private RoomorderDao roomorderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    @Override
    public Roomorder queryById(Long orderid) {
        return this.roomorderDao.queryById(orderid);
    }

    /**
     * 分页查询
     *
     * @param roomorder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@Override
    public Page<Roomorder> queryByPage(Roomorder roomorder, PageRequest pageRequest) {
        long total = this.roomorderDao.count(roomorder);
        return new PageImpl<>(this.roomorderDao.queryAllByLimit(roomorder, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param roomorder 实例对象
     * @return 实例对象
     */
    @Override
    public Roomorder insert(Roomorder roomorder) {
        this.roomorderDao.insert(roomorder);
        return roomorder;
    }

    /**
     * 修改数据
     *
     * @param roomorder 实例对象
     * @return 实例对象
     */
    @Override
    public Roomorder update(Roomorder roomorder) {
        this.roomorderDao.update(roomorder);
        return this.queryById(roomorder.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long orderid) {
        return this.roomorderDao.deleteById(orderid) > 0;
    }
}
