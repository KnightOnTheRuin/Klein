package com.example.klein.service.impl;

import com.example.klein.entity.Hotel;
import com.example.klein.dao.HotelDao;
import com.example.klein.service.HotelService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * 酒店实体表(Hotel)表服务实现类
 *
 * @author makejava
 * @since 2022-07-09 19:04:35
 */
@Service("hotelService")
public class HotelServiceImpl implements HotelService {
    @Resource
    private HotelDao hotelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hotelid 主键
     * @return 实例对象
     */
    @Override
    public Hotel queryById(Long hotelid) {
        return this.hotelDao.queryById(hotelid);
    }

    /**
     * 分页查询
     *
     * @param hotel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
   /* @Override
    public Page<Hotel> queryByPage(Hotel hotel, PageRequest pageRequest) {
        long total = this.hotelDao.count(hotel);
        return new PageImpl<>(this.hotelDao.queryAllByLimit(hotel, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    @Override
    public Hotel insert(Hotel hotel) {
        this.hotelDao.insert(hotel);
        return hotel;
    }

    /**
     * 修改数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    @Override
    public Hotel update(Hotel hotel) {
        this.hotelDao.update(hotel);
        return this.queryById(hotel.getHotelId());
    }

    /**
     * 通过主键删除数据
     *
     * @param hotelid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long hotelid) {
        return this.hotelDao.deleteById(hotelid) > 0;
    }
}
