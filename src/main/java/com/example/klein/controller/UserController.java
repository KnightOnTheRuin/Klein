package com.example.klein.controller;

import com.example.klein.entity.User;
import com.example.klein.service.UserService;
import com.example.klein.utils.result.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-07-08 19:11:03
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 分页查询
     *
     * @param user 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    /*@GetMapping
    public ResponseEntity<Page<User>> queryByPage(User user, PageRequest pageRequest) {
        return ResponseEntity.ok(this.userService.queryByPage(user, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param userId 主键
     * @return 单条数据
     */
    @GetMapping("/queryById")
    public Result queryById(@RequestBody long userId){
        return Result.success(this.userService.queryById(userId));
    }

    //普通用户登录
    @PostMapping("/userLogin")
    public Result userLogin(@RequestBody User user) {
        User _user = this.userService.userLogin(user.getPhoneNumber(), user.getPassword());
        Result result = new Result();
       if(_user != null){
           result.setData(_user);
           result.setMsg("登陆成功");
           result.setCode(200);
       }else{
            result.setCode(402);
            result.setMsg("登陆失败");
            result.setData(null);
       }
        return result;
    }

    //查询数据库所有数据
    @PostMapping("/queryAll")
    public Result queryAll(){
        Result result = new Result();
        List<User> userList = this.userService.queryAll();
        if(userList != null){
            result.setData(userList);
        }else{
            result.setData(null);
        }
        return Result.success(result.getData());
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
  /*  @PostMapping
    public ResponseEntity<User> add(User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }
*/
    @PostMapping("/userRegister")
    public Result userRegister(@RequestBody User user){
        Result result = new Result();
        User _user =  this.userService.insert(user);
        if(_user != null){
            result.setMsg("注册成功");
            result.setData(null);
            result.setCode(200);
        }else{
            System.out.println("注册用户失败！");
            result.setData(null);
            result.setCode(402);
            result.setMsg("注册失败");
        }
        return result;
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<User> edit(User user) {
        return ResponseEntity.ok(this.userService.update(user));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.userService.deleteById(id));
    }

}

