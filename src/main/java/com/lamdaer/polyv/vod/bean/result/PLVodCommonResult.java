package com.lamdaer.polyv.vod.bean.result;

/**
 * 响应结果公共类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public class PLVodCommonResult extends PLVodBaseResult {

    /**
     * <pre>
     * 字段名：请求返回的数据
     * 变量名：data
     * 是否必填：是
     * </pre>
     */
    private Object data;

    public PLVodCommonResult(int code, String status, String message, Object data) {
        this.data = data;
        super.code = code;
        super.status = status;
        super.message = message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PLVodCommonResult{" +
                "data=" + data +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
