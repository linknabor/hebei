package com.yumu.hexie.web.home;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yumu.hexie.model.market.saleplan.YuyueRule;
import com.yumu.hexie.service.home.ToHomeService;
import com.yumu.hexie.web.BaseController;
import com.yumu.hexie.web.BaseResult;
/**
 * 到家服务action,以后新增的服务单尽量放到一个类中
 * @author hwb_work
 *
 */
@Controller(value = "homeServiceController")
public class HomeServiceController extends BaseController{
//	private static final Logger Log = LoggerFactory.getLogger(HomeServiceController.class);

    @Inject
    private ToHomeService toHomeService;
    
	/**
     * 查询预约规则信息
     * @param yuyueRuleId 预约规则ID
     * @return
     */
    @SuppressWarnings("unchecked")
	@RequestMapping(value="/homeService/queryYuyueRuleInfo/{yuyueRuleId}",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult<YuyueRule> queryYuyueRuleInfo(@PathVariable long yuyueRuleId){
    	YuyueRule rule = toHomeService.queryYuyueRuleInfo(yuyueRuleId);
    	BaseResult<YuyueRule> result = BaseResult.successResult(rule);;
    	if(rule==null){
    		//没有查询到预约规则记录，页面对这种情况做处理
    		result.setErrorCode(404);
    	}
    	return result;
    }
}

