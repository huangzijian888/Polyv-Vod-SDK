package com.lamdaer.polyv.vod.service;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;

import java.util.Map;

/**
 * 请求发起抽象类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public abstract class PLVodRequestAbstractService {

    /**
     * get 请求
     *
     * @param url    接口地址
     * @param params 请求参数
     * @return 响应结果
     */
    protected PLVodCommonResult getRequest(String url, Map<String, Object> params) {
        String result = HttpUtil.get(url, params);
        JSON jsonResult = JSONUtil.parse(result);
        int code = (int) jsonResult.getByPath("code");
        String status = (String) jsonResult.getByPath("status");
        String message = (String) jsonResult.getByPath("message");
        if (200 == code) {
            return new PLVodCommonResult(code, status, message, jsonResult.getByPath("data"));
        }
        return new PLVodCommonResult(code, status, message, null);
    }
}
