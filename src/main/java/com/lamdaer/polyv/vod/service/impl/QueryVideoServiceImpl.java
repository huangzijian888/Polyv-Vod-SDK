package com.lamdaer.polyv.vod.service.impl;

import com.lamdaer.polyv.vod.bean.request.queryVideos.QueryByAuthorizationStateRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;
import com.lamdaer.polyv.vod.constant.ApiConstants;
import com.lamdaer.polyv.vod.service.PLVodRequestAbstractService;
import com.lamdaer.polyv.vod.service.QueryVideoService;

/**
 * 查找视频 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class QueryVideoServiceImpl extends PLVodRequestAbstractService implements QueryVideoService {

    @Override
    public PLVodCommonResult queryByAuthorizationState(QueryByAuthorizationStateRequest request) {
        PLVodCommonResult result = getRequest(ApiConstants.QUERY_VIDEO_BY_AUTHORIZATION_STATE.replace("{userid}", request.getUserId()), request.getParams());
        return result;
    }
}
