package com.ls.demo;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisAnalyze {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.err.println("连接成功");
		System.err.println(jedis.ping());
		//jedis.set("hello", "Heoop");
		System.err.println(jedis.get("hello"));
		jedis.lpush("site-list", "Runoob");
		jedis.lpush("site-list", "Google");
		jedis.lpush("site-list", "Taobao");
		List<String> list = jedis.lrange("site-list", 0, 2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("列表项为: " + list.get(i));
		}
	}
}
