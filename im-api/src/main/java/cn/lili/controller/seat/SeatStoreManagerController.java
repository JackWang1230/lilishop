package cn.lili.controller.seat;

import cn.lili.common.enums.ResultUtil;
import cn.lili.common.vo.ResultMessage;
import cn.lili.modules.im.entity.vo.SeatVO;
import cn.lili.modules.im.service.SeatService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * SeatController
 *
 * @author Chopper
 * @version v1.0
 * 2022-02-10 11:50
 */
@RestController
@Api(tags = "店铺端,坐席管理")
@RequestMapping("/manager/seat/setting")
@Transactional(rollbackFor = Exception.class)
public class SeatStoreManagerController {

    @Autowired
    private SeatService seatService;

    @ApiOperation(value = "查看店铺坐席列表")
    @GetMapping("/list")
    public ResultMessage<List<SeatVO>> getSeats(String storeId) {
        return ResultUtil.data(seatService.seatVoList(storeId));
    }

}
