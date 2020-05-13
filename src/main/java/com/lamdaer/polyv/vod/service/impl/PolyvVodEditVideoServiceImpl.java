package com.lamdaer.polyv.vod.service.impl;

import com.lamdaer.polyv.vod.bean.request.editVideo.PolyvVodBulkEditAuthorizationStateRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;
import com.lamdaer.polyv.vod.constant.ApiConstants;
import com.lamdaer.polyv.vod.service.PLVodRequestAbstractService;
import com.lamdaer.polyv.vod.service.PolyvVodEditVideoService;

/**
 * 编辑视频 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/5/13
 */
public class PolyvVodEditVideoServiceImpl extends PLVodRequestAbstractService implements PolyvVodEditVideoService {
    @Override
    public PLVodCommonResult bulkEditAuthorizationState(PolyvVodBulkEditAuthorizationStateRequest request) {
        PLVodCommonResult result = postRequest(ApiConstants.BULK_EDIT_AUTHORIZATION_STATE.replace("{userid}", request.getUserId()), request.getParams());
        return result;
    }
}
