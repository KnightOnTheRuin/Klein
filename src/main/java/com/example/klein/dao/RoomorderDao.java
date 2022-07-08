package com.example.klein.dao;

import com.example.klein.entity.Roomorder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Roomorder)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-08 19:09:37
 */
public interface RoomorderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    Roomorder queryById(Long orderid);

    /**
     * 查询指定行数据
     *
     * @param roomorder 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    /*List<Roomorder> queryAllByLimit(Roomorder roomorder, @Param("pageable") Pageable pageable);*/

    /**
     * 统计总行数
     *
     * @param roomorder 查询条件
     * @return 总行数
     */
    long count(Roomorder roomorder);

    /**
     * 新增数据
     *
     * @param roomorder 实例对象
     * @return 影响行数
     */
    int insert(Roomorder roomorder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Roomorder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Roomorder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Roomorder> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Roomorder> entities);

    /**
     * 修改数据
     *
     * @param roomorder 实例对象
     * @return 影响行数
     */
    int update(Roomorder roomorder);

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 影响行数
     */
    int deleteById(Long orderid);

}

