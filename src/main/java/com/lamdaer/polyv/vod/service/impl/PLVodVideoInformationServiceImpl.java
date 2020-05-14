package com.lamdaer.polyv.vod.service.impl;

import com.lamdaer.polyv.vod.bean.request.videoInformation.GetKeyInformationRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;
import com.lamdaer.polyv.vod.constant.ApiConstants;
import com.lamdaer.polyv.vod.service.PLVodRequestAbstractService;
import com.lamdaer.polyv.vod.service.PLVodVideoInformationService;

/**
 * 视频信息  service 实现类
 * @Author WangJian
 * @Date 2020-05-14 21:56
 */
public class PLVodVideoInformationServiceImpl extends PLVodRequestAbstractService implements PLVodVideoInformationService {


    @Override
    public PLVodCommonResult getKeyInfomation(GetKeyInformationRequest request) {
        PLVodCommonResult result = getRequest(ApiConstants.GET_KEY_INFORMATION
                .replace("{userid}",request.getUserId())
                        .replace("{vid}", request.getVid()), request.getParams());
        return result;
    }
}
