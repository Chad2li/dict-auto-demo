package cn.lyjuan.dictauto.demo.service;

import cn.lyjuan.dictauto.demo.dto.DictItemDemoDto;
import io.github.chad2li.dictauto.base.dto.DictItemDto;
import io.github.chad2li.dictauto.base.service.IDictService;
import org.springframework.stereotype.Service;

/**
 * @author chad
 * @date 2022/5/19 01:02
 * @since 1 create by chad
 */
@Service(IDictService.SPRING_BEAN_NAME)
public class DictServiceImpl implements IDictService<Long> {
    @Override
    public DictItemDto<Long> dict(Long dictId, String type) {
        DictItemDemoDto item = new DictItemDemoDto();
        item.setId(dictId);
        item.setName(type);
        item.setRemark("remark11");
        return item;
    }
}
