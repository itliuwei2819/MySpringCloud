package com.toolv.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前端JSON格式响应封装
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
	private Integer code;
	private String message;
	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}
}
