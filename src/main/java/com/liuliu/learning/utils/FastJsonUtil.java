package com.liuliu.learning.utils;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonUtil {

	private static final SerializeConfig config;

	static {
		config = new SerializeConfig();
		config.put(java.util.Date.class, new JSONLibDataFormatSerializer());
		config.put(java.sql.Date.class, new JSONLibDataFormatSerializer());
	}

	private static final SerializerFeature[] features = {
			SerializerFeature.WriteMapNullValue,
			SerializerFeature.WriteNullListAsEmpty, 
			SerializerFeature.WriteNullNumberAsZero,
			SerializerFeature.WriteNullBooleanAsFalse, 
			SerializerFeature.WriteNullStringAsEmpty
			//SerializerFeature.DisableCircularReferenceDetect 
	};

	public static String toJSONString(Object object) {
		return JSON.toJSONString(object, config, features);
	}

	public static String toJSONNoFeatures(Object object) {
		return JSON.toJSONString(object, config);
	}

	public static Object toBean(String text) {
		return JSON.parse(text);
	}

	public static <T> T toBean(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

	public static <T> Object[] toArray(String text) {
		return toArray(text, null);
	}

	public static <T> Object[] toArray(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz).toArray();
	}

	public static <T> List<T> toList(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz);
	}

	public static Object textToJson(String text) {
		Object objectJson = JSON.parse(text);
		return objectJson;
	}

	public static Map<?, ?> stringToCollect(String s) {
		Map<?, ?> m = JSONObject.parseObject(s);
		return m;
	}

	public static String collectToString(Map m) {
		String s = JSONObject.toJSONString(m);
		return s;
	}

	public static String objectToJson(Object obj) {
		return JSON.toJSONString(obj);
	}
}
