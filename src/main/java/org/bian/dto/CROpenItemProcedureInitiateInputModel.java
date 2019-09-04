package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureInitiateInputModelCROpenItemProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureInitiateInputModel
 */
public class CROpenItemProcedureInitiateInputModel   {
  private String openItemManagementServicingSessionReference = null;

  private Object openItemProcedureInitiateActionRecord = null;

  private String openItemProcedureInstanceStatus = null;

  private CROpenItemProcedureInitiateInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return openItemManagementServicingSessionReference
  **/

  public String getOpenItemManagementServicingSessionReference() {
    return openItemManagementServicingSessionReference;
  }

  public void setOpenItemManagementServicingSessionReference(String openItemManagementServicingSessionReference) {
    this.openItemManagementServicingSessionReference = openItemManagementServicingSessionReference;
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

  public CROpenItemProcedureInitiateInputModelCROpenItemProcedureInstanceRecord getCROpenItemProcedureInstanceRecord() {
    return cROpenItemProcedureInstanceRecord;
  }

  public void setCROpenItemProcedureInstanceRecord(CROpenItemProcedureInitiateInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord) {
    this.cROpenItemProcedureInstanceRecord = cROpenItemProcedureInstanceRecord;
  }


}

