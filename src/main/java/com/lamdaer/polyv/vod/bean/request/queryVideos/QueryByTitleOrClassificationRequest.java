package com.lamdaer.polyv.vod.bean.request.queryVideos;

import com.lamdaer.polyv.vod.bean.request.PLVodBaseRequest;
import com.lamdaer.polyv.vod.enumeration.ErrorCodeEnum;

/**
 * 按标题或分类查找视频
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class QueryByTitleOrClassificationRequest extends PLVodBaseRequest {

    /**
     * <pre>
     * 字段名：视频标题
     * 变量名：keyword
     * 是否必填：否
     * </pre>
     */
    private String keyword;

    /**
     * <pre>
     * 字段名：分类id
     * 变量名：cataid
     * 是否必填：否
     * </pre>
     */
    private Long cataid;

    /**
     * <pre>
     * 字段名：每页显示数量
     * 变量名：numPerPage
     * 是否必填：否
     * </pre>
     */
    private int numPerPage = ErrorCodeEnum.DEFAULT.getCode();

    /**
     * <pre>
     * 字段名：页码
     * 变量名：pageNum
     * 是否必填：否
     * </pre>
     */
    private int pageNum = ErrorCodeEnum.DEFAULT.getCode();


    public QueryByTitleOrClassificationRequest(String userId, String secretKey) {
        super(userId, secretKey);
    }

    public QueryByTitleOrClassificationRequest(String userId, String secretKey, String keyword) {
        super(userId, secretKey);
        this.keyword = keyword;
    }

    public QueryByTitleOrClassificationRequest(String userId, String secretKey, Long cataid) {
        super(userId, secretKey);
        this.cataid = cataid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getCataid() {
        return cataid;
    }

    public void setCataid(Long cataid) {
        this.cataid = cataid;
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
        return "QueryByTitleOrClassificationRequest{" +
                "keyword='" + keyword + '\'' +
                ", cataid=" + cataid +
                ", numPerPage=" + numPerPage +
                ", pageNum=" + pageNum +
                ", userId='" + userId + '\'' +
                ", secretKey='" + secretKey + '\'' +
                ", ptime=" + ptime +
                ", sign='" + sign + '\'' +
                '}';
    }
}
