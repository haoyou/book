package com.chy.bookmaster.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**
 * 网站配置的实体
 */
@Entity
@Table(name = "t_config")
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50)
    private String webname;

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname;
    }
}
