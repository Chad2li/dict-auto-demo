package cn.lyjuan.dictauto.demo.controller;

import cn.lyjuan.base.http.vo.res.BaseRes;
import cn.lyjuan.dictauto.demo.vo.AddressVo;
import cn.lyjuan.dictauto.demo.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 自动注入样式
 *
 * @author chad
 * @date 2022/5/18 19:49
 * @since 1 create by chad
 */
@RestController
@RequestMapping
public class UserController {

    @GetMapping("user/{id}")
    public BaseRes<UserVo> user(@PathVariable Long id) {
        return BaseRes.succ(user());
    }

    @GetMapping("map")
    public BaseRes<Map> map() {
        Map<String, UserVo> map = new HashMap<>();
        map.put("user", user());

        return BaseRes.succ(map);
    }

    @GetMapping("list")
    public BaseRes<List> list() {
        List list = new ArrayList();
        list.add(user());

        return BaseRes.succ(list);
    }


    private UserVo user() {
        UserVo user = new UserVo();
        user.setId(1);
        user.setName("ZhangSan");
        user.setAge(2L);
        user.setLevelDictId(3L);
        user.setGenderDictId(4L);
        user.setA(5L);
        AddressVo address = new AddressVo();
        address.setCityDictId(1L);
        user.setAddress(address);
        return user;
    }
}
