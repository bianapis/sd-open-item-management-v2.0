package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceReportRecord
 */
public class CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceReportRecord   {
  private String openItemProcedureInstanceReportData = null;

  private String openItemProcedureInstanceReportType = null;

  private Object openItemProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return openItemProcedureInstanceReportData
  **/

  public String getOpenItemProcedureInstanceReportData() {
    return openItemProcedureInstanceReportData;
  }

  public void setOpenItemProcedureInstanceReportData(String openItemProcedureInstanceReportData) {
    this.openItemProcedureInstanceReportData = openItemProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return openItemProcedureInstanceReportType
  **/

  public String getOpenItemProcedureInstanceReportType() {
    return openItemProcedureInstanceReportType;
  }

  public void setOpenItemProcedureInstanceReportType(String openItemProcedureInstanceReportType) {
    this.openItemProcedureInstanceReportType = openItemProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return openItemProcedureInstanceReport
  **/

  public Object getOpenItemProcedureInstanceReport() {
    return openItemProcedureInstanceReport;
  }

  public void setOpenItemProcedureInstanceReport(Object openItemProcedureInstanceReport) {
    this.openItemProcedureInstanceReport = openItemProcedureInstanceReport;
  }


}

