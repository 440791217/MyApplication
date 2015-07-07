package com.example.model.json;

import java.util.HashMap;

/**
 * Created by mark on 2015/7/6.for MyApplication
 */
public class TuLingQuery {

	int code;
	String text;
	HashMap<String,String> map;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
}
