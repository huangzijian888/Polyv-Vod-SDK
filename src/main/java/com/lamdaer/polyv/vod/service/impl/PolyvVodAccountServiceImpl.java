package com.lamdaer.polyv.vod.service.impl;

import com.lamdaer.polyv.vod.bean.request.account.PolyvVodAccountRequest;
import com.lamdaer.polyv.vod.bean.result.PolyvVodCommonResult;
import com.lamdaer.polyv.vod.constant.ApiConstants;
import com.lamdaer.polyv.vod.service.PolyvVodAccountService;
import com.lamdaer.polyv.vod.service.PolyvVodRequestAbstractService;

/**
 * 点播账户 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public class PolyvVodAccountServiceImpl extends PolyvVodRequestAbstractService implements PolyvVodAccountService {

    @Override
    public PolyvVodCommonResult getUserSpaceTrafficUsage(PolyvVodAccountRequest request) {
        String url = ApiConstants.GET_USER_SPACE_TRAFFIC_USAGE.replace("{userid}", request.getUserId());
        PolyvVodCommonResult result = getRequest(url, request.getParams());
        return result;
    }
}
