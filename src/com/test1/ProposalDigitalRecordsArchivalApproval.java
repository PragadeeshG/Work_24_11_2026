package com.test1;

public class ProposalDigitalRecordsArchivalApproval {
	private long archivalApprovalId;
	private long archivalConfigurationId;
	private long proposalId;
	private String proposalName;
	private String approvalRequestId;
	private String approvalWorkflowId;
	private String approvalType;
	private String approvalLevel;
	private String requestedBy;
	private String assignedApprover;
	private String approverRole;
	private String businessUnit;
	private long recordsPendingApproval;
	private String archivalJustification;
	private String complianceReviewRequired;
	private String complianceReviewStatus;
	private String approvalRequestedTime;
	private String approvalDueDate;

	public ProposalDigitalRecordsArchivalApproval() {

	}

	public ProposalDigitalRecordsArchivalApproval(long archivalApprovalId, long archivalConfigurationId,
			long proposalId, String proposalName, String approvalRequestId, String approvalWorkflowId,
			String approvalType, String approvalLevel, String requestedBy, String assignedApprover, String approverRole,
			String businessUnit, long recordsPendingApproval, String archivalJustification,
			String complianceReviewRequired, String complianceReviewStatus, String approvalRequestedTime,
			String approvalDueDate) {
		super();
		this.archivalApprovalId = archivalApprovalId;
		this.archivalConfigurationId = archivalConfigurationId;
		this.proposalId = proposalId;
		this.proposalName = proposalName;
		this.approvalRequestId = approvalRequestId;
		this.approvalWorkflowId = approvalWorkflowId;
		this.approvalType = approvalType;
		this.approvalLevel = approvalLevel;
		this.requestedBy = requestedBy;
		this.assignedApprover = assignedApprover;
		this.approverRole = approverRole;
		this.businessUnit = businessUnit;
		this.recordsPendingApproval = recordsPendingApproval;
		this.archivalJustification = archivalJustification;
		this.complianceReviewRequired = complianceReviewRequired;
		this.complianceReviewStatus = complianceReviewStatus;
		this.approvalRequestedTime = approvalRequestedTime;
		this.approvalDueDate = approvalDueDate;
	}

	public long getArchivalApprovalId() {
		return archivalApprovalId;
	}

	public void setArchivalApprovalId(long archivalApprovalId) {
		this.archivalApprovalId = archivalApprovalId;
	}

	public long getArchivalConfigurationId() {
		return archivalConfigurationId;
	}

	public void setArchivalConfigurationId(long archivalConfigurationId) {
		this.archivalConfigurationId = archivalConfigurationId;
	}

	public long getProposalId() {
		return proposalId;
	}

	public void setProposalId(long proposalId) {
		this.proposalId = proposalId;
	}

	public String getProposalName() {
		return proposalName;
	}

	public void setProposalName(String proposalName) {
		this.proposalName = proposalName;
	}

	public String getApprovalRequestId() {
		return approvalRequestId;
	}

	public void setApprovalRequestId(String approvalRequestId) {
		this.approvalRequestId = approvalRequestId;
	}

	public String getApprovalWorkflowId() {
		return approvalWorkflowId;
	}

	public void setApprovalWorkflowId(String approvalWorkflowId) {
		this.approvalWorkflowId = approvalWorkflowId;
	}

	public String getApprovalType() {
		return approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public String getApprovalLevel() {
		return approvalLevel;
	}

	public void setApprovalLevel(String approvalLevel) {
		this.approvalLevel = approvalLevel;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getAssignedApprover() {
		return assignedApprover;
	}

	public void setAssignedApprover(String assignedApprover) {
		this.assignedApprover = assignedApprover;
	}

	public String getApproverRole() {
		return approverRole;
	}

	public void setApproverRole(String approverRole) {
		this.approverRole = approverRole;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public long getRecordsPendingApproval() {
		return recordsPendingApproval;
	}

	public void setRecordsPendingApproval(long recordsPendingApproval) {
		this.recordsPendingApproval = recordsPendingApproval;
	}

	public String getArchivalJustification() {
		return archivalJustification;
	}

	public void setArchivalJustification(String archivalJustification) {
		this.archivalJustification = archivalJustification;
	}

	public String getComplianceReviewRequired() {
		return complianceReviewRequired;
	}

	public void setComplianceReviewRequired(String complianceReviewRequired) {
		this.complianceReviewRequired = complianceReviewRequired;
	}

	public String getComplianceReviewStatus() {
		return complianceReviewStatus;
	}

	public void setComplianceReviewStatus(String complianceReviewStatus) {
		this.complianceReviewStatus = complianceReviewStatus;
	}

	public String getApprovalRequestedTime() {
		return approvalRequestedTime;
	}

	public void setApprovalRequestedTime(String approvalRequestedTime) {
		this.approvalRequestedTime = approvalRequestedTime;
	}

	public String getApprovalDueDate() {
		return approvalDueDate;
	}

	public void setApprovalDueDate(String approvalDueDate) {
		this.approvalDueDate = approvalDueDate;
	}

}
