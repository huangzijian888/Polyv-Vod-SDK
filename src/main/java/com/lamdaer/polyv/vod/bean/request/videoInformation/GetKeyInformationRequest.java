package com.lamdaer.polyv.vod.bean.request.videoInformation;

import com.lamdaer.polyv.vod.bean.request.PLVodBaseRequest;

/**
 * 获取单个视频的打点信息
 *
 * @Author WangJian
 * @Date 2020-05-14 21:49
 */
public class GetKeyInformationRequest extends PLVodBaseRequest {

    /**
     * <pre>
     * 字段名：视频id
     * 变量名：vid
     * 是否必填：是
     * </pre>
     */
    private String vid;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public GetKeyInformationRequest(String userId, String secretKey, String vid) {
        super(userId, secretKey);
        this.vid = vid;
    }

    @Override
    public String toString() {
        return "GetKeyInformationRequest{" +
                "vid='" + vid + '\'' +
                ", userId='" + userId + '\'' +
                ", secretKey='" + secretKey + '\'' +
                ", ptime=" + ptime +
                ", sign='" + sign + '\'' +
                '}';
    }
}
