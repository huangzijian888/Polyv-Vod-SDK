package com.lamdaer.polyv.vod.service.impl;

import com.lamdaer.polyv.vod.bean.request.account.PLVodAccountRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;
import com.lamdaer.polyv.vod.constant.ApiConstants;
import com.lamdaer.polyv.vod.service.PLVodAccountService;
import com.lamdaer.polyv.vod.service.PLVodRequestAbstractService;

/**
 * 点播账户 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public class PLVodAccountServiceImpl extends PLVodRequestAbstractService implements PLVodAccountService {

    @Override
    public PLVodCommonResult getUserSpaceTrafficUsage(PLVodAccountRequest request) {
        String url = ApiConstants.GET_USER_SPACE_TRAFFIC_USAGE.replace("{userid}", request.getUserId());
        PLVodCommonResult result = getRequest(url, request.getParams());
        return result;
    }
}
