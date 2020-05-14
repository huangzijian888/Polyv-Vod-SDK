package com.lamdaer.polyv.vod.service;

import com.lamdaer.polyv.vod.bean.request.videoInformation.GetKeyInformationRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;

/**
 * 视频信息 service
 *http://dev.polyv.net/2017/videoproduct/v-api/v-api-vmanage/v-api-vmanage-info/getkeyframe/
 * @Author WangJian
 * @Date 2020-05-14 21:53
 */
public interface PLVodVideoInformationService {

    PLVodCommonResult getKeyInfomation(GetKeyInformationRequest request);

}
