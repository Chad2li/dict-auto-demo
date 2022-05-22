package cn.lyjuan.dictauto.demo.dto;

import com.github.chad2li.dictauto.base.dto.DictItemDto;
import lombok.Data;

/**
 * @author chad
 * @date 2022/5/19 01:05
 * @since 1 create by chad
 */
@Data
public class DictItemDemoDto extends DictItemDto<Long> {
    private String remark;
}
