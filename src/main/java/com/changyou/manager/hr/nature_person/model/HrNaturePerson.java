package com.changyou.manager.hr.nature_person.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HR_NATURE_PERSON")
public class HrNaturePerson {
    @Id
    @Column(name = "NATURE_PERSON_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal naturePersonId;

    @Column(name = "ID_TYPE")
    private String idType;

    @Column(name = "ID_CARD_NO")
    private String idCardNo;

    @Column(name = "EMP_NAME")
    private Object empName;

    @Column(name = "PERSON_NAME_SPELL")
    private String personNameSpell;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "UPDATER_CODE")
    private String updaterCode;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @Column(name = "DELETED")
    private BigDecimal deleted;

    /**
     * @return NATURE_PERSON_ID
     */
    public BigDecimal getNaturePersonId() {
        return naturePersonId;
    }

    /**
     * @param naturePersonId
     */
    public void setNaturePersonId(BigDecimal naturePersonId) {
        this.naturePersonId = naturePersonId;
    }

    /**
     * @return ID_TYPE
     */
    public String getIdType() {
        return idType;
    }

    /**
     * @param idType
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * @return ID_CARD_NO
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * @param idCardNo
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    /**
     * @return EMP_NAME
     */
    public Object getEmpName() {
        return empName;
    }

    /**
     * @param empName
     */
    public void setEmpName(Object empName) {
        this.empName = empName;
    }

    /**
     * @return PERSON_NAME_SPELL
     */
    public String getPersonNameSpell() {
        return personNameSpell;
    }

    /**
     * @param personNameSpell
     */
    public void setPersonNameSpell(String personNameSpell) {
        this.personNameSpell = personNameSpell;
    }

    /**
     * @return GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return BIRTHDAY
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return UPDATE_DATE
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return DELETED
     */
    public BigDecimal getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(BigDecimal deleted) {
        this.deleted = deleted;
    }
}