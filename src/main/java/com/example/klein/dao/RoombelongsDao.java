package com.example.klein.dao;

import com.example.klein.entity.Guestroom;
import com.example.klein.entity.Hotel;
import com.example.klein.entity.Roombelongs;
import com.example.klein.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Roombelongs)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:09:22
 */
public interface RoombelongsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param belongsid 主键
     * @return 实例对象
     */
    Roombelongs queryById(Long belongsid);

    /**
     * 查询指定行数据
     *
     * @param roombelongs 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    /*List<Roombelongs> queryAllByLimit(Roombelongs roombelongs, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param roombelongs 查询条件
     * @return 总行数
     */
    long count(Roombelongs roombelongs);

    /**
     * 新增数据
     *
     * @param roombelongs 实例对象
     * @return 影响行数
     */
    int insert(Roombelongs roombelongs);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Roombelongs> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Roombelongs> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Roombelongs> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Roombelongs> entities);

    /**
     * 修改数据
     *
     * @param roombelongs 实例对象
     * @return 影响行数
     */
    int update(Roombelongs roombelongs);

    /**
     * 通过主键删除数据
     *
     * @param belongsid 主键
     * @return 影响行数
     */
    int deleteById(Long belongsid);

    /**
     * 通过酒店Id查找酒店所拥有的房间
     *
     * @param hotelId 非主键
     * @return 实例对象
     */
    //Roombelongs queryById(Long belongsid);
    List<Guestroom> queryRoomByHotelId(long hotelId);

    /**
     * 通过房间Id查找其所属的酒店
     *
     * @param roomId 非主键
     * @return 实例对象
     */
    Hotel queryHotelByRoomId(long roomId);

    /**
     * 通过房间Id查找其所属的酒店的管理员
     *
     * @param roomId 非主键
     * @return 实例对象
     */
    User queryAdministrationByRoomId(long roomId);

}

