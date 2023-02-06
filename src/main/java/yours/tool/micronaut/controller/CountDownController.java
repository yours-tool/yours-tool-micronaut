package yours.tool.micronaut.controller;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import yours.tool.micronaut.helper.response.ResultResponse;
import yours.tool.micronaut.pojo.dto.CountDownDto;
import yours.tool.micronaut.service.CountDownService;

import javax.validation.Valid;

/**
 * @description: 倒计时控制
 * @author：wbh
 * @data 2023/2/2 11:19
 * @version: v1.0
 **/
@Controller("countDown")
public class CountDownController {

    @Inject
    private CountDownService countDownService;

    @Post(value = "add") //
    public ResultResponse<Void> addCountDown(@Body @Valid CountDownDto countDownDto) {
        countDownService.addCountDown(countDownDto);
        return ResultResponse.ofSuccess(null);
    }
}
