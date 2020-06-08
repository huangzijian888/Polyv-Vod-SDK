package com.lamdaer.polyv.vod.service;

import com.lamdaer.polyv.vod.bean.request.editVideo.PolyvVodBulkEditAuthorizationStateRequest;
import com.lamdaer.polyv.vod.bean.result.PolyvVodCommonResult;

/**
 * 编辑视频 Service
 * http://dev.polyv.net/category/videoproduct/v-api/v-api-vmanage/v-api-vmanage-edit/
 *
 * @author lamdaer
 * createTime 2020/5/13
 */
public interface PolyvVodEditVideoService {

    /**
     * 根据vid批量修改视频的授权播放开关状态
     * http://dev.polyv.net/2017/videoproduct/v-api/v-api-vmanage/v-api-vmanage-edit/set-authplay/
     *
     * @param request
     * @return 修改后的结果
     */
    PolyvVodCommonResult bulkEditAuthorizationState(PolyvVodBulkEditAuthorizationStateRequest request);
}
