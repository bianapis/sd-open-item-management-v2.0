package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentInitiateOutputModel
 */
public class BQRepaymentInitiateOutputModel   {
  private String repaymentInstanceReference = null;

  private String repaymentInitiateActionReference = null;

  private Object repaymentInitiateActionRecord = null;

  private String repaymentInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return repaymentInitiateActionReference
  **/

  public String getRepaymentInitiateActionReference() {
    return repaymentInitiateActionReference;
  }

  public void setRepaymentInitiateActionReference(String repaymentInitiateActionReference) {
    this.repaymentInitiateActionReference = repaymentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return repaymentInitiateActionRecord
  **/

  public Object getRepaymentInitiateActionRecord() {
    return repaymentInitiateActionRecord;
  }

  public void setRepaymentInitiateActionRecord(Object repaymentInitiateActionRecord) {
    this.repaymentInitiateActionRecord = repaymentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Repayment instance (e.g. initialised, pending, active) 
   * @return repaymentInstanceStatus
  **/

  public String getRepaymentInstanceStatus() {
    return repaymentInstanceStatus;
  }

  public void setRepaymentInstanceStatus(String repaymentInstanceStatus) {
    this.repaymentInstanceStatus = repaymentInstanceStatus;
  }


}

