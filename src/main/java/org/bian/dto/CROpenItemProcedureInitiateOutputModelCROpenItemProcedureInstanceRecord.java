package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureInitiateOutputModelCROpenItemProcedureInstanceRecord
 */
public class CROpenItemProcedureInitiateOutputModelCROpenItemProcedureInstanceRecord   {
  private String repaymentStatement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A statement of repayment transactions made against the item 
   * @return repaymentStatement
  **/

  public String getRepaymentStatement() {
    return repaymentStatement;
  }

  public void setRepaymentStatement(String repaymentStatement) {
    this.repaymentStatement = repaymentStatement;
  }


}

