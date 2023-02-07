package yours.tool.micronaut.service.impl;
import java.math.BigDecimal;
import java.util.Date;
import java.util.stream.Collectors;

import cn.hutool.core.util.IdUtil;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yours.tool.micronaut.pojo.dto.CountDownDto;
import yours.tool.micronaut.pojo.entity.CountDown;
import yours.tool.micronaut.repository.CountDownRepository;
import yours.tool.micronaut.service.CountDownService;

/**
 * @description: 倒计时
 * @author：wbh
 * @data 2023/2/2 16:16
 * @version: v1.0
 **/
@Singleton
public class CountDownServiceImpl implements CountDownService {

    private static Logger logger = LoggerFactory.getLogger(CountDownServiceImpl.class);
    @Inject
    private CountDownRepository countDownRepository;

    @Override
    public void addCountDown(CountDownDto countDownDto) {
        CountDown countDown = new CountDown();
        countDown.setCountDownId(IdUtil.getSnowflakeNextId());
        countDown.setUserId(1L);
        countDown.setSubject(countDownDto.getSubject());
        countDown.setType(countDownDto.getType());
        countDown.setDate(countDownDto.getDate());
        countDown.setLabel(countDownDto.getLabel().stream().collect(Collectors.joining("|")));
        countDown.setMoney(countDownDto.getMoney());
        countDownRepository.save(countDown);
    }
}
