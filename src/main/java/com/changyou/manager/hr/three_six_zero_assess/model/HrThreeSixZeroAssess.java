package com.changyou.manager.hr.three_six_zero_assess.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HR_THREE_SIX_ZERO_ASSESS")
public class HrThreeSixZeroAssess {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "EMP_CODE")
    private String empCode;

    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "POST_CODE")
    private String postCode;

    @Column(name = "ASSESS_DATE")
    private String assessDate;

    @Column(name = "COLLIGATE")
    private BigDecimal colligate;

    @Column(name = "SUPERIOR_ASSESS")
    private BigDecimal superiorAssess;

    @Column(name = "COLLEAGUE_ASSESS")
    private BigDecimal colleagueAssess;

    @Column(name = "HONEST")
    private BigDecimal honest;

    @Column(name = "PASSION")
    private BigDecimal passion;

    @Column(name = "STUDIOUS")
    private BigDecimal studious;

    @Column(name = "OPEN_UP")
    private BigDecimal openUp;

    @Column(name = "COOPERATION")
    private BigDecimal cooperation;

    @Column(name = "USER_ORIENTED")
    private BigDecimal userOriented;

    @Column(name = "ACHIEVEMENT_TALENT")
    private BigDecimal achievementTalent;

    @Column(name = "ACHIEVEMENT")
    private BigDecimal achievement;

    @Column(name = "ASSESS_NUMBERS")
    private BigDecimal assessNumbers;

    @Column(name = "SUBORDINATE_ASSESS")
    private BigDecimal subordinateAssess;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "POST_NAME")
    private String postName;

    @Column(name = "SELF_ASSESSMENT")
    private BigDecimal selfAssessment;

    @Column(name = "CREATE_TIME")
    private Date createTime;

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
     * @return DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * @param deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * @return POST_CODE
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * @param postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * @return ASSESS_DATE
     */
    public String getAssessDate() {
        return assessDate;
    }

    /**
     * @param assessDate
     */
    public void setAssessDate(String assessDate) {
        this.assessDate = assessDate;
    }

    /**
     * @return COLLIGATE
     */
    public BigDecimal getColligate() {
        return colligate;
    }

    /**
     * @param colligate
     */
    public void setColligate(BigDecimal colligate) {
        this.colligate = colligate;
    }

    /**
     * @return SUPERIOR_ASSESS
     */
    public BigDecimal getSuperiorAssess() {
        return superiorAssess;
    }

    /**
     * @param superiorAssess
     */
    public void setSuperiorAssess(BigDecimal superiorAssess) {
        this.superiorAssess = superiorAssess;
    }

    /**
     * @return COLLEAGUE_ASSESS
     */
    public BigDecimal getColleagueAssess() {
        return colleagueAssess;
    }

    /**
     * @param colleagueAssess
     */
    public void setColleagueAssess(BigDecimal colleagueAssess) {
        this.colleagueAssess = colleagueAssess;
    }

    /**
     * @return HONEST
     */
    public BigDecimal getHonest() {
        return honest;
    }

    /**
     * @param honest
     */
    public void setHonest(BigDecimal honest) {
        this.honest = honest;
    }

    /**
     * @return PASSION
     */
    public BigDecimal getPassion() {
        return passion;
    }

    /**
     * @param passion
     */
    public void setPassion(BigDecimal passion) {
        this.passion = passion;
    }

    /**
     * @return STUDIOUS
     */
    public BigDecimal getStudious() {
        return studious;
    }

    /**
     * @param studious
     */
    public void setStudious(BigDecimal studious) {
        this.studious = studious;
    }

    /**
     * @return OPEN_UP
     */
    public BigDecimal getOpenUp() {
        return openUp;
    }

    /**
     * @param openUp
     */
    public void setOpenUp(BigDecimal openUp) {
        this.openUp = openUp;
    }

    /**
     * @return COOPERATION
     */
    public BigDecimal getCooperation() {
        return cooperation;
    }

    /**
     * @param cooperation
     */
    public void setCooperation(BigDecimal cooperation) {
        this.cooperation = cooperation;
    }

    /**
     * @return USER_ORIENTED
     */
    public BigDecimal getUserOriented() {
        return userOriented;
    }

    /**
     * @param userOriented
     */
    public void setUserOriented(BigDecimal userOriented) {
        this.userOriented = userOriented;
    }

    /**
     * @return ACHIEVEMENT_TALENT
     */
    public BigDecimal getAchievementTalent() {
        return achievementTalent;
    }

    /**
     * @param achievementTalent
     */
    public void setAchievementTalent(BigDecimal achievementTalent) {
        this.achievementTalent = achievementTalent;
    }

    /**
     * @return ACHIEVEMENT
     */
    public BigDecimal getAchievement() {
        return achievement;
    }

    /**
     * @param achievement
     */
    public void setAchievement(BigDecimal achievement) {
        this.achievement = achievement;
    }

    /**
     * @return ASSESS_NUMBERS
     */
    public BigDecimal getAssessNumbers() {
        return assessNumbers;
    }

    /**
     * @param assessNumbers
     */
    public void setAssessNumbers(BigDecimal assessNumbers) {
        this.assessNumbers = assessNumbers;
    }

    /**
     * @return SUBORDINATE_ASSESS
     */
    public BigDecimal getSubordinateAssess() {
        return subordinateAssess;
    }

    /**
     * @param subordinateAssess
     */
    public void setSubordinateAssess(BigDecimal subordinateAssess) {
        this.subordinateAssess = subordinateAssess;
    }

    /**
     * @return DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return POST_NAME
     */
    public String getPostName() {
        return postName;
    }

    /**
     * @param postName
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * @return SELF_ASSESSMENT
     */
    public BigDecimal getSelfAssessment() {
        return selfAssessment;
    }

    /**
     * @param selfAssessment
     */
    public void setSelfAssessment(BigDecimal selfAssessment) {
        this.selfAssessment = selfAssessment;
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
}