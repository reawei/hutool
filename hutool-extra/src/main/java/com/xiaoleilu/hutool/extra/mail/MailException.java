package com.xiaoleilu.hutool.extra.mail;

import com.xiaoleilu.hutool.exceptions.ExceptionUtil;
import com.xiaoleilu.hutool.util.StrUtil;

/**
 * 邮件异常
 * @author xiaoleilu
 */
public class MailException extends RuntimeException{
	private static final long serialVersionUID = 8247610319171014183L;

	public MailException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}
	
	public MailException(String message) {
		super(message);
	}
	
	public MailException(String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params));
	}
	
	public MailException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	public MailException(Throwable throwable, String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params), throwable);
	}
}
