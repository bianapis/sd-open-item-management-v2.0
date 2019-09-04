package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentExecuteOutputModel
 */
public class BQRepaymentExecuteOutputModel   {
  private String repaymentExecuteActionTaskReference = null;

  private Object repaymentExecuteActionTaskRecord = null;

  private String repaymentExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Repayment instance execute service call 
   * @return repaymentExecuteActionTaskReference
  **/

  public String getRepaymentExecuteActionTaskReference() {
    return repaymentExecuteActionTaskReference;
  }

  public void setRepaymentExecuteActionTaskReference(String repaymentExecuteActionTaskReference) {
    this.repaymentExecuteActionTaskReference = repaymentExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Repayment execute transaction/record 
   * @return repaymentExecuteRecordReference
  **/

  public String getRepaymentExecuteRecordReference() {
    return repaymentExecuteRecordReference;
  }

  public void setRepaymentExecuteRecordReference(String repaymentExecuteRecordReference) {
    this.repaymentExecuteRecordReference = repaymentExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

