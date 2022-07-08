package com.example.klein.controller;

import com.example.klein.entity.Administration;
import com.example.klein.service.AdministrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Administration)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:05:11
 */
@RestController
@RequestMapping("administration")
public class AdministrationController {
    /**
     * 服务对象
     */
    @Resource
    private AdministrationService administrationService;

    /**
     * 分页查询
     *
     * @param administration 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
   /* @GetMapping
    public ResponseEntity<Page<Administration>> queryByPage(Administration administration, PageRequest pageRequest) {
        return ResponseEntity.ok(this.administrationService.queryByPage(administration, pageRequest));
    }
*/
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Administration> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.administrationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param administration 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Administration> add(Administration administration) {
        return ResponseEntity.ok(this.administrationService.insert(administration));
    }

    /**
     * 编辑数据
     *
     * @param administration 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Administration> edit(Administration administration) {
        return ResponseEntity.ok(this.administrationService.update(administration));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.administrationService.deleteById(id));
    }

}

