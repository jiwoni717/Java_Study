package com.sist.io2;
/*
 		<table class = "list-wrap">
 		 -----태그명	   -----------구분자
  		 <tr>
  		  <td class = "info">
  		   <a class = "cover><img src = ""></a>
  		  </td>
  		  <td class = "info">
  		   <a class = "title aaa">노래명</a>
  		  </td>
  		 </tr>
  		</table>
 */
import java.io.Serializable;

public class GenieMusicVO implements Serializable{
	private int no;
	private String title;
	private String singer;
	private String album;
	private String poster;
	private int idcreament; // 등폭
	private String state;
	private int cno; // 구분자
	private String key; // 동영상
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getIdcreament() {
		return idcreament;
	}
	public void setIdcreament(int idcreament) {
		this.idcreament = idcreament;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
