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
    private DictItemDto<Long> genderDictItem;
    @DictId(type = "LEVEL")
    private Long levelDictId;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getGenderDictId() {
        return genderDictId;
    }

    public void setGenderDictId(Long genderDictId) {
        this.genderDictId = genderDictId;
    }

    public DictItemDto<Long> getGenderDictItem() {
        return genderDictItem;
    }

    public void setGenderDictItem(DictItemDto<Long> genderDictItem) {
        this.genderDictItem = genderDictItem;
    }

    public Long getLevelDictId() {
        return levelDictId;
    }

    public void setLevelDictId(Long levelDictId) {
        this.levelDictId = levelDictId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
