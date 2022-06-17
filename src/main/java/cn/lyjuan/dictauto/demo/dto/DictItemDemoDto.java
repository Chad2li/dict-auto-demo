package cn.lyjuan.dictauto.demo.dto;

import io.github.chad2li.dictauto.base.dto.DictItemDto;

/**
 * @author chad
 * @date 2022/5/19 01:05
 * @since 1 create by chad
 */
public class DictItemDemoDto extends DictItemDto<Long> {
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
