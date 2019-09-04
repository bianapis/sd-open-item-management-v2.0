package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureControlOutputModel
 */
public class CROpenItemProcedureControlOutputModel   {
  private String openItemProcedureControlActionTaskReference = null;

  private Object openItemProcedureControlActionTaskRecord = null;

  private String openItemProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Open Item Procedure instance control processing service call 
   * @return openItemProcedureControlActionTaskReference
  **/

  public String getOpenItemProcedureControlActionTaskReference() {
    return openItemProcedureControlActionTaskReference;
  }

  public void setOpenItemProcedureControlActionTaskReference(String openItemProcedureControlActionTaskReference) {
    this.openItemProcedureControlActionTaskReference = openItemProcedureControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return openItemProcedureControlActionResponse
  **/

  public String getOpenItemProcedureControlActionResponse() {
    return openItemProcedureControlActionResponse;
  }

  public void setOpenItemProcedureControlActionResponse(String openItemProcedureControlActionResponse) {
    this.openItemProcedureControlActionResponse = openItemProcedureControlActionResponse;
  }


}

