package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentExchangeOutputModel
 */
public class BQRepaymentExchangeOutputModel   {
  private String repaymentExchangeActionTaskReference = null;

  private Object repaymentExchangeActionTaskRecord = null;

  private String repaymentExchangeActionResponse = null;

  private String repaymentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Repayment instance exchange service call 
   * @return repaymentExchangeActionTaskReference
  **/

  public String getRepaymentExchangeActionTaskReference() {
    return repaymentExchangeActionTaskReference;
  }

  public void setRepaymentExchangeActionTaskReference(String repaymentExchangeActionTaskReference) {
    this.repaymentExchangeActionTaskReference = repaymentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return repaymentExchangeActionTaskRecord
  **/

  public Object getRepaymentExchangeActionTaskRecord() {
    return repaymentExchangeActionTaskRecord;
  }

  public void setRepaymentExchangeActionTaskRecord(Object repaymentExchangeActionTaskRecord) {
    this.repaymentExchangeActionTaskRecord = repaymentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return repaymentExchangeActionResponse
  **/

  public String getRepaymentExchangeActionResponse() {
    return repaymentExchangeActionResponse;
  }

  public void setRepaymentExchangeActionResponse(String repaymentExchangeActionResponse) {
    this.repaymentExchangeActionResponse = repaymentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Repayment instance (e.g. accepted, rejected, verified) 
   * @return repaymentInstanceStatus
  **/

  public String getRepaymentInstanceStatus() {
    return repaymentInstanceStatus;
  }

  public void setRepaymentInstanceStatus(String repaymentInstanceStatus) {
    this.repaymentInstanceStatus = repaymentInstanceStatus;
  }


}

