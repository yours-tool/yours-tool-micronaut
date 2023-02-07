package yours.tool.micronaut.pojo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description:
 * @author：wbh
 * @data 2023/2/3 14:02
 * @version: v1.0
 **/
@Entity
@Table(name = "count_down_t")
public class CountDown implements Serializable {

    /**
     * 倒计时id
     */
    @Id
    @Column(name = "count_down_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long countDownId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 主题
     */
    @Column(name = "subject")
    private String subject;

    /**
     * 类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 日期
     */
    @Column(name = "date")
    private Date date;

    /**
     * 标签
     */
    @Column(name = "label")
    private String label;

    /**
     * 金钱
     */
    @Column(name = "money")
    private BigDecimal money;

    public Long getCountDownId() {
        return countDownId;
    }

    public void setCountDownId(Long countDownId) {
        this.countDownId = countDownId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
