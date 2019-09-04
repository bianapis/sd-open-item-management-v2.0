package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureUpdateInputModelCROpenItemProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureUpdateInputModel
 */
public class CROpenItemProcedureUpdateInputModel   {
  private String openItemManagementServicingSessionReference = null;

  private String openItemProcedureInstanceReference = null;

  private CROpenItemProcedureUpdateInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord = null;

  private Object openItemProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cROpenItemProcedureInstanceRecord
   * @return cROpenItemProcedureInstanceRecord
  **/

  public CROpenItemProcedureUpdateInputModelCROpenItemProcedureInstanceRecord getCROpenItemProcedureInstanceRecord() {
    return cROpenItemProcedureInstanceRecord;
  }

  public void setCROpenItemProcedureInstanceRecord(CROpenItemProcedureUpdateInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord) {
    this.cROpenItemProcedureInstanceRecord = cROpenItemProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return openItemProcedureUpdateActionTaskRecord
  **/

  public Object getOpenItemProcedureUpdateActionTaskRecord() {
    return openItemProcedureUpdateActionTaskRecord;
  }

  public void setOpenItemProcedureUpdateActionTaskRecord(Object openItemProcedureUpdateActionTaskRecord) {
    this.openItemProcedureUpdateActionTaskRecord = openItemProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

