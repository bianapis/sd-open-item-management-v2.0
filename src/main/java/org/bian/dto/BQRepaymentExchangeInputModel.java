package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentExchangeInputModelRepaymentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQRepaymentExchangeInputModel
 */
public class BQRepaymentExchangeInputModel   {
  private String openItemProcedureInstanceReference = null;

  private String repaymentInstanceReference = null;

  private Object repaymentExchangeActionTaskRecord = null;

  private BQRepaymentExchangeInputModelRepaymentExchangeActionRequest repaymentExchangeActionRequest = null;


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
   * Get repaymentExchangeActionRequest
   * @return repaymentExchangeActionRequest
  **/

  public BQRepaymentExchangeInputModelRepaymentExchangeActionRequest getRepaymentExchangeActionRequest() {
    return repaymentExchangeActionRequest;
  }

  public void setRepaymentExchangeActionRequest(BQRepaymentExchangeInputModelRepaymentExchangeActionRequest repaymentExchangeActionRequest) {
    this.repaymentExchangeActionRequest = repaymentExchangeActionRequest;
  }


}

