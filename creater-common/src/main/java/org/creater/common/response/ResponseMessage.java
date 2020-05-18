package org.creater.common.response;

public class ResponseMessage {
	
	public static ResponseMessage success() {
		ResponseMessage rm = new ResponseMessage();
		rm.setCode(0);
		rm.setMsg("请求成功");
		return rm;
	}
	
	public static ResponseMessage success(Object data) {
		ResponseMessage rm = new ResponseMessage();
		rm.setCode(0);
		rm.setMsg("请求成功");
		rm.setData(data);
		return rm;
	}
	
	public static ResponseMessage fail() {
		ResponseMessage rm = new ResponseMessage();
		rm.setCode(100);
		rm.setMsg("请求失败");
		return rm;
	}
	
	public static ResponseMessage fail(Object data) {
		ResponseMessage rm = new ResponseMessage();
		rm.setCode(100);
		rm.setMsg("请求失败");
		rm.setData(data);
		return rm;
	}
	

	private int code;
	private String msg;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
