package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureRequestInputModelCROpenItemProcedureInstanceRecord;
import org.bian.dto.CROpenItemProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureRequestInputModel
 */
public class CROpenItemProcedureRequestInputModel   {
  private String openItemManagementServicingSessionReference = null;

  private String openItemProcedureInstanceReference = null;

  private CROpenItemProcedureRequestInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord = null;

  private Object openItemProcedureRequestActionTaskRecord = null;

  private CROpenItemProcedureRequestInputModelRequestRecordType requestRecordType = null;


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

  public CROpenItemProcedureRequestInputModelCROpenItemProcedureInstanceRecord getCROpenItemProcedureInstanceRecord() {
    return cROpenItemProcedureInstanceRecord;
  }

  public void setCROpenItemProcedureInstanceRecord(CROpenItemProcedureRequestInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord) {
    this.cROpenItemProcedureInstanceRecord = cROpenItemProcedureInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CROpenItemProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CROpenItemProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

