package com.lamdaer.polyv.vod.bean.request;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.lamdaer.polyv.vod.enumeration.ErrorCodeEnum;

import java.util.*;

/**
 * 请求基础类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public abstract class PLVodBaseRequest {

    /**
     * <pre>
     * 字段名：用户ID
     * 变量名：userId
     * 是否必填：是
     * </pre>
     */
    protected String userId;

    /**
     * <pre>
     * 字段名：密钥
     * 变量名：secretKey
     * 是否必填：是
     * </pre>
     */
    protected String secretKey;

    /**
     * <pre>
     * 字段名：时间戳
     * 变量名：ptime
     * 是否必填：是
     * </pre>
     */
    protected Long ptime;

    /**
     * <pre>
     * 字段名：签名
     * 变量名：sign
     * 是否必填：是
     * </pre>
     */
    protected String sign;

    public PLVodBaseRequest(String userId, String secretKey) {
        this.userId = userId;
        this.secretKey = secretKey;
        this.ptime = System.currentTimeMillis();
    }

    public Map<String, Object> getParams() {
        Map<String, Object> paramMap = BeanUtil.beanToMap(this);
        Map<String, Object> params = paraFilter(paramMap);
        this.sign = this.generateSign(params, this.secretKey);
        params.put("sign", this.sign);
        return params;
    }


    /**
     * 签名生成函数
     *
     * @param parameters 需要参与签名的参数集合
     * @param secretKey  点播后台->设置->API接口->secretkey
     * @return 签名值
     */
    protected String generateSign(Map<String, Object> parameters, String secretKey) {
        String concatStr = concatParameter(parameters);
        String plain = concatStr + secretKey;
        String encrypted = DigestUtil.sha1Hex(plain);
        return encrypted.toUpperCase();
    }

    /**
     * 参数过滤
     *
     * @param parameter 需要过滤的参数集合
     * @return 过滤后的参数集合
     */
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
                    || value.equals(String.valueOf(ErrorCodeEnum.DEFAULT.getCode()))) {
                continue;
            }
            result.put(key, value);
        }
        return result;
    }

    /**
     * 参数拼接
     *
     * @param params 需要进行拼接的参数集合
     * @return 拼接后的参数集合
     */
    private String concatParameter(Map<String, Object> params) {
        List<String> keys = new ArrayList<>(params.keySet());
        Collections.sort(keys);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = (String) params.get(key);
            sb.append(key).append("=").append(value);
            if (i != keys.size() - 1) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Long getPtime() {
        return ptime;
    }

    public void setPtime(Long ptime) {
        this.ptime = ptime;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "PLVodBaseRequest{" +
                "userId='" + userId + '\'' +
                ", secretKey='" + secretKey + '\'' +
                ", ptime=" + ptime +
                ", sign='" + sign + '\'' +
                '}';
    }
}
