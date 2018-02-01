package com.changyou.manager.hr.person_train_contract.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HR_PERSON_TRAIN_CONTRACT")
public class HrPersonTrainContract {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "EMP_CODE")
    private String empCode;

    @Column(name = "TRAIN_PROJECT")
    private String trainProject;

    @Column(name = "TRAIN_MONEY")
    private BigDecimal trainMoney;

    @Column(name = "SERVE_START")
    private Date serveStart;

    @Column(name = "SERVE_END")
    private Date serveEnd;

    @Column(name = "UPDATER_CODE")
    private String updaterCode;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

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
     * @return TRAIN_PROJECT
     */
    public String getTrainProject() {
        return trainProject;
    }

    /**
     * @param trainProject
     */
    public void setTrainProject(String trainProject) {
        this.trainProject = trainProject;
    }

    /**
     * @return TRAIN_MONEY
     */
    public BigDecimal getTrainMoney() {
        return trainMoney;
    }

    /**
     * @param trainMoney
     */
    public void setTrainMoney(BigDecimal trainMoney) {
        this.trainMoney = trainMoney;
    }

    /**
     * @return SERVE_START
     */
    public Date getServeStart() {
        return serveStart;
    }

    /**
     * @param serveStart
     */
    public void setServeStart(Date serveStart) {
        this.serveStart = serveStart;
    }

    /**
     * @return SERVE_END
     */
    public Date getServeEnd() {
        return serveEnd;
    }

    /**
     * @param serveEnd
     */
    public void setServeEnd(Date serveEnd) {
        this.serveEnd = serveEnd;
    }

    /**
     * @return UPDATER_CODE
     */
    public String getUpdaterCode() {
        return updaterCode;
    }

    /**
     * @param updaterCode
     */
    public void setUpdaterCode(String updaterCode) {
        this.updaterCode = updaterCode;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}