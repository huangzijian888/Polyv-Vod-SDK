package com.lamdaer.polyv.vod.bean.request.editVideo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.lamdaer.polyv.vod.bean.request.PLVodBaseRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据vid批量修改视频的授权播放开关状态
 * http://dev.polyv.net/2017/videoproduct/v-api/v-api-vmanage/v-api-vmanage-edit/set-authplay/
 *
 * @author lamdaer
 * createTime 2020/5/13
 */
public class PolyvVodBulkEditAuthorizationStateRequest extends PLVodBaseRequest {

    /**
     * playauth默认值
     */
    private final byte BYTE_DEFAULT = -128;

    /**
     * <pre>
     * 字段名：视频vid
     * 变量名：vids
     * 是否必填：是
     * 注意：传多个vid时需用英文逗号隔开
     * </pre>
     */
    private String vids;

    /**
     * <pre>
     * 字段名：授权播放状态
     * 变量名：playauth
     * 是否必填：否
     * 注意：1为开启 0为关闭
     * </pre>
     */
    private byte playauth = BYTE_DEFAULT;

    public PolyvVodBulkEditAuthorizationStateRequest(String userId, String secretKey, String vids) {
        super(userId, secretKey);
        this.vids = vids;
    }

    public PolyvVodBulkEditAuthorizationStateRequest(String userId, String secretKey, String vids, byte playauth) {
        super(userId, secretKey);
        this.vids = vids;
        this.playauth = playauth;
    }

    public String getVids() {
        return vids;
    }

    public void setVids(String vids) {
        this.vids = vids;
    }

    public byte getPlayauth() {
        return playauth;
    }

    public void setPlayauth(byte playauth) {
        this.playauth = playauth;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> paramMap = BeanUtil.beanToMap(this);
        Map<String, Object> params = this.paraFilter(paramMap);
        this.sign = super.generateSign(params, this.secretKey);
        params.put("sign", this.sign);
        return params;
    }

    @Override
    protected Map<String, Object> paraFilter(Map<String, Object> parameter) {
        Map<String, Object> result = new HashMap<>();
        if (parameter == null || parameter.size() <= 0) {
            return result;
        }
        for (String key : parameter.keySet()) {
            String value = parameter.get(key) + "";
            if (value.equalsIgnoreCase("null")
                    || StrUtil.hasBlank(value)
                    || key.equalsIgnoreCase("secretKey")
                    || key.equalsIgnoreCase("sign")
                    || value.equals(String.valueOf(BYTE_DEFAULT))) {
                continue;
            }
            result.put(key, value);
        }
        return result;
    }

    @Override
    public String toString() {
        return "BulkEditAuthorizationStateRequest{" +
                "vids='" + vids + '\'' +
                ", playauth=" + playauth +
                ", userId='" + userId + '\'' +
                ", secretKey='" + secretKey + '\'' +
                ", ptime=" + ptime +
                ", sign='" + sign + '\'' +
                '}';
    }
}
