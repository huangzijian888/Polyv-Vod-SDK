package com.lamdaer.polyv.vod.constant;

/**
 * 点播接口常量类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public class ApiConstants {

    /**
     * 获取用户空间及流量情况
     */
    public static final String GET_USER_SPACE_TRAFFIC_USAGE = "http://api.polyv.net/v2/user/{userid}/main";

    /**
     * 根据授权播放开关状态查询视频
     */
    public static final String QUERY_VIDEO_BY_AUTHORIZATION_STATE = "http://api.polyv.net/v2/video/{userid}/list";

    /**
     * 按标题或分类查找视频
     */
    public static final String QUERY_VIDEO_BY_TITLE_OR_CLASSIFICATION = "http://api.polyv.net/v2/video/{userid}/search";

    private ApiConstants() {
    }

}
