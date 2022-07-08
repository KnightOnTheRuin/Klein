package com.example.klein.dao;

import com.example.klein.entity.Guestroom;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Guestroom)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:07:45
 */
public interface GuestroomDao {

    /**
     * 通过ID查询单条数据
     *
     * @param roomid 主键
     * @return 实例对象
     */
    Guestroom queryById(Long roomid);

    /**
     * 查询指定行数据
     *
     * @param guestroom 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    /*List<Guestroom> queryAllByLimit(Guestroom guestroom, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param guestroom 查询条件
     * @return 总行数
     */
    long count(Guestroom guestroom);

    /**
     * 新增数据
     *
     * @param guestroom 实例对象
     * @return 影响行数
     */
    int insert(Guestroom guestroom);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Guestroom> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Guestroom> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Guestroom> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Guestroom> entities);

    /**
     * 修改数据
     *
     * @param guestroom 实例对象
     * @return 影响行数
     */
    int update(Guestroom guestroom);

    /**
     * 通过主键删除数据
     *
     * @param roomid 主键
     * @return 影响行数
     */
    int deleteById(Long roomid);

}

