package cn.lyjuan.dictauto.demo.vo;

import io.github.chad2li.dictauto.base.annotation.DictId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chad
 * @date 2022/5/13 22:50
 * @since 1 create by chad
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
    private int id;
    @DictId
    private Long genderDictId;
    @DictId(type = "LEVEL")
    private Long levelDictId;
    private String name;
    private int age;
}
