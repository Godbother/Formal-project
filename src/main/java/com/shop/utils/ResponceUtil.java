package com.shop.utils;

import com.shop.pojo.entity.BaseResponce;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponceUtil {
	public static <T> BaseResponce successResponce(T data){
		BaseResponce baseResponse = new BaseResponce();
        baseResponse.setCode(1);
        baseResponse.setMsg("success!");
        if(data instanceof List) {
            Map<String,Object> listMap = new HashMap<String,Object>();
            listMap.put("list",data);
            baseResponse.setData(listMap);
        }else{
            baseResponse.setData(data);
        }
        return baseResponse;
	}
	
	public static <T> BaseResponce failResponce(String msg){
		BaseResponce baseResponse = new BaseResponce();
        baseResponse.setCode(0);
        baseResponse.setMsg(msg);
        return baseResponse;
	}
}
