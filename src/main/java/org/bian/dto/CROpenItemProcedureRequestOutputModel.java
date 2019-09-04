package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureRequestInputModelCROpenItemProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureRequestOutputModel
 */
public class CROpenItemProcedureRequestOutputModel   {
  private CROpenItemProcedureRequestInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord = null;

  private String openItemProcedureRequestActionTaskReference = null;

  private Object openItemProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get cROpenItemProcedureInstanceRecord
   * @return cROpenItemProcedureInstanceRecord
  **/

  public CROpenItemProcedureRequestInputModelCROpenItemProcedureInstanceRecord getCROpenItemProcedureInstanceRecord() {
    return cROpenItemProcedureInstanceRecord;
  }

  @JsonProperty("cROpenItemProcedureInstanceRecord")
  public void setCROpenItemProcedureInstanceRecord(CROpenItemProcedureRequestInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord) {
    this.cROpenItemProcedureInstanceRecord = cROpenItemProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Open Item Procedure instance request service call 
   * @return openItemProcedureRequestActionTaskReference
  **/

  public String getOpenItemProcedureRequestActionTaskReference() {
    return openItemProcedureRequestActionTaskReference;
  }

  public void setOpenItemProcedureRequestActionTaskReference(String openItemProcedureRequestActionTaskReference) {
    this.openItemProcedureRequestActionTaskReference = openItemProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return openItemProcedureRequestActionTaskRecord
  **/

  public Object getOpenItemProcedureRequestActionTaskRecord() {
    return openItemProcedureRequestActionTaskRecord;
  }

  public void setOpenItemProcedureRequestActionTaskRecord(Object openItemProcedureRequestActionTaskRecord) {
    this.openItemProcedureRequestActionTaskRecord = openItemProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

