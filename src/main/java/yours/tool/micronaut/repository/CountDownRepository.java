package yours.tool.micronaut.repository;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import yours.tool.micronaut.pojo.entity.CountDown;

/**
 * @description: 倒计时
 * @author：wbh
 * @data 2023/2/3 15:02
 * @version: v1.0
 **/
@Repository
public interface CountDownRepository extends CrudRepository<CountDown, Long> {


}
