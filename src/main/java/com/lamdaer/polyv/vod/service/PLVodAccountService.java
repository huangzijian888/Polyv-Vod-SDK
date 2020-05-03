package com.lamdaer.polyv.vod.service;

import com.lamdaer.polyv.vod.bean.request.account.PLVodAccountRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;

/**
 * 点播账户 Service
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public interface PLVodAccountService {

    /**
     * 获取用户空间及流量情况
     *
     * @param request
     * @return 响应结果
     */
    PLVodCommonResult getUserSpaceTrafficUsage(PLVodAccountRequest request);
}
