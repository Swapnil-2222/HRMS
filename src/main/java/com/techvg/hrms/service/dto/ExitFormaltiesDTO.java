package com.techvg.hrms.service.dto;

import com.techvg.hrms.domain.enumeration.AnswersOptions;
import com.techvg.hrms.domain.enumeration.Status;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the {@link com.techvg.hrms.domain.ExitFormalties} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ExitFormaltiesDTO implements Serializable {

    private Long id;

    private AnswersOptions security;

    private String feedback;

    private Instant exitDate;

    private AnswersOptions exitInterview;

    private AnswersOptions libNoDue;

    private AnswersOptions noticePeriodServed;

    private AnswersOptions clearence;

    private AnswersOptions orgAssets;

    private AnswersOptions orgVehical;

    private AnswersOptions resignLetter;

    private String shares;

    private String staffWelfare;

    private AnswersOptions workForOrg;

    private Status status;

    private Instant lastModified;

    private String lastModifiedBy;

    private String createdBy;

    private Instant createdOn;

    private Boolean isDeleted;

    private String freeField1;

    private String freeField2;

    private String freeField3;

    private String freefield4;

    private String freefield5;

    private EmployeeDTO employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AnswersOptions getSecurity() {
        return security;
    }

    public void setSecurity(AnswersOptions security) {
        this.security = security;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Instant getExitDate() {
        return exitDate;
    }

    public void setExitDate(Instant exitDate) {
        this.exitDate = exitDate;
    }

    public AnswersOptions getExitInterview() {
        return exitInterview;
    }

    public void setExitInterview(AnswersOptions exitInterview) {
        this.exitInterview = exitInterview;
    }

    public AnswersOptions getLibNoDue() {
        return libNoDue;
    }

    public void setLibNoDue(AnswersOptions libNoDue) {
        this.libNoDue = libNoDue;
    }

    public AnswersOptions getNoticePeriodServed() {
        return noticePeriodServed;
    }

    public void setNoticePeriodServed(AnswersOptions noticePeriodServed) {
        this.noticePeriodServed = noticePeriodServed;
    }

    public AnswersOptions getClearence() {
        return clearence;
    }

    public void setClearence(AnswersOptions clearence) {
        this.clearence = clearence;
    }

    public AnswersOptions getOrgAssets() {
        return orgAssets;
    }

    public void setOrgAssets(AnswersOptions orgAssets) {
        this.orgAssets = orgAssets;
    }

    public AnswersOptions getOrgVehical() {
        return orgVehical;
    }

    public void setOrgVehical(AnswersOptions orgVehical) {
        this.orgVehical = orgVehical;
    }

    public AnswersOptions getResignLetter() {
        return resignLetter;
    }

    public void setResignLetter(AnswersOptions resignLetter) {
        this.resignLetter = resignLetter;
    }

    public String getShares() {
        return shares;
    }

    public void setShares(String shares) {
        this.shares = shares;
    }

    public String getStaffWelfare() {
        return staffWelfare;
    }

    public void setStaffWelfare(String staffWelfare) {
        this.staffWelfare = staffWelfare;
    }

    public AnswersOptions getWorkForOrg() {
        return workForOrg;
    }

    public void setWorkForOrg(AnswersOptions workForOrg) {
        this.workForOrg = workForOrg;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getFreeField1() {
        return freeField1;
    }

    public void setFreeField1(String freeField1) {
        this.freeField1 = freeField1;
    }

    public String getFreeField2() {
        return freeField2;
    }

    public void setFreeField2(String freeField2) {
        this.freeField2 = freeField2;
    }

    public String getFreeField3() {
        return freeField3;
    }

    public void setFreeField3(String freeField3) {
        this.freeField3 = freeField3;
    }

    public String getFreefield4() {
        return freefield4;
    }

    public void setFreefield4(String freefield4) {
        this.freefield4 = freefield4;
    }

    public String getFreefield5() {
        return freefield5;
    }

    public void setFreefield5(String freefield5) {
        this.freefield5 = freefield5;
    }

    public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExitFormaltiesDTO)) {
            return false;
        }

        ExitFormaltiesDTO exitFormaltiesDTO = (ExitFormaltiesDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, exitFormaltiesDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ExitFormaltiesDTO{" +
            "id=" + getId() +
            ", security='" + getSecurity() + "'" +
            ", feedback='" + getFeedback() + "'" +
            ", exitDate='" + getExitDate() + "'" +
            ", exitInterview='" + getExitInterview() + "'" +
            ", libNoDue='" + getLibNoDue() + "'" +
            ", noticePeriodServed='" + getNoticePeriodServed() + "'" +
            ", clearence='" + getClearence() + "'" +
            ", orgAssets='" + getOrgAssets() + "'" +
            ", orgVehical='" + getOrgVehical() + "'" +
            ", resignLetter='" + getResignLetter() + "'" +
            ", shares='" + getShares() + "'" +
            ", staffWelfare='" + getStaffWelfare() + "'" +
            ", workForOrg='" + getWorkForOrg() + "'" +
            ", status='" + getStatus() + "'" +
            ", lastModified='" + getLastModified() + "'" +
            ", lastModifiedBy='" + getLastModifiedBy() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdOn='" + getCreatedOn() + "'" +
            ", isDeleted='" + getIsDeleted() + "'" +
            ", freeField1='" + getFreeField1() + "'" +
            ", freeField2='" + getFreeField2() + "'" +
            ", freeField3='" + getFreeField3() + "'" +
            ", freefield4='" + getFreefield4() + "'" +
            ", freefield5='" + getFreefield5() + "'" +
            ", employee=" + getEmployee() +
            "}";
    }
}
