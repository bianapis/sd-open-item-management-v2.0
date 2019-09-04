package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQRepaymentExecuteInputModel
 */
public class BQRepaymentExecuteInputModel   {
  private String openItemProcedureInstanceReference = null;

  private String repaymentInstanceReference = null;

  private Object repaymentExecuteActionTaskRecord = null;

  private BQRepaymentExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Open Item Procedure instance 
   * @return openItemProcedureInstanceReference
  **/

  public String getOpenItemProcedureInstanceReference() {
    return openItemProcedureInstanceReference;
  }

  public void setOpenItemProcedureInstanceReference(String openItemProcedureInstanceReference) {
    this.openItemProcedureInstanceReference = openItemProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Repayment instance 
   * @return repaymentInstanceReference
  **/

  public String getRepaymentInstanceReference() {
    return repaymentInstanceReference;
  }

  public void setRepaymentInstanceReference(String repaymentInstanceReference) {
    this.repaymentInstanceReference = repaymentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return repaymentExecuteActionTaskRecord
  **/

  public Object getRepaymentExecuteActionTaskRecord() {
    return repaymentExecuteActionTaskRecord;
  }

  public void setRepaymentExecuteActionTaskRecord(Object repaymentExecuteActionTaskRecord) {
    this.repaymentExecuteActionTaskRecord = repaymentExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQRepaymentExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQRepaymentExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

