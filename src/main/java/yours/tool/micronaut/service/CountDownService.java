package yours.tool.micronaut.service;

import yours.tool.micronaut.pojo.dto.CountDownDto;

/**
 * @description: 接口
 * @author：wbh
 * @data 2023/2/2 16:16
 * @version: v1.0
 **/
public interface CountDownService {

    /**
     * 添加倒计时
     * @param countDownDto
     */
    void addCountDown(CountDownDto countDownDto);
}
