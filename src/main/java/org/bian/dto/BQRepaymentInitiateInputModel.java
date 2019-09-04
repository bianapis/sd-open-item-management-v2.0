package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentInitiateInputModelCROpenItemProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRepaymentInitiateInputModel
 */
public class BQRepaymentInitiateInputModel   {
  private BQRepaymentInitiateInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord = null;

  private String openItemProcedureInstanceReference = null;

  private Object repaymentInitiateActionRecord = null;


  /**
   * Get cROpenItemProcedureInstanceRecord
   * @return cROpenItemProcedureInstanceRecord
  **/

  public BQRepaymentInitiateInputModelCROpenItemProcedureInstanceRecord getCROpenItemProcedureInstanceRecord() {
    return cROpenItemProcedureInstanceRecord;
  }

  public void setCROpenItemProcedureInstanceRecord(BQRepaymentInitiateInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord) {
    this.cROpenItemProcedureInstanceRecord = cROpenItemProcedureInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return repaymentInitiateActionRecord
  **/

  public Object getRepaymentInitiateActionRecord() {
    return repaymentInitiateActionRecord;
  }

  public void setRepaymentInitiateActionRecord(Object repaymentInitiateActionRecord) {
    this.repaymentInitiateActionRecord = repaymentInitiateActionRecord;
  }


}

