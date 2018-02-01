package com.isea533.mybatis.model;

import javax.persistence.*;

public class Country {
    /**
     * ����
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ����
     */
    private String countryname;

    /**
     * ����
     */
    private String countrycode;

    /**
     * ��ȡ����
     *
     * @return Id - ����
     */
    public Integer getId() {
        return id;
    }

    /**
     * ��������
     *
     * @param id ����
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ����
     *
     * @return countryname - ����
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * ��������
     *
     * @param countryname ����
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * ��ȡ����
     *
     * @return countrycode - ����
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * ���ô���
     *
     * @param countrycode ����
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}