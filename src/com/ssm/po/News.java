package com.ssm.po;
import java.util.Date;
import java.util.Objects;

public class News {
	private Integer newsId;
	private String title;
	private String contentTitle;
	private String content;
	private String contentAbstract;
	private String keywords;
	private String author;
	private Date publishTime;
	private Integer clicks;
	private String publishStatus;
	private Integer categoryId;
	//为了方便新闻列表页显示，特意添加categoryName属性
	private String categoryName;
	private Integer userId;
	public Integer getNewsId() {
		return newsId;
	}
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContentAbstract() {
		return contentAbstract;
	}
	public void setContentAbstract(String contentAbstract) {
		this.contentAbstract = contentAbstract;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public Integer getClicks() {
		return clicks;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	public String getPublishStatus() {
		return publishStatus;
	}
	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", contentTitle=" + contentTitle + ", content=" + content
				+ ", contentAbstract=" + contentAbstract + ", keywords=" + keywords + ", author=" + author
				+ ", publishTime=" + publishTime + ", clicks=" + clicks + ", publishStatus=" + publishStatus
				+ ", categoryId=" + categoryId + ", categoryName=" + categoryName + ", userId=" + userId + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		News news = (News) o;
		return Objects.equals(newsId, news.newsId) &&
				Objects.equals(title, news.title) &&
				Objects.equals(contentTitle, news.contentTitle) &&
				Objects.equals(content, news.content) &&
				Objects.equals(contentAbstract, news.contentAbstract) &&
				Objects.equals(keywords, news.keywords) &&
				Objects.equals(author, news.author) &&
				Objects.equals(publishTime, news.publishTime) &&
				Objects.equals(clicks, news.clicks) &&
				Objects.equals(publishStatus, news.publishStatus) &&
				Objects.equals(categoryId, news.categoryId) &&
				Objects.equals(categoryName, news.categoryName) &&
				Objects.equals(userId, news.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(newsId, title, contentTitle, content, contentAbstract, keywords, author, publishTime, clicks, publishStatus, categoryId, categoryName, userId);
	}
}
