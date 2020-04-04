package com.toolv.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
	private static final long serialVersionUID = 7844167344669441953L;

	private Long id;
	private String serial;
}
