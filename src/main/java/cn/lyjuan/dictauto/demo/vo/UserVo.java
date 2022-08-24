package cn.lyjuan.dictauto.demo.vo;

import io.github.chad2li.dictauto.base.annotation.DictId;
import io.github.chad2li.dictauto.base.dto.DictItemDto;
import lombok.Data;

/**
 * @author chad
 * @date 2022/5/13 22:50
 * @since 1 create by chad
 */
@Data
public class UserVo {
    private int id;
    @DictId
    private Long genderDictId;
    /**
     * 不需要编译时自动增加的字典属性
     */
    private DictItemDto<Long> genderDictItem;
    @DictId(type = "LEVEL")
    private Long levelDictId;
    private String name;
    private int age;
}
