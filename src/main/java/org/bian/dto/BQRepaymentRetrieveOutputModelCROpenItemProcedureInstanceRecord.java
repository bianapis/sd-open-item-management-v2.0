package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveOutputModelCROpenItemProcedureInstanceRecord
 */
public class BQRepaymentRetrieveOutputModelCROpenItemProcedureInstanceRecord   {
  private String openItemType = null;

  private String openItemDescription = null;

  private String productInstanceReference = null;

  private String partyReference = null;

  private String loanRepaymentSchedule = null;

  private String loanOutstandingBalance = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of open item, typically an overdue payment 
   * @return openItemType
  **/

  public String getOpenItemType() {
    return openItemType;
  }

  public void setOpenItemType(String openItemType) {
    this.openItemType = openItemType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Specific detail of the open item for reference 
   * @return openItemDescription
  **/

  public String getOpenItemDescription() {
    return openItemDescription;
  }

  public void setOpenItemDescription(String openItemDescription) {
    this.openItemDescription = openItemDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated loan account 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer/party responsible 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Payment schedule used for staged payments 
   * @return loanRepaymentSchedule
  **/

  public String getLoanRepaymentSchedule() {
    return loanRepaymentSchedule;
  }

  public void setLoanRepaymentSchedule(String loanRepaymentSchedule) {
    this.loanRepaymentSchedule = loanRepaymentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outstanding balance  
   * @return loanOutstandingBalance
  **/

  public String getLoanOutstandingBalance() {
    return loanOutstandingBalance;
  }

  public void setLoanOutstandingBalance(String loanOutstandingBalance) {
    this.loanOutstandingBalance = loanOutstandingBalance;
  }


}

