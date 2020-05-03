package com.lamdaer.polyv.vod.bean.request.account;

import com.lamdaer.polyv.vod.bean.request.PLVodBaseRequest;

/**
 * 获取账号相关信息的请求类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public class PLVodAccountRequest extends PLVodBaseRequest {

    /**
     * 字段名：要查询的日期
     * 格式：yyyy-MM-dd
     * 示例：2020-05-03
     * 是否必填：否
     */
    private String date;

    public PLVodAccountRequest(String userId, String secretKey) {
        super(userId, secretKey);
    }

    public PLVodAccountRequest(String userId, String secretKey, String date) {
        super(userId, secretKey);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PLVodAccountRequest{" +
                "date='" + date + '\'' +
                ", userId='" + userId + '\'' +
                ", secretKey='" + secretKey + '\'' +
                ", ptime=" + ptime +
                ", sign='" + sign + '\'' +
                '}';
    }
}
