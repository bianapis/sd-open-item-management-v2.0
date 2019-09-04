package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureUpdateInputModelCROpenItemProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureUpdateOutputModel
 */
public class CROpenItemProcedureUpdateOutputModel   {
  private CROpenItemProcedureUpdateInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord = null;

  private String openItemProcedureUpdateActionTaskReference = null;

  private Object openItemProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cROpenItemProcedureInstanceRecord
   * @return cROpenItemProcedureInstanceRecord
  **/

  public CROpenItemProcedureUpdateInputModelCROpenItemProcedureInstanceRecord getCROpenItemProcedureInstanceRecord() {
    return cROpenItemProcedureInstanceRecord;
  }

  @JsonProperty("cROpenItemProcedureInstanceRecord")
  public void setCROpenItemProcedureInstanceRecord(CROpenItemProcedureUpdateInputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord) {
    this.cROpenItemProcedureInstanceRecord = cROpenItemProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return openItemProcedureUpdateActionTaskReference
  **/

  public String getOpenItemProcedureUpdateActionTaskReference() {
    return openItemProcedureUpdateActionTaskReference;
  }

  public void setOpenItemProcedureUpdateActionTaskReference(String openItemProcedureUpdateActionTaskReference) {
    this.openItemProcedureUpdateActionTaskReference = openItemProcedureUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

