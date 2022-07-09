package com.example.klein.controller;

import com.example.klein.entity.Scenicarea;
import com.example.klein.service.ScenicareaService;
import com.example.klein.utils.result.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * (Scenicarea)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:10:11
 */
@RestController
@RequestMapping("scenicarea")
public class ScenicareaController {
    /**
     * 服务对象
     */
    @Resource
    private ScenicareaService scenicareaService;

    /**
     * 分页查询
     *
     * @param scenicarea 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@GetMapping
    public ResponseEntity<Page<Scenicarea>> queryByPage(Scenicarea scenicarea, PageRequest pageRequest) {
        return ResponseEntity.ok(this.scenicareaService.queryByPage(scenicarea, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Scenicarea> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.scenicareaService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param scenicarea 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Scenicarea> add(Scenicarea scenicarea) {
        return ResponseEntity.ok(this.scenicareaService.insert(scenicarea));
    }

    /**
     * 编辑数据
     *
     * @param scenicarea 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Scenicarea> edit(Scenicarea scenicarea) {
        return ResponseEntity.ok(this.scenicareaService.update(scenicarea));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.scenicareaService.deleteById(id));
    }

    //通过名字模糊查询景区
    @GetMapping("/dimQueryByName")
    public Result dimQueryByName(@RequestBody String dimName){
        List<Scenicarea> scenicareaList = this.scenicareaService.dimQueryByName("%"+dimName+"%");
        return Result.success(scenicareaList);
    }

}

