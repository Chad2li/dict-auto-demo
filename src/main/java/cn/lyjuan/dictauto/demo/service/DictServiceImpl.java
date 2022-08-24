package cn.lyjuan.dictauto.demo.service;

import cn.lyjuan.dictauto.demo.dto.DictItemDemoDto;
import io.github.chad2li.dictauto.base.dto.DictItemDto;
import io.github.chad2li.dictauto.base.service.IDictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author chad
 * @date 2022/5/19 01:02
 * @since 1 create by chad
 */
@Slf4j
@Service(IDictService.SPRING_BEAN_NAME)
public class DictServiceImpl implements IDictService<Long, Object> {
    @Override
    public DictItemDto<Long> dict(Long dictId, String dictType, Object target) {
        log.info("dict dictId: {}, dictType:{}, target:{}", dictId, dictType, target);
        DictItemDemoDto item = new DictItemDemoDto();
        item.setId(dictId);
        item.setName(dictType);
        item.setRemark("remark11");
        return item;
    }
}
