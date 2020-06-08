package com.lamdaer.polyv.vod.bean.request.queryVideos;

import com.lamdaer.polyv.vod.bean.request.PolyvVodBaseRequest;
import com.lamdaer.polyv.vod.enumeration.ErrorCodeEnum;

/**
 * 根据授权播放开关状态查询视频请求类
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class QueryByAuthorizationStateRequest extends PolyvVodBaseRequest {

    /**
     * <pre>
     * 字段名：授权播放开关状态
     * 变量名：playauth
     * 是否必填：是
     * </pre>
     */
    private byte playauth;

    /**
     * <pre>
     * 字段名：每页数量
     * 变量名：numPerPage
     * 是否必填：否
     * </pre>
     */
    private int numPerPage = ErrorCodeEnum.DEFAULT.getCode();

    /**
     * <pre>
     * 字段名：页数
     * 变量名：pageNum
     * 是否必填：否
     * </pre>
     */
    private int pageNum = ErrorCodeEnum.DEFAULT.getCode();

    public QueryByAuthorizationStateRequest(String userId, String secretKey, byte playauth) {
        super(userId, secretKey);
        this.playauth = playauth;
    }

    public QueryByAuthorizationStateRequest(String userId, String secretKey, byte playauth, int numPerPage) {
        super(userId, secretKey);
        this.playauth = playauth;
        this.numPerPage = numPerPage;
    }

    public QueryByAuthorizationStateRequest(String userId, String secretKey, byte playauth, int numPerPage, int pageNum) {
        super(userId, secretKey);
        this.playauth = playauth;
        this.numPerPage = numPerPage;
        this.pageNum = pageNum;
    }

    public byte getPlayauth() {
        return playauth;
    }

    public void setPlayauth(byte playauth) {
        this.playauth = playauth;
    }

    public int getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage(int numPerPage) {
        this.numPerPage = numPerPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "QueryByAuthorizationStateRequest{" +
                "playauth=" + playauth +
                ", numPerPage=" + numPerPage +
                ", pageNum=" + pageNum +
                ", userId='" + userId + '\'' +
                ", secretKey='" + secretKey + '\'' +
                ", ptime=" + ptime +
                ", sign='" + sign + '\'' +
                '}';
    }
}
