package com.example.klein.dao;

import com.example.klein.entity.Entertainmentbelongs;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Entertainmentbelongs)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:06:36
 */
public interface EntertainmentbelongsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param belongsid 主键
     * @return 实例对象
     */
    Entertainmentbelongs queryById(Long belongsid);

    /**
     * 查询指定行数据
     *
     * @param entertainmentbelongs 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    /*List<Entertainmentbelongs> queryAllByLimit(Entertainmentbelongs entertainmentbelongs, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param entertainmentbelongs 查询条件
     * @return 总行数
     */
    long count(Entertainmentbelongs entertainmentbelongs);

    /**
     * 新增数据
     *
     * @param entertainmentbelongs 实例对象
     * @return 影响行数
     */
    int insert(Entertainmentbelongs entertainmentbelongs);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Entertainmentbelongs> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Entertainmentbelongs> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Entertainmentbelongs> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Entertainmentbelongs> entities);

    /**
     * 修改数据
     *
     * @param entertainmentbelongs 实例对象
     * @return 影响行数
     */
    int update(Entertainmentbelongs entertainmentbelongs);

    /**
     * 通过主键删除数据
     *
     * @param belongsid 主键
     * @return 影响行数
     */
    int deleteById(Long belongsid);

}

