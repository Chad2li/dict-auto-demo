package cn.lyjuan.dictauto.demo.vo;

import cn.lyjuan.dictauto.demo.dto.DictItemDemoDto;
import io.github.chad2li.dictauto.base.annotation.DictId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chad
 * @date 2022/5/13 22:50
 * @since 1 create by chad
 */
@Data
public class UserVo implements Serializable {
    public static final long serialVersionUID = 1L;
    private int id;
    @DictId(type = "GENDER")
    private Long genderDictId;
    /**
     * 不需要编译时自动增加的字典属性
     */
    private DictItemDemoDto genderDictItem;
    @DictId(type = "LEVEL")
    private Long levelDictId;
    private DictItemDemoDto levelDictItem;
    private String name;
    /**
     * 没有 DictId 后缀
     */
    @DictId(type = "AGE")
    private Long age;
    private DictItemDemoDto ageDictItem;
    /**
     * 一个字符字段
     */
    @DictId(type = "A", targetField = "aDict")
    private Long a;
    private DictItemDemoDto aDict;
    private AddressVo address;

    @DictId(type = "ABC")
    private Long promotionStatus;
}
