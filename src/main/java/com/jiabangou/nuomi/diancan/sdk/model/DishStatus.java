package com.jiabangou.nuomi.diancan.sdk.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * 菜品状态
 * Created by freeway on 16/9/8.
 */
public class DishStatus implements Serializable {

    @JSONField(name = "shop_id")
    private String tpShopId;
    @JSONField(name = "dish_code")
    private String id;
    @JSONField(name = "online_state")
    private int onlineState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(int onlineState) {
        this.onlineState = onlineState;
    }

    public String getTpShopId() {
        return tpShopId;
    }

    public void setTpShopId(String tpShopId) {
        this.tpShopId = tpShopId;
    }

    @Override
    public String toString() {
        return "DishStatus{" +
                "tpShopId='" + tpShopId + '\'' +
                ", id='" + id + '\'' +
                ", onlineState=" + onlineState +
                '}';
    }
}
