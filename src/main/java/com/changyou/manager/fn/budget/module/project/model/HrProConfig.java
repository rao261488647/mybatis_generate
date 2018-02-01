package com.changyou.manager.fn.budget.module.project.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "HR_PRO_CONFIG")
public class HrProConfig {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "PRECODE")
    private String precode;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "NAME")
    private String name;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return PRECODE
     */
    public String getPrecode() {
        return precode;
    }

    /**
     * @param precode
     */
    public void setPrecode(String precode) {
        this.precode = precode;
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}