package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentUpdateOutputModel
 */
public class BQRepaymentUpdateOutputModel   {
  private String repaymentUpdateActionTaskReference = null;

  private Object repaymentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return repaymentUpdateActionTaskReference
  **/

  public String getRepaymentUpdateActionTaskReference() {
    return repaymentUpdateActionTaskReference;
  }

  public void setRepaymentUpdateActionTaskReference(String repaymentUpdateActionTaskReference) {
    this.repaymentUpdateActionTaskReference = repaymentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

