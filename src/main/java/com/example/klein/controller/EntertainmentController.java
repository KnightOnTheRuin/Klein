package com.example.klein.controller;

import com.example.klein.entity.Entertainment;
import com.example.klein.service.EntertainmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Entertainment)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:06:08
 */
@RestController
@RequestMapping("entertainment")
public class EntertainmentController {
    /**
     * 服务对象
     */
    @Resource
    private EntertainmentService entertainmentService;

    /**
     * 分页查询
     *
     * @param entertainment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@GetMapping
    public ResponseEntity<Page<Entertainment>> queryByPage(Entertainment entertainment, PageRequest pageRequest) {
        return ResponseEntity.ok(this.entertainmentService.queryByPage(entertainment, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Entertainment> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.entertainmentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param entertainment 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Entertainment> add(Entertainment entertainment) {
        return ResponseEntity.ok(this.entertainmentService.insert(entertainment));
    }

    /**
     * 编辑数据
     *
     * @param entertainment 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Entertainment> edit(Entertainment entertainment) {
        return ResponseEntity.ok(this.entertainmentService.update(entertainment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.entertainmentService.deleteById(id));
    }

}

