package com.isea533.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`user login info`")
public class UserLoginInfo {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ��¼��
     */
    @Id
    private String username;

    /**
     * ��¼ʱ��
     */
    private Date logindate;

    /**
     * ��¼IP
     */
    private String loginip;

    /**
     * @return Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ��¼��
     *
     * @return username - ��¼��
     */
    public String getUsername() {
        return username;
    }

    /**
     * ���õ�¼��
     *
     * @param username ��¼��
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ��¼ʱ��
     *
     * @return logindate - ��¼ʱ��
     */
    public Date getLogindate() {
        return logindate;
    }

    /**
     * ���õ�¼ʱ��
     *
     * @param logindate ��¼ʱ��
     */
    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    /**
     * ��ȡ��¼IP
     *
     * @return loginip - ��¼IP
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * ���õ�¼IP
     *
     * @param loginip ��¼IP
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }
}