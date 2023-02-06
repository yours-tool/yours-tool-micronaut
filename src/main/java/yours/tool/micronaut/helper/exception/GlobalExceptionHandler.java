package yours.tool.micronaut.helper.exception;

import com.fasterxml.jackson.core.JsonParseException;
import io.micronaut.context.annotation.Factory;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Error;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.hateoas.JsonError;
import io.micronaut.http.hateoas.Link;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yours.tool.micronaut.helper.response.ResultResponse;

import javax.validation.ConstraintViolationException;

/**
 * @description: 全局异常处理
 * @author：wbh
 * @data 2023/2/2 17:27
 * @version: v1.0
 **/
@Controller
public class GlobalExceptionHandler  {

    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Error(global = true)
    public ResultResponse<Void> jsonError(HttpRequest request, Exception e) {
        logger.error("【系统抛出Exception】 —— 异常内容如下：{}", e);
        JsonError error = new JsonError("Bad Things Happened: " + e.getMessage()) //
                .link(Link.SELF, Link.of(request.getUri()));
        return ResultResponse.ofError("服务器正在开小差");
    }

    @Error(global = true)
    public ResultResponse<Void> jsonError(HttpRequest request, ConstraintViolationException e) { //
        logger.error("【系统抛出ConstraintViolationException】 —— 异常内容如下：{}", e);
        return ResultResponse.ofError(e.getConstraintViolations().stream().findFirst().get().getMessage());
    }
}
