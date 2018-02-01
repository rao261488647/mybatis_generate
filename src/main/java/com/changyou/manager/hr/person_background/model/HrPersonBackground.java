package com.changyou.manager.hr.person_background.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "HR_PERSON_BACKGROUND")
public class HrPersonBackground {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "EMP_CODE")
    private String empCode;

    @Column(name = "BACKGROUND_FILE_ID")
    private String backgroundFileId;

    @Column(name = "BACKGROUND_FILE_NAME")
    private String backgroundFileName;

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
     * @return EMP_CODE
     */
    public String getEmpCode() {
        return empCode;
    }

    /**
     * @param empCode
     */
    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    /**
     * @return BACKGROUND_FILE_ID
     */
    public String getBackgroundFileId() {
        return backgroundFileId;
    }

    /**
     * @param backgroundFileId
     */
    public void setBackgroundFileId(String backgroundFileId) {
        this.backgroundFileId = backgroundFileId;
    }

    /**
     * @return BACKGROUND_FILE_NAME
     */
    public String getBackgroundFileName() {
        return backgroundFileName;
    }

    /**
     * @param backgroundFileName
     */
    public void setBackgroundFileName(String backgroundFileName) {
        this.backgroundFileName = backgroundFileName;
    }
}