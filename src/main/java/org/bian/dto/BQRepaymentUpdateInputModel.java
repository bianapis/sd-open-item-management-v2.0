package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentUpdateInputModel
 */
public class BQRepaymentUpdateInputModel   {
  private String openItemProcedureInstanceReference = null;

  private String repaymentInstanceReference = null;

  private Object repaymentUpdateActionTaskRecord = null;

  private String repaymentUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return repaymentUpdateActionTaskRecord
  **/

  public Object getRepaymentUpdateActionTaskRecord() {
    return repaymentUpdateActionTaskRecord;
  }

  public void setRepaymentUpdateActionTaskRecord(Object repaymentUpdateActionTaskRecord) {
    this.repaymentUpdateActionTaskRecord = repaymentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return repaymentUpdateActionRequest
  **/

  public String getRepaymentUpdateActionRequest() {
    return repaymentUpdateActionRequest;
  }

  public void setRepaymentUpdateActionRequest(String repaymentUpdateActionRequest) {
    this.repaymentUpdateActionRequest = repaymentUpdateActionRequest;
  }


}

