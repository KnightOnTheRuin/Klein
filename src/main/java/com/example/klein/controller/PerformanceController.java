package com.example.klein.controller;

import com.example.klein.entity.Performance;
import com.example.klein.service.PerformanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Performance)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:08:51
 */
@RestController
@RequestMapping("performance")
public class PerformanceController {
    /**
     * 服务对象
     */
    @Resource
    private PerformanceService performanceService;

    /**
     * 分页查询
     *
     * @param performance 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@GetMapping
    public ResponseEntity<Page<Performance>> queryByPage(Performance performance, PageRequest pageRequest) {
        return ResponseEntity.ok(this.performanceService.queryByPage(performance, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Performance> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.performanceService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param performance 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Performance> add(Performance performance) {
        return ResponseEntity.ok(this.performanceService.insert(performance));
    }

    /**
     * 编辑数据
     *
     * @param performance 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Performance> edit(Performance performance) {
        return ResponseEntity.ok(this.performanceService.update(performance));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.performanceService.deleteById(id));
    }

}

