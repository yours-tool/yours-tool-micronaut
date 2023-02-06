package yours.tool.micronaut.pojo.dto;

import cn.hutool.core.date.DateUtil;
import com.google.common.collect.Lists;
import io.micronaut.core.annotation.Introspected;
import yours.tool.micronaut.pojo.base.BaseDto;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @description: 倒计时
 * @author：wbh
 * @data 2023/2/2 14:36
 * @version: v1.0
 **/
@Introspected
public class CountDownDto extends BaseDto {

    @NotBlank(message = "主题不能为空")
    private String subject;

    private String type;

    private Date date;

    private List<String> label = Lists.newArrayList();

    private BigDecimal money;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getLabel() {
        return label;
    }

    public void setLabel(List<String> label) {
        this.label = label;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
