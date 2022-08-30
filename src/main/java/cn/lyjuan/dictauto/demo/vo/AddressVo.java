package cn.lyjuan.dictauto.demo.vo;

import io.github.chad2li.dictauto.base.annotation.DictId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 地址
 *
 * @author chad
 * @since 1 create by chad at 2022/8/25 14:39
 */
@Data
public class AddressVo {
    @DictId
    private Long cityDictId;
}
