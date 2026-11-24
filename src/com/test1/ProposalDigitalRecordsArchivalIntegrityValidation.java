package com.test1;

public class ProposalDigitalRecordsArchivalIntegrityValidation {
	private long integrityValidationId;
	private long archivalExecutionId;
	private long archivalConfigurationId;
	private long proposalId;
	private String recordId;
	private String recordName;
	private String sourceRepository;
	private String archiveRepository;
	private long sourceRecordSize;
	private long archivedRecordSize;
	private String checksumAlgorithm;
	private String sourceChecksum;
	private String archivedChecksum;
	private String checksumMatchStatus;
	private String metadataValidationStatus;
	private String contentValidationStatus;
	private String versionHistoryValidationStatus;
	private String encryptionValidationStatus;

	public ProposalDigitalRecordsArchivalIntegrityValidation() {

	}

	public ProposalDigitalRecordsArchivalIntegrityValidation(long integrityValidationId, long archivalExecutionId,
			long archivalConfigurationId, long proposalId, String recordId, String recordName, String sourceRepository,
			String archiveRepository, long sourceRecordSize, long archivedRecordSize, String checksumAlgorithm,
			String sourceChecksum, String archivedChecksum, String checksumMatchStatus, String metadataValidationStatus,
			String contentValidationStatus, String versionHistoryValidationStatus, String encryptionValidationStatus) {
		super();
		this.integrityValidationId = integrityValidationId;
		this.archivalExecutionId = archivalExecutionId;
		this.archivalConfigurationId = archivalConfigurationId;
		this.proposalId = proposalId;
		this.recordId = recordId;
		this.recordName = recordName;
		this.sourceRepository = sourceRepository;
		this.archiveRepository = archiveRepository;
		this.sourceRecordSize = sourceRecordSize;
		this.archivedRecordSize = archivedRecordSize;
		this.checksumAlgorithm = checksumAlgorithm;
		this.sourceChecksum = sourceChecksum;
		this.archivedChecksum = archivedChecksum;
		this.checksumMatchStatus = checksumMatchStatus;
		this.metadataValidationStatus = metadataValidationStatus;
		this.contentValidationStatus = contentValidationStatus;
		this.versionHistoryValidationStatus = versionHistoryValidationStatus;
		this.encryptionValidationStatus = encryptionValidationStatus;
	}

	public long getIntegrityValidationId() {
		return integrityValidationId;
	}

	public void setIntegrityValidationId(long integrityValidationId) {
		this.integrityValidationId = integrityValidationId;
	}

	public long getArchivalExecutionId() {
		return archivalExecutionId;
	}

	public void setArchivalExecutionId(long archivalExecutionId) {
		this.archivalExecutionId = archivalExecutionId;
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

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public String getSourceRepository() {
		return sourceRepository;
	}

	public void setSourceRepository(String sourceRepository) {
		this.sourceRepository = sourceRepository;
	}

	public String getArchiveRepository() {
		return archiveRepository;
	}

	public void setArchiveRepository(String archiveRepository) {
		this.archiveRepository = archiveRepository;
	}

	public long getSourceRecordSize() {
		return sourceRecordSize;
	}

	public void setSourceRecordSize(long sourceRecordSize) {
		this.sourceRecordSize = sourceRecordSize;
	}

	public long getArchivedRecordSize() {
		return archivedRecordSize;
	}

	public void setArchivedRecordSize(long archivedRecordSize) {
		this.archivedRecordSize = archivedRecordSize;
	}

	public String getChecksumAlgorithm() {
		return checksumAlgorithm;
	}

	public void setChecksumAlgorithm(String checksumAlgorithm) {
		this.checksumAlgorithm = checksumAlgorithm;
	}

	public String getSourceChecksum() {
		return sourceChecksum;
	}

	public void setSourceChecksum(String sourceChecksum) {
		this.sourceChecksum = sourceChecksum;
	}

	public String getArchivedChecksum() {
		return archivedChecksum;
	}

	public void setArchivedChecksum(String archivedChecksum) {
		this.archivedChecksum = archivedChecksum;
	}

	public String getChecksumMatchStatus() {
		return checksumMatchStatus;
	}

	public void setChecksumMatchStatus(String checksumMatchStatus) {
		this.checksumMatchStatus = checksumMatchStatus;
	}

	public String getMetadataValidationStatus() {
		return metadataValidationStatus;
	}

	public void setMetadataValidationStatus(String metadataValidationStatus) {
		this.metadataValidationStatus = metadataValidationStatus;
	}

	public String getContentValidationStatus() {
		return contentValidationStatus;
	}

	public void setContentValidationStatus(String contentValidationStatus) {
		this.contentValidationStatus = contentValidationStatus;
	}

	public String getVersionHistoryValidationStatus() {
		return versionHistoryValidationStatus;
	}

	public void setVersionHistoryValidationStatus(String versionHistoryValidationStatus) {
		this.versionHistoryValidationStatus = versionHistoryValidationStatus;
	}

	public String getEncryptionValidationStatus() {
		return encryptionValidationStatus;
	}

	public void setEncryptionValidationStatus(String encryptionValidationStatus) {
		this.encryptionValidationStatus = encryptionValidationStatus;
	}

}
