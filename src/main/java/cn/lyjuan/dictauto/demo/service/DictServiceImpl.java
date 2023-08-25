package cn.lyjuan.dictauto.demo.service;

import cn.lyjuan.dictauto.demo.dto.DictItemDemoDto;
import io.github.chad2li.dictauto.base.service.IDictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chad
 * @date 2022/5/19 01:02
 * @since 1 create by chad
 */
@Slf4j
@Service(IDictService.SPRING_BEAN_NAME)
public class DictServiceImpl implements IDictService<Long, DictItemDemoDto> {

    @Override
    public List<DictItemDemoDto> list(String... type) {
        log.info("dict list, type:{}", Arrays.toString(type));
        List<DictItemDemoDto> list = new ArrayList<>(10);
        list.add(new DictItemDemoDto(1L, 0L, "CITY", "浙江", "remark11"));
        list.add(new DictItemDemoDto(2L, 0L, "AGE", "2岁", "remark11"));
        list.add(new DictItemDemoDto(3L, 0L, "LEVEL", "三级", "remark11"));
        list.add(new DictItemDemoDto(4L, 0L, "GENDER", "男", "remark11"));
        list.add(new DictItemDemoDto(5L, 0L, "A", "5级", "remark11"));
        return list;
    }
}
