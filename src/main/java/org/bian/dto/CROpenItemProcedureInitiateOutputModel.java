package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureInitiateOutputModelCROpenItemProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureInitiateOutputModel
 */
public class CROpenItemProcedureInitiateOutputModel   {
  private String openItemProcedureInstanceReference = null;

  private String openItemProcedureInitiateActionReference = null;

  private Object openItemProcedureInitiateActionRecord = null;

  private String openItemProcedureInstanceStatus = null;

  private CROpenItemProcedureInitiateOutputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Open Item Procedure instance 
   * @return openItemProcedureInstanceReference
  **/

  public String getOpenItemProcedureInstanceReference() {
    return openItemProcedureInstanceReference;
  }

  public void setOpenItemProcedureInstanceReference(String openItemProcedureInstanceReference) {
    this.openItemProcedureInstanceReference = openItemProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return openItemProcedureInitiateActionReference
  **/

  public String getOpenItemProcedureInitiateActionReference() {
    return openItemProcedureInitiateActionReference;
  }

  public void setOpenItemProcedureInitiateActionReference(String openItemProcedureInitiateActionReference) {
    this.openItemProcedureInitiateActionReference = openItemProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return openItemProcedureInitiateActionRecord
  **/

  public Object getOpenItemProcedureInitiateActionRecord() {
    return openItemProcedureInitiateActionRecord;
  }

  public void setOpenItemProcedureInitiateActionRecord(Object openItemProcedureInitiateActionRecord) {
    this.openItemProcedureInitiateActionRecord = openItemProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Open Item Procedure instance (e.g. initialised, pending, active) 
   * @return openItemProcedureInstanceStatus
  **/

  public String getOpenItemProcedureInstanceStatus() {
    return openItemProcedureInstanceStatus;
  }

  public void setOpenItemProcedureInstanceStatus(String openItemProcedureInstanceStatus) {
    this.openItemProcedureInstanceStatus = openItemProcedureInstanceStatus;
  }


  /**
   * Get cROpenItemProcedureInstanceRecord
   * @return cROpenItemProcedureInstanceRecord
  **/

  public CROpenItemProcedureInitiateOutputModelCROpenItemProcedureInstanceRecord getCROpenItemProcedureInstanceRecord() {
    return cROpenItemProcedureInstanceRecord;
  }

  @JsonProperty("cROpenItemProcedureInstanceRecord")
  public void setCROpenItemProcedureInstanceRecord(CROpenItemProcedureInitiateOutputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord) {
    this.cROpenItemProcedureInstanceRecord = cROpenItemProcedureInstanceRecord;
  }


}

