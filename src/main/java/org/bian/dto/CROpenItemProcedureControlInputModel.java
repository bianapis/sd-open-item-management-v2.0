package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureControlInputModelOpenItemProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureControlInputModel
 */
public class CROpenItemProcedureControlInputModel   {
  private String openItemManagementServicingSessionReference = null;

  private String openItemProcedureInstanceReference = null;

  private Object openItemProcedureControlActionTaskRecord = null;

  private CROpenItemProcedureControlInputModelOpenItemProcedureControlActionRequest openItemProcedureControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return openItemProcedureControlActionTaskRecord
  **/

  public Object getOpenItemProcedureControlActionTaskRecord() {
    return openItemProcedureControlActionTaskRecord;
  }

  public void setOpenItemProcedureControlActionTaskRecord(Object openItemProcedureControlActionTaskRecord) {
    this.openItemProcedureControlActionTaskRecord = openItemProcedureControlActionTaskRecord;
  }


  /**
   * Get openItemProcedureControlActionRequest
   * @return openItemProcedureControlActionRequest
  **/

  public CROpenItemProcedureControlInputModelOpenItemProcedureControlActionRequest getOpenItemProcedureControlActionRequest() {
    return openItemProcedureControlActionRequest;
  }

  public void setOpenItemProcedureControlActionRequest(CROpenItemProcedureControlInputModelOpenItemProcedureControlActionRequest openItemProcedureControlActionRequest) {
    this.openItemProcedureControlActionRequest = openItemProcedureControlActionRequest;
  }


}

