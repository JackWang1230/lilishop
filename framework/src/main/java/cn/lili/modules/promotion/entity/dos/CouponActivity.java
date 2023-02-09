package cn.lili.modules.promotion.entity.dos;

import cn.lili.modules.promotion.entity.enums.CouponActivitySendTypeEnum;
import cn.lili.modules.promotion.entity.enums.CouponActivityTypeEnum;
import cn.lili.modules.promotion.entity.enums.CouponFrequencyEnum;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 优惠券活动实体类
 *
 * @author Bulbasaur
 * @since 2020-03-19 10:44 上午
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("li_coupon_activity")
@ApiModel(value = "优惠券活动实体类")
public class CouponActivity extends BasePromotions {

    private static final long serialVersionUID = 4230258450334305951L;
    /**
     * @see CouponActivityTypeEnum
     */
    @NotNull(message = "优惠券活动类型不能为空")
    @ApiModelProperty(value = "优惠券活动类型", allowableValues = "REGISTERED:新人赠券,INVITE_NEW：邀新赠券，AUTO_COUPON：自动赠券，SPECIFY：精确发券")
    private String couponActivityType;

    /**
     * @see CouponActivitySendTypeEnum
     */
    //目前仅在自动赠券模式下该参数会生效，日后如果完善发送测略则调整这里即可
    @NotNull(message = "请选择活动范围")
    @ApiModelProperty(value = "活动范围", allowableValues = "ALL:全部会员,DESIGNATED：指定会员")
    private String activityScope;
    /**
     * @see CouponFrequencyEnum
     */
    @NotNull(message = "领取周期")
    @ApiModelProperty(value = "活动范围", allowableValues = " DAY:每天, WEEK:每周, MONTH:每月")
    private String couponFrequencyEnum;

    @ApiModelProperty(value = "活动范围详情,只有精准发券使用")
    private String activityScopeInfo;

}