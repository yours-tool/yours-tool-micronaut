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

    @Error(global = true)
    public ResultResponse<Void> jsonError(HttpRequest request, Exception e) { //
        return ResultResponse.ofError("服务器正在开小差");
    }

    @Error(global = true)
    public ResultResponse<Void> jsonError(HttpRequest request, ConstraintViolationException e) { //
        return ResultResponse.ofError(e.getConstraintViolations().stream().findFirst().get().getMessage());
    }
}
