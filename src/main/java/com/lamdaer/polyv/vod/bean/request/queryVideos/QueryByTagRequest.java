package com.lamdaer.polyv.vod.bean.request.queryVideos;

import com.lamdaer.polyv.vod.bean.request.PolyvVodBaseRequest;

/**
 * 按标签查找视频
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class QueryByTagRequest extends PolyvVodBaseRequest {

    /**
     * <pre>
     * 字段名：视频标签名称
     * 变量名：tag
     * 是否必填：否
     * </pre>
     */
    private String tag;

    /**
     * <pre>
     * 字段名：每页数量
     * 变量名：numPerPage
     * 是否必填：否
     * </pre>
     */
    private int numPerPage;

    /**
     * <pre>
     * 字段名：页码
     * 变量名：pageNum
     * 是否必填：否
     * </pre>
     */
    private int pageNum;

    public QueryByTagRequest(String userId, String secretKey) {
        super(userId, secretKey);
    }

    public QueryByTagRequest(String userId, String secretKey, String tag) {
        super(userId, secretKey);
        this.tag = tag;
    }

    public QueryByTagRequest(String userId, String secretKey, String tag, int numPerPage) {
        super(userId, secretKey);
        this.tag = tag;
        this.numPerPage = numPerPage;
    }

    public QueryByTagRequest(String userId, String secretKey, String tag, int numPerPage, int pageNum) {
        super(userId, secretKey);
        this.tag = tag;
        this.numPerPage = numPerPage;
        this.pageNum = pageNum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
        return "QueryByTagRequest{" +
                "tag='" + tag + '\'' +
                ", numPerPage=" + numPerPage +
                ", pageNum=" + pageNum +
                ", userId='" + userId + '\'' +
                ", secretKey='" + secretKey + '\'' +
                ", ptime=" + ptime +
                ", sign='" + sign + '\'' +
                '}';
    }
}
