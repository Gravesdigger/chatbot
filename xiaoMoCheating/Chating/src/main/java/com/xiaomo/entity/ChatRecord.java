package com.xiaomo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 聊天记录实体
 * @author Jason
 *
 */
@Entity
@Table(name="chat_record")
public class ChatRecord {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length=200)
	private String add_time;
	
	@Column(length=300)
	private String answer;
	
	private boolean is_bot;
	
	private boolean is_reply;
	
	@Column(length=300)
	private String question;
	
	@Column(length=200)
	private String service_id;
	
	@Column(length=200)
	private String service_name;
	
	@Column(length=200)
	private Integer user_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdd_time() {
		return add_time;
	}

	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isIs_bot() {
		return is_bot;
	}

	public void setIs_bot(boolean is_bot) {
		this.is_bot = is_bot;
	}

	public boolean isIs_reply() {
		return is_reply;
	}

	public void setIs_reply(boolean is_reply) {
		this.is_reply = is_reply;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getService_id() {
		return service_id;
	}

	public void setService_id(String service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "ChatRecord [id=" + id + ", add_time=" + add_time + ", answer=" + answer + ", is_bot=" + is_bot
				+ ", is_reply=" + is_reply + ", question=" + question + ", service_id=" + service_id + ", service_name="
				+ service_name + ", user_id=" + user_id + "]";
	}
	
}
