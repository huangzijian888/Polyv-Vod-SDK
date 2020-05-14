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

    /**
     * 按标签查找视频
     */
    public static final String QUERY_BY_TAG = "http://api.polyv.net/v2/video/{userid}/search";

    /**
     * 根据vid批量修改视频的授权播放开关状态
     * http://dev.polyv.net/2017/videoproduct/v-api/v-api-vmanage/v-api-vmanage-edit/set-authplay/
     */
    public static final String BULK_EDIT_AUTHORIZATION_STATE = "http://api.polyv.net/v2/video/{userid}/authplay-status";

    /**
     * 获取单个视频的打点信息
     */
    public static final String GET_KEY_INFORMATION = "http://api.polyv.net/v2/video/{userid}/keyframe/{vid}";

    private ApiConstants() {
    }

}
