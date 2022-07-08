package com.example.klein.controller;

import com.example.klein.entity.Showteam;
import com.example.klein.service.ShowteamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Showteam)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:10:43
 */
@RestController
@RequestMapping("showteam")
public class ShowteamController {
    /**
     * 服务对象
     */
    @Resource
    private ShowteamService showteamService;

    /**
     * 分页查询
     *
     * @param showteam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@GetMapping
    public ResponseEntity<Page<Showteam>> queryByPage(Showteam showteam, PageRequest pageRequest) {
        return ResponseEntity.ok(this.showteamService.queryByPage(showteam, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Showteam> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.showteamService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param showteam 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Showteam> add(Showteam showteam) {
        return ResponseEntity.ok(this.showteamService.insert(showteam));
    }

    /**
     * 编辑数据
     *
     * @param showteam 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Showteam> edit(Showteam showteam) {
        return ResponseEntity.ok(this.showteamService.update(showteam));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.showteamService.deleteById(id));
    }

}

