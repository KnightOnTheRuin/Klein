package com.example.klein.controller;

import com.example.klein.entity.Guestroom;
import com.example.klein.service.GuestroomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Guestroom)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:07:45
 */
@RestController
@RequestMapping("guestroom")
public class GuestroomController {
    /**
     * 服务对象
     */
    @Resource
    private GuestroomService guestroomService;

    /**
     * 分页查询
     *
     * @param guestroom 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
   /* @GetMapping
    public ResponseEntity<Page<Guestroom>> queryByPage(Guestroom guestroom, PageRequest pageRequest) {
        return ResponseEntity.ok(this.guestroomService.queryByPage(guestroom, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Guestroom> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.guestroomService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param guestroom 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Guestroom> add(Guestroom guestroom) {
        return ResponseEntity.ok(this.guestroomService.insert(guestroom));
    }

    /**
     * 编辑数据
     *
     * @param guestroom 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Guestroom> edit(Guestroom guestroom) {
        return ResponseEntity.ok(this.guestroomService.update(guestroom));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.guestroomService.deleteById(id));
    }

}

