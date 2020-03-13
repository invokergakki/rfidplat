package com.iking.consumer.util;
import com.google.gson.*;

import java.util.*;

/**
 * Copyright (C), 2011-2018 {company}
 * FileName: com.mina.utils.JsonToMap.java
 * Author: xxx
 * Email: xxx
 * Date: 2018/6/15 22:36
 * Description: 使用Gson把json字符串转成Map
 * History:
 * <Author>      <Time>    <version>    <desc>
 * {xxx}   22:36    1.0          Create
 */
public class MapUtil {

    /**
     * 将Map转成json
     * @param map
     * @return
     */
    public static String mapToJson(Map<String, Object> map){
        Gson gson = new Gson();
        return gson.toJson(map, Map.class);
    }

    /**
     * 依据json字符串返回Map对象
     * @param json
     * @return
     */
    public static Map<String,Object> toMap(String json){
        Gson gson = new Gson();
        return MapUtil.toMap(MapUtil.parseJson(json));
    }

    /**
     * 获取JsonObject
     * @param json
     * @return
     */
    public static JsonObject parseJson(String json){
        JsonParser parser = new JsonParser();
        JsonObject jsonObj = parser.parse(json).getAsJsonObject();
        return jsonObj;
    }

    /**
     * 将JSONObjec对象转换成Map-List集合
     * @param json
     * @return
     */
    public static Map<String, Object> toMap(JsonObject json){
        Map<String, Object> map = new HashMap<String, Object>();
        Set<Map.Entry<String, JsonElement>> entrySet = json.entrySet();
        for (Iterator<Map.Entry<String, JsonElement>> iter = entrySet.iterator(); iter.hasNext(); ){
            Map.Entry<String, JsonElement> entry = iter.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            if(value instanceof JsonArray)
                map.put((String) key, toList((JsonArray) value));
            else if(value instanceof JsonObject)
                map.put((String) key, toMap((JsonObject) value));
            else
                map.put((String) key, value);
        }
        return map;
    }

    /**
     * 将JSONArray对象转换成List集合
     * @param json
     * @return
     */
    public static List<Object> toList(JsonArray json){
        List<Object> list = new ArrayList<Object>();
        for (int i=0; i<json.size(); i++){
            Object value = json.get(i);
            if(value instanceof JsonArray){
                list.add(toList((JsonArray) value));
            }
            else if(value instanceof JsonObject){
                list.add(toMap((JsonObject) value));
            }
            else{
                list.add(value);
            }
        }
        return list;
    }
}
