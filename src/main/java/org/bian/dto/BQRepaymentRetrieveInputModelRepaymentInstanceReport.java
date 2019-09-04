package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveInputModelRepaymentInstanceReport
 */
public class BQRepaymentRetrieveInputModelRepaymentInstanceReport   {
  private String repaymentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return repaymentInstanceReportReference
  **/

  public String getRepaymentInstanceReportReference() {
    return repaymentInstanceReportReference;
  }

  public void setRepaymentInstanceReportReference(String repaymentInstanceReportReference) {
    this.repaymentInstanceReportReference = repaymentInstanceReportReference;
  }


}

