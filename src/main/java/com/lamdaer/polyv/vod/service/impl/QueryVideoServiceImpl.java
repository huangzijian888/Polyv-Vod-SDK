package com.lamdaer.polyv.vod.service.impl;

import com.lamdaer.polyv.vod.bean.request.queryVideos.QueryByAuthorizationStateRequest;
import com.lamdaer.polyv.vod.bean.request.queryVideos.QueryByTagRequest;
import com.lamdaer.polyv.vod.bean.request.queryVideos.QueryByTitleOrClassificationRequest;
import com.lamdaer.polyv.vod.bean.result.PolyvVodCommonResult;
import com.lamdaer.polyv.vod.constant.ApiConstants;
import com.lamdaer.polyv.vod.service.PolyvVodRequestAbstractService;
import com.lamdaer.polyv.vod.service.QueryVideoService;

/**
 * 查找视频 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class QueryVideoServiceImpl extends PolyvVodRequestAbstractService implements QueryVideoService {

    @Override
    public PolyvVodCommonResult queryByAuthorizationState(QueryByAuthorizationStateRequest request) {
        PolyvVodCommonResult result = getRequest(ApiConstants.QUERY_VIDEO_BY_AUTHORIZATION_STATE.replace("{userid}", request.getUserId()), request.getParams());
        return result;
    }

    @Override
    public PolyvVodCommonResult queryByTitleOrClassification(QueryByTitleOrClassificationRequest request) {
        PolyvVodCommonResult result = getRequest(ApiConstants.QUERY_VIDEO_BY_TITLE_OR_CLASSIFICATION.replace("{userid}", request.getUserId()), request.getParams());
        return result;
    }

    @Override
    public PolyvVodCommonResult queryByTag(QueryByTagRequest request) {
        PolyvVodCommonResult result = getRequest(ApiConstants.QUERY_BY_TAG.replace("{userid}", request.getUserId()), request.getParams());
        return result;
    }
}
