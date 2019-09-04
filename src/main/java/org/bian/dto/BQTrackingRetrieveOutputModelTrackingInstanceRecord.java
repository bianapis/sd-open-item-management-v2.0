package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingRetrieveOutputModelTrackingInstanceRecord
 */
public class BQTrackingRetrieveOutputModelTrackingInstanceRecord   {
  private String customerBillingProcedureInstanceReference = null;

  private String customerBillingParty = null;

  private String customerBillingAddress = null;

  private String customerBillingPeriod = null;

  private String customerBillingStatement = null;

  private String customerBillingAmount = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer billing transaction  
   * @return customerBillingProcedureInstanceReference
  **/

  public String getCustomerBillingProcedureInstanceReference() {
    return customerBillingProcedureInstanceReference;
  }

  public void setCustomerBillingProcedureInstanceReference(String customerBillingProcedureInstanceReference) {
    this.customerBillingProcedureInstanceReference = customerBillingProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The billed customer 
   * @return customerBillingParty
  **/

  public String getCustomerBillingParty() {
    return customerBillingParty;
  }

  public void setCustomerBillingParty(String customerBillingParty) {
    this.customerBillingParty = customerBillingParty;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The address the bill was sent to (can be electronic) 
   * @return customerBillingAddress
  **/

  public String getCustomerBillingAddress() {
    return customerBillingAddress;
  }

  public void setCustomerBillingAddress(String customerBillingAddress) {
    this.customerBillingAddress = customerBillingAddress;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The billing period is applicable 
   * @return customerBillingPeriod
  **/

  public String getCustomerBillingPeriod() {
    return customerBillingPeriod;
  }

  public void setCustomerBillingPeriod(String customerBillingPeriod) {
    this.customerBillingPeriod = customerBillingPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The content of the billing statement used in the bill 
   * @return customerBillingStatement
  **/

  public String getCustomerBillingStatement() {
    return customerBillingStatement;
  }

  public void setCustomerBillingStatement(String customerBillingStatement) {
    this.customerBillingStatement = customerBillingStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the customer bill 
   * @return customerBillingAmount
  **/

  public String getCustomerBillingAmount() {
    return customerBillingAmount;
  }

  public void setCustomerBillingAmount(String customerBillingAmount) {
    this.customerBillingAmount = customerBillingAmount;
  }


}

