package com.cnj.rest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restapi")
public class RestApi {
    @Id
    @Column(name="id")
//	@GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue    
    private  long id;
    @Column(name="apiname")
    private String apiname;
    @Column(name="content")
    private  String content;

    public RestApi(){
        super();
    }
    public RestApi(long id, String apiname , String content) {
        super();
        this.id = id;
        this.apiname = apiname;
        this.content = content;
    } 

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getApiName(){
        return apiname;
    }
}
